package com.soft1611.jianshu.service.impl;

import com.soft1611.jianshu.dao.ArticleRepositry;
import com.soft1611.jianshu.entity.Article;
import com.soft1611.jianshu.entity.vo.ArticleVO;
import com.soft1611.jianshu.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Resource
    private ArticleRepositry articleRepositry;

    @Override
    public List<Article> getHotArticles() {
        return articleRepositry.findHotArticles();
    }
}
