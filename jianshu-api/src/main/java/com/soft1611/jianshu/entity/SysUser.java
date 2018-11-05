package com.soft1611.jianshu.entity;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * SysUser Entity Class
 *
 * @author mqxu
 * 2018.10.21
 * DO
 */
@Entity
@Data
@Builder
public class SysUser {
    @Id
    @GeneratedValue
    private Integer userId;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private List<Article> articles;

    private String password;
    private String nickname;
    private String avatar;
    private String description;
    private Integer wordsCount;
    private Integer likeCount;

}
