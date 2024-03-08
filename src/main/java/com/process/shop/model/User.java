package com.process.shop.model;

import lombok.Data;
import java.util.Date;

@Data
public class User {
    private String fullName;
    private Date birthDate;
    private String identificationType;
    private String identification;
    private String phoneNumber;
    private String email;
    private String password;
    private String address;
}
