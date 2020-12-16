package com.project.web.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
//@Table(schema = {"스키마"}, name = {"table_name"})
public class userInfoDto {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private String id;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "USER_TEL")
    private String userTel;

}
