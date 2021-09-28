package com.btmf.business.entity.master;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;

/**
 * 
 * 
 * @author yyh
 * @email yyh@demo.com
 * @date 2021-09-28 11:23:53
 */
@Data
@TableName("district")
public class DistrictEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键自增
	 */
	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;
	/**
	 * 父类id
	 */
	private Integer pid;
	/**
	 * 城市的名字
	 */
	private String districtName;
	/**
	 * 城市的类型，0是国，1是省，2是市，3是区
	 */
	private Integer type;
	/**
	 * 地区所处的层级
	 */
	private Integer hierarchy;
	/**
	 * 层级序列
	 */
	private String districtSqe;


	@TableField(exist=false)
	private List<DistrictEntity> children;


}
