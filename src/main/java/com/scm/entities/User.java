package com.scm.entities;

import java.math.BigInteger;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "user")
@Table(name="users")
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class User {

    @Id
    private BigInteger userId;
    @Column(name = "user_name", nullable = false)
    private String name;
    @Column(unique = true, nullable = false)
    private String email;
    private String password;
    @Column(length = 10000)
    private String about;
    @Column(length = 1000)
    private String profilePic;
    private Integer phoneNumber;
    private int enabled=0;
    private int emailVerified=0;
    private int phoneVerified=0;
    private Providers provider = Providers.SELF;
    private String providerUserId;
}
