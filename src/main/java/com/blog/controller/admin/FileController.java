package com.blog.controller.admin;

import com.blog.commons.Result;
import com.blog.pojo.TbBlogFile;
import com.blog.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

/**
 * @program: dal-blog
 * @description: 附属文件地址
 * @author: jian
 * @create: 2021-07-04 22:31
 **/
@Controller
@RequestMapping("/admin/file")
public class FileController {

    @Autowired
    private FileService fileService;

    @GetMapping("toFileList")
    private ModelAndView toFileList(HttpServletRequest request){
        return this.getFileListByPage(request,1);
    }
    @ResponseBody
    @GetMapping("page/{pageNum}")
    private ModelAndView getFileListByPage(HttpServletRequest request,@PathVariable("pageNum") int pageNum){

        Sort sort = new Sort(Sort.Direction.DESC, "createTime");
        Pageable pageable =PageRequest.of(pageNum - 1, Integer.MAX_VALUE,sort);
        Page<TbBlogFile> page = fileService.getFileListByPage(pageable);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/admin/file/fileList");
        mv.addObject("total",page.getTotalElements());
        mv.addObject("fileList",page.getContent());
        return mv;
    }
}