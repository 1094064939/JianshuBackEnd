package com.soft1611.jianshu.service;

import com.soft1611.jianshu.entity.Article;
import com.soft1611.jianshu.entity.vo.ArticleVO;

import java.util.List;

public interface ArticleService {
    List<Article> getHotArticles();
}
