package com.ohgiraffers.userservice.aggregate;

import jakarta.persistence.*;
import lombok.Data;
import org.modelmapper.internal.bytebuddy.dynamic.loading.InjectionClassLoader;

@Data
@Entity
@Table(name = "tbl_user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long id;

    @Column(nullable = false, length = 80, unique = true)
    private String email;

    @Column(nullable = false, length = 21)
    private String name;

    @Column(nullable = false, unique = true)
    private String userId;

    @Column(nullable = false, unique = true)
    private String encryptedPwd;
}
