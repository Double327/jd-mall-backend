package cn.doublefloat.jdmall.common.controller;

import cn.doublefloat.jdmall.common.constants.Constants;
import cn.doublefloat.jdmall.common.utils.IdUtils;
import cn.doublefloat.jdmall.common.utils.VerifyCodeUtils;
import cn.doublefloat.jdmall.common.utils.sign.Base64;
import cn.doublefloat.jdmall.framework.redis.RedisCacheService;
import cn.doublefloat.jdmall.framework.web.domain.AjaxResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @author 李广帅
 * @date 2020/8/11 2:34 下午
 */
@Slf4j
@RestController
public class CaptchaController {

    private static final Integer CAPTCHA_CODE_LEN = 4;

    @Autowired
    private RedisCacheService redisCacheService;

    @GetMapping("/captcha")
    public AjaxResult captcha() {
        String verifyCode = VerifyCodeUtils.generateVerifyCode(CAPTCHA_CODE_LEN);

        // 唯一标识
        String uuid = IdUtils.simpleUUID();
        String verifyKey = Constants.CAPTCHA_CODE_KEY + uuid;

        log.debug("验证码: " + verifyCode);

        // 将验证码存入缓存
        redisCacheService.setCacheObject(verifyKey, verifyCode, 3, TimeUnit.MINUTES);

        // 生成图片
        int width = 111;
        int height = 36;
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        AjaxResult result = AjaxResult.success();
        try {
            VerifyCodeUtils.outputImage(width, height, stream, verifyCode);
            result.put("uuid", uuid);
            result.put("img", Base64.encode(stream.toByteArray()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
