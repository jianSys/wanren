package com.blog.controller.blog;

import com.blog.commons.Result;
import com.blog.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @ProjectName: springboot
 * @ClassName: BlogController
 * @Author: jian
 * @Description:
 * @Date: 2021/5/26 17:18
 * @Version: 1.0
 */
@Controller
public class BlogController {
   /* @GetMapping({"","/","index"})
    private String toIndex(){
        return "/blog/index";
    }*/

   @Autowired
   private AdminService adminService;

    @GetMapping({"","/","index"})
    private ModelAndView index(HttpServletRequest request,
                               HttpServletResponse response){
        Map<String, Object> site = adminService.getWebSite();
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/blog/index");
        mv.addObject("logo","jian");
        mv.addObject("siteName",site.get("websiteName"));
        mv.addObject("websiteDescription",site.get("websiteDescription"));
        return mv;
    }
    @GetMapping("article")
    private String toArticle(){
        return "/blog/article";
    }
    @GetMapping("read")
    private String toRead(){
        return "/blog/read";
    }
}
