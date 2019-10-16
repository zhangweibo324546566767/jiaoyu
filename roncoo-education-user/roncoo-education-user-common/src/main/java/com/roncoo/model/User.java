package com.roncoo.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户基本信息
 *
 * @author wujing
 */
@Data
@Accessors(chain = true)
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	private Integer id;

	/**
	 * 状态(1:正常，0:禁用)
	 */
	private Integer status;

    private String account;

    private String password;

    private Integer sex;

    private Integer age;

    private Integer deptId;

    private Integer  provinceCode;

    private Integer cityCode;



}
