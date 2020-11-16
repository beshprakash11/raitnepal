package com.raitnepal.raitnepal.model;

import javax.persistence.*;

@Entity
@Table(name = "AdminUser")
public class AdminUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "middle_name")
    private String middleName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email_address")
    private String emailAddress;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "admin_password")
    private String adminPassword;
    @Column(name = "mobile_number")
    private String mobileNumber;
    @Column(name = "street_name")
    private String streetName;
    @Column(name = "area_location")
    private String areaLocation;
    @Column(name = "city_name")
    private String cityName;
    private String adminPosition;
    @Column(name = "admin_roles")
    private String adminRoles;

    public AdminUser(){}




}
