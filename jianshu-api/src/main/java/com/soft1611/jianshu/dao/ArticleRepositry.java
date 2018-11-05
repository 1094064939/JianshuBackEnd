package com.soft1611.jianshu.dao;

import com.soft1611.jianshu.entity.Article;
import com.soft1611.jianshu.entity.SysUser;
import com.soft1611.jianshu.entity.vo.ArticleVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ArticleRepositry extends JpaRepository<Article,Integer> {
    @Query("FROM Article  u ORDER BY u.likeCount DESC ")
    List<Article> findHotArticles();
}
