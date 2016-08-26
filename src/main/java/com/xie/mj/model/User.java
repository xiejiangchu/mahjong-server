package com.xie.mj.model;

import java.util.Date;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.id
     *
     * @mbggenerated Fri Aug 26 08:27:22 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.name
     *
     * @mbggenerated Fri Aug 26 08:27:22 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.email
     *
     * @mbggenerated Fri Aug 26 08:27:22 CST 2016
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.password
     *
     * @mbggenerated Fri Aug 26 08:27:22 CST 2016
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.account_balance
     *
     * @mbggenerated Fri Aug 26 08:27:22 CST 2016
     */
    private Double accountBalance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.remember_token
     *
     * @mbggenerated Fri Aug 26 08:27:22 CST 2016
     */
    private String rememberToken;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.created_at
     *
     * @mbggenerated Fri Aug 26 08:27:22 CST 2016
     */
    private Date createdAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.updated_at
     *
     * @mbggenerated Fri Aug 26 08:27:22 CST 2016
     */
    private Date updatedAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.id
     *
     * @return the value of users.id
     * @mbggenerated Fri Aug 26 08:27:22 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.id
     *
     * @param id the value for users.id
     * @mbggenerated Fri Aug 26 08:27:22 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.name
     *
     * @return the value of users.name
     * @mbggenerated Fri Aug 26 08:27:22 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.name
     *
     * @param name the value for users.name
     * @mbggenerated Fri Aug 26 08:27:22 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.email
     *
     * @return the value of users.email
     * @mbggenerated Fri Aug 26 08:27:22 CST 2016
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.email
     *
     * @param email the value for users.email
     * @mbggenerated Fri Aug 26 08:27:22 CST 2016
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.password
     *
     * @return the value of users.password
     * @mbggenerated Fri Aug 26 08:27:22 CST 2016
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.password
     *
     * @param password the value for users.password
     * @mbggenerated Fri Aug 26 08:27:22 CST 2016
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.account_balance
     *
     * @return the value of users.account_balance
     * @mbggenerated Fri Aug 26 08:27:22 CST 2016
     */
    public Double getAccountBalance() {
        return accountBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.account_balance
     *
     * @param accountBalance the value for users.account_balance
     * @mbggenerated Fri Aug 26 08:27:22 CST 2016
     */
    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.remember_token
     *
     * @return the value of users.remember_token
     * @mbggenerated Fri Aug 26 08:27:22 CST 2016
     */
    public String getRememberToken() {
        return rememberToken;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.remember_token
     *
     * @param rememberToken the value for users.remember_token
     * @mbggenerated Fri Aug 26 08:27:22 CST 2016
     */
    public void setRememberToken(String rememberToken) {
        this.rememberToken = rememberToken == null ? null : rememberToken.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.created_at
     *
     * @return the value of users.created_at
     * @mbggenerated Fri Aug 26 08:27:22 CST 2016
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.created_at
     *
     * @param createdAt the value for users.created_at
     * @mbggenerated Fri Aug 26 08:27:22 CST 2016
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.updated_at
     *
     * @return the value of users.updated_at
     * @mbggenerated Fri Aug 26 08:27:22 CST 2016
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.updated_at
     *
     * @param updatedAt the value for users.updated_at
     * @mbggenerated Fri Aug 26 08:27:22 CST 2016
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}