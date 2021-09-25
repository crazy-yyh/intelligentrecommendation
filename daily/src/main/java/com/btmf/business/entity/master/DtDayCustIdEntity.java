package com.btmf.business.entity.master;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 当天可推荐客户
 * 
 * @author yyh
 * @email yyh@demo.com
 * @date 2021-09-25 23:03:00
 */
@Data
@TableName("dt_day_cust_id")
public class DtDayCustIdEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 自增ID
	 */
	@TableId
	private Integer id;
	/**
	 * 客户ID
	 */
	private Integer custId;
	/**
	 * 最近营销时间
	 */
	private Date lastTime;
	/**
	 * 
	 */
	private String prov;
	/**
	 * 
	 */
	private String city;
	/**
	 * 
	 */
	private String area;
	/**
	 * 
	 */
	private String address;
	/**
	 * 推荐产品编号
	 */
	private String productId;
	/**
	 * 资质描述
	 */
	private String recommendDesc;
	/**
	 * 客户来源
	 */
	private Integer customerSource;
	/**
	 * 资质评分
	 */
	private Integer qualificationScore;
	/**
	 * 
	 */
	private String phoneCode;
	/**
	 * 号码
	 */
	private Integer phone;
	/**
	 * 短信是否已上传
	 */
	private Integer isUp;
	/**
	 * 营销名义
	 */
	private String marketName;
	/**
	 * 最优产品
	 */
	private String productType;
	/**
	 * 
	 */
	private String phoneCarrierCity;

}
