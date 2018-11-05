package com.soft1611.jianshu.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@Builder
public class Article {
    @Id
    @GeneratedValue
    @Column(name = "article_id")
    private Integer articleId;
    @Column(nullable = false)
    private String title;
    private String thumbnail;
    private Integer commentsCount;
    private Integer likeCount;
    private String summary;
    private String time;
    @Column(name = "user_id")
    private Integer userId;

}
