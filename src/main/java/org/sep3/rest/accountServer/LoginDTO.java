package org.sep3.rest.accountServer;

import code.accountsManager.AccountManager;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginDTO {

    @JsonProperty("username")
    private String username;

    @JsonProperty("password")
    private String password;


    public LoginDTO() {
    }

    public LoginDTO(String username, String password) {
        this.username = username;
        this.password = password;
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


}