package com.soft1611.jianshu.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ArticleVO {
    private Integer articleId;
    private String title;
    private String summary;
    private String thumbnail;
    private Integer commentsCount;
    private Integer likesCount;
    private String time;
    private Integer userId;
    private String nickname;
}
