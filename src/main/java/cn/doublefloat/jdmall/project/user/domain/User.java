package cn.doublefloat.jdmall.project.user.domain;

import cn.doublefloat.jdmall.framework.web.domain.BaseEntity;

/**
 * @author 李广帅
 * @date 2020/8/5 10:52 上午
 */
public class User extends BaseEntity {

    /**
     * 用户编号
     */
    private Long userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 手机号码
     */
    private String phonenum;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户状态
     */
    private String status;

    public User() {
    }

    public User(Long userId, String username, String nickname, String phonenum, String password, String status) {
        this.userId = userId;
        this.username = username;
        this.nickname = nickname;
        this.phonenum = phonenum;
        this.password = password;
        this.status = status;
    }


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", nickname='" + nickname + '\'' +
                ", phonenum='" + phonenum + '\'' +
                ", password='" + password + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
