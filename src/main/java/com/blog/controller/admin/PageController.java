package com.blog.controller.admin;

import cn.hutool.json.JSONUtil;
import com.blog.commons.Result;
import com.blog.pojo.TbBlog;
import com.blog.service.PageService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @ProjectName: dal-blog
 * @ClassName: PageController
 * @Author: jian
 * @Description: 页面操作
 * @Date: 2021/6/29 15:47
 * @Version: 1.0
 */
@Log4j2
@Controller
@RequestMapping("/admin")
public class PageController {

    @Autowired
    private PageService pageService;
    @GetMapping("toPageAdd")
    private String toPageAdd(){
        return "/admin/page/pageAdd";
    }

    @GetMapping("toPageForm")
    private String toPageForm(){
        return "/admin/page/pageForm";
    }

    @PostMapping("savePage")
    @ResponseBody
    private Result saveArticle(@RequestBody TbBlog tbBlogEntity) {
        log.info("===============保存页面的入参为===========[{}]", JSONUtil.parse(tbBlogEntity));
        try{
            TbBlog save = pageService.savePage(tbBlogEntity);
            return new Result(0, "成功", save);
        }catch (Exception e){
            log.error("=====================保存页面信息异常=============",e);
            return new Result(500, "失败");
        }
    }
}