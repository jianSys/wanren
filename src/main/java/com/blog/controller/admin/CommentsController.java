package com.blog.controller.admin;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: dal-blog
 * @description:
 * @author: jian
 * @create: 2021-06-05 17:59
 **/
@Log4j2
@Controller
@RequestMapping("/admin/comments")
public class CommentsController {

    @GetMapping("toCommentsList")
    private String toCommentsList(){return "/admin/comments/commentsList"; };
}