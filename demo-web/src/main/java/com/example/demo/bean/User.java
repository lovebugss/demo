package com.example.demo.bean;/**
 * Created by renjp on 2018/11/16.
 */

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author renjp
 * @Date 2018/11/16 17:47
 * @Version 1.0
 */
@Entity
@Table(name = "user")
public class User {
    private String username;
    private String password;

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
}
