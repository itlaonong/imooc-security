package com.imooc.security.core.social.qq.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QQUserInfo {
    /**
     * 	返回码
     */
    private String ret;
    /**
     * 如果ret<0，会有相应的错误信息提示，返回数据全部用UTF-8编码。
     */
    private String msg;
    /**
     *
     */
    private String openId;
    /**
     * 不知道什么东西，文档上没写，但是实际api返回里有。
     */
    @JsonProperty("is_lost")
    private String isLost;
    /**
     * 省(直辖市)
     */
    private String province;
    /**
     * 市(直辖市区)
     */
    private String city;
    /**
     * 出生年月
     */
    private String year;
    /**
     * 	用户在QQ空间的昵称。
     */
    private String nickname;
    /**
     * 	大小为30×30像素的QQ空间头像URL。
     */
    @JsonProperty("figureurl")
    private String figureUrl;
    /**
     * 	大小为50×50像素的QQ空间头像URL。
     */
    @JsonProperty("figureurl_1")
    private String figureUrl_1;
    /**
     * 	大小为100×100像素的QQ空间头像URL。
     */
    @JsonProperty("figureurl_2")
    private String figureUrl_2;
    /**
     * 	大小为40×40像素的QQ头像URL。
     */
    @JsonProperty("figureurl_qq_1")
    private String figureUrlQQ_1;
    /**
     * 	大小为100×100像素的QQ头像URL。需要注意，不是所有的用户都拥有QQ的100×100的头像，但40×40像素则是一定会有。
     */
    @JsonProperty("figureurl_qq_2")
    private String figureUrlQQ_2;
    /**
     * 	性别。 如果获取不到则默认返回”男”
     */
    private String gender;
    /**
     * 	标识用户是否为黄钻用户（0：不是；1：是）。
     */
    @JsonProperty("is_yellow_vip")
    private String isYellowVip;
    /**
     * 	标识用户是否为黄钻用户（0：不是；1：是）
     */
    private String vip;
    /**
     * 	黄钻等级
     */
    @JsonProperty("yellow_vip_level")
    private String yellowVipLevel;
    /**
     * 	黄钻等级
     */
    private String level;
    /**
     * 标识是否为年费黄钻用户（0：不是； 1：是）
     */
    @JsonProperty("is_yellow_year_vip")
    private String isYellowYearVip;

    public String getRet() {
        return ret;
    }

    public void setRet(String ret) {
        this.ret = ret;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getIsLost() {
        return isLost;
    }

    public void setIsLost(String isLost) {
        this.isLost = isLost;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFigureUrl() {
        return figureUrl;
    }

    public void setFigureUrl(String figureUrl) {
        this.figureUrl = figureUrl;
    }

    public String getFigureUrl_1() {
        return figureUrl_1;
    }

    public void setFigureUrl_1(String figureUrl_1) {
        this.figureUrl_1 = figureUrl_1;
    }

    public String getFigureUrl_2() {
        return figureUrl_2;
    }

    public void setFigureUrl_2(String figureUrl_2) {
        this.figureUrl_2 = figureUrl_2;
    }

    public String getFigureUrlQQ_1() {
        return figureUrlQQ_1;
    }

    public void setFigureUrlQQ_1(String figureUrlQQ_1) {
        this.figureUrlQQ_1 = figureUrlQQ_1;
    }

    public String getFigureUrlQQ_2() {
        return figureUrlQQ_2;
    }

    public void setFigureUrlQQ_2(String figureUrlQQ_2) {
        this.figureUrlQQ_2 = figureUrlQQ_2;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIsYellowVip() {
        return isYellowVip;
    }

    public void setIsYellowVip(String isYellowVip) {
        this.isYellowVip = isYellowVip;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public String getYellowVipLevel() {
        return yellowVipLevel;
    }

    public void setYellowVipLevel(String yellowVipLevel) {
        this.yellowVipLevel = yellowVipLevel;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getIsYellowYearVip() {
        return isYellowYearVip;
    }

    public void setIsYellowYearVip(String isYellowYearVip) {
        this.isYellowYearVip = isYellowYearVip;
    }
}
