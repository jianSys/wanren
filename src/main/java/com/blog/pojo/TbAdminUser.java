package com.blog.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "tb_admin_user")
@NoArgsConstructor
@AllArgsConstructor
public class TbAdminUser implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_admin_user.admin_user_id
     *
     * @mbggenerated
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "admin_user_id")
    private Integer adminUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_admin_user.login_user_name
     *
     * @mbggenerated
     */
    @Column(name = "login_user_name")
    private String loginUserName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_admin_user.login_password
     *
     * @mbggenerated
     */
    @Column(name = "login_password")
    private String loginPassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_admin_user.nick_name
     *
     * @mbggenerated
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_admin_user.locked
     *
     * @mbggenerated
     */
    @Column(name = "locked")
    private Integer locked;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_admin_user.email
     *
     * @mbggenerated
     */
    @Column(name = "email")
    private String email;
}