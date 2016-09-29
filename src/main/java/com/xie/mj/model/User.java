package com.xie.mj.model;

import java.util.Date;

/**
 * Created by xie on 16/9/29.
 */
public class User {
    private int id;
    private String username;
    private String password;
    private String nickname;
    private String email;
    private String realname;
    private String pid;
    private String pid_card_thumb1;
    private String pid_card_thumb2;
    private String avatar;
    private String phone;
    private String address;
    private String emergency_contact;
    private String servicer_id;
    private Date deleted_at;
    private Date created_at;
    private Date updated_at;
    private String is_lock;
    private String user_type;
    private String confirmation_code;
    private String confirmed;
    private String remember_token;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPid_card_thumb1() {
        return pid_card_thumb1;
    }

    public void setPid_card_thumb1(String pid_card_thumb1) {
        this.pid_card_thumb1 = pid_card_thumb1;
    }

    public String getPid_card_thumb2() {
        return pid_card_thumb2;
    }

    public void setPid_card_thumb2(String pid_card_thumb2) {
        this.pid_card_thumb2 = pid_card_thumb2;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmergency_contact() {
        return emergency_contact;
    }

    public void setEmergency_contact(String emergency_contact) {
        this.emergency_contact = emergency_contact;
    }

    public String getServicer_id() {
        return servicer_id;
    }

    public void setServicer_id(String servicer_id) {
        this.servicer_id = servicer_id;
    }

    public Date getDeleted_at() {
        return deleted_at;
    }

    public void setDeleted_at(Date deleted_at) {
        this.deleted_at = deleted_at;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public String getIs_lock() {
        return is_lock;
    }

    public void setIs_lock(String is_lock) {
        this.is_lock = is_lock;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getConfirmation_code() {
        return confirmation_code;
    }

    public void setConfirmation_code(String confirmation_code) {
        this.confirmation_code = confirmation_code;
    }

    public String getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed;
    }

    public String getRemember_token() {
        return remember_token;
    }

    public void setRemember_token(String remember_token) {
        this.remember_token = remember_token;
    }
}
