package com.jeong.sports.api;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="\"user\"")
public class User {
    @Id
    @GeneratedValue(generator="system-uuid", strategy= GenerationType.AUTO)
    @GenericGenerator(name="system-uuid", strategy="uuid")
    private String id;
    private String username;
    private String email;
    private String password;

    public User() {}

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
