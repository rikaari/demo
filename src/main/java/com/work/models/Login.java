package com.work.models;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Login {
    @NotNull
    @NotEmpty(message = "Required")
    private String name;
    @NotNull
    @NotEmpty(message = "Required:4 digits or more")
    @Size(min = 4)
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}