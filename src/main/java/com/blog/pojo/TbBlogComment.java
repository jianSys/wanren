package com.blog.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.lettuce.core.dynamic.annotation.Command;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_blog_comment")
public class TbBlogComment implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_blog_comment.comment_id
     *
     * @mbggenerated
     */
    @TableId
    @TableField("comment_id")
    private Integer commentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_blog_comment.blog_id
     *
     * @mbggenerated
     */
    @TableField("blog_id")
    private Integer blogId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_blog_comment.commentator
     *
     * @mbggenerated
     */
    @TableField("commentator")
    private String commentator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_blog_comment.email
     *
     * @mbggenerated
     */
    @TableField("email")
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_blog_comment.website_url
     *
     * @mbggenerated
     */
    @TableField("website_url")
    private String websiteUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_blog_comment.comment_body
     *
     * @mbggenerated
     */
    @TableField("comment_body")
    private String commentBody;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_blog_comment.comment_create_time
     *
     * @mbggenerated
     */
    @TableField("comment_create_time")
    private Date commentCreateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_blog_comment.commentator_ip
     *
     * @mbggenerated
     */
    @TableField("commentator_ip")
    private String commentatorIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_blog_comment.reply_body
     *
     * @mbggenerated
     */
    @TableField("reply_body")
    private String replyBody;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_blog_comment.reply_create_time
     *
     * @mbggenerated
     */
    @TableField("reply_create_time")
    private Date replyCreateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_blog_comment.comment_status
     *
     * @mbggenerated
     */
    @TableField("comment_status")
    private Integer commentStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_blog_comment.is_deleted
     *
     * @mbggenerated
     */
    @TableField("is_deleted")
    private Integer isDeleted;
}