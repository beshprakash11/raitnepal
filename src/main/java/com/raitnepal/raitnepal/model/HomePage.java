package com.raitnepal.raitnepal.model;

import javax.persistence.*;

@Entity
@Table(name = "homepage")
public class HomePage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "home_title")
    private String homeTitle;
    @Column(name = "home_body")
    private String homeBody;
    @Column(name = "subhome_body")
    private String subhomeBody;
    @Column(name = "post_datetime")
    private String postDatetime;
    @Column(name = "update_datetime")
    private String updateDatetime;
    @Column(name = "post_auther")
    private String postAuther;
}
