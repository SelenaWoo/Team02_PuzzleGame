/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.json.Json;
import javax.json.JsonObject;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author User
 */
@Entity
public class User {
    
    @Id @Column(name = "userID") private Integer userId;
    
    private int userID;
    private String email;
    private String userName;
    private String password;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public JsonObject toJson(){
        return (Json.createObjectBuilder()
                    .add("userId", userID)
                    .add("userName", userName )
                    .add("password", password)
                    .add("email", email)
                    .build());
    }

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", userID=" + userID + ", email=" + email + ", userName=" + userName + ", password=" + password + '}';
    }
    
}