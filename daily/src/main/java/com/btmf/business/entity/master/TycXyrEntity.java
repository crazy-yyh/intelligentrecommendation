package com.btmf.business.entity.master;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 易工程额度
 * 
 * @author yyh
 * @email yyh@demo.com
 * @date 2021-09-25 23:03:00
 */
@Data
@TableName("tyc_xyr")
public class TycXyrEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 自增ID
	 */
	@TableId
	private Integer id;
	/**
	 * 客户公司
	 */
	private String companyName;
	/**
	 * 行业
	 */
	private String industry;
	/**
	 * 客户姓名
	 */
	private String custName;
	/**
	 * 成立时间
	 */
	private String applyYears;
	/**
	 * 省份
	 */
	private String prov;
	/**
	 * 城市
	 */
	private String city;
	/**
	 * 区县
	 */
	private String area;
	/**
	 * 社会统一代码
	 */
	private String socialCode;
	/**
	 * 联系地址
	 */
	private String address;
	/**
	 * 联系号码
	 */
	private String phone;
	/**
	 * 联系号码S
	 */
	private String phones;
	/**
	 * 信用分值
	 */
	private String score;
	/**
	 * 预授信金额
	 */
	private String prequota;
	/**
	 * 近两年中标数
	 */
	private String twoBidNum;
	/**
	 * 近两年中标金额（万元）
	 */
	private String twoBidMoney;
	/**
	 * 近一年中标数
	 */
	private String oneBidNum;
	/**
	 * 近一年中标金额（万元）
	 */
	private String oneBidMoney;
	/**
	 * 资质评级
	 */
	private String qualificationsLevel;
	/**
	 * 查询编码
	 */
	private String hashCode;
	/**
	 * 加密编码
	 */
	private String phoneCode;
	/**
	 * 客户编号
	 */
	private String custCode;
	/**
	 * 是否新增
	 */
	private Integer isNew;
	/**
	 * 
	 */
	private Integer custId;
	/**
	 * 
	 */
	private String tycPhone;
	/**
	 * 
	 */
	private String tycPhones;

}
