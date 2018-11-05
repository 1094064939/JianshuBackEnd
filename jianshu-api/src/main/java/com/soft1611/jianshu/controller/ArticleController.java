package com.soft1611.jianshu.controller;

import com.soft1611.jianshu.entity.Article;
import com.soft1611.jianshu.entity.vo.ArticleVO;
import com.soft1611.jianshu.service.ArticleService;
import com.soft1611.jianshu.utils.ResponseUtil;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/article")
@CrossOrigin("http://localhost")
public class ArticleController {
    @Resource
    private ArticleService articleService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseUtil getAll() {
        return new ResponseUtil(0, "get hot users!", articleService.getHotArticles());
    }
}
