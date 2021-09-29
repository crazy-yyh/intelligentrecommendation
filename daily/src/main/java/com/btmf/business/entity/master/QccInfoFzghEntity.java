package com.btmf.business.entity.master;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 黑浙福广

 * 
 * @author yyh
 * @email yyh@demo.com
 * @date 2021-09-29 11:09:54
 */
@Data
@TableName("qcc_info_fzgh")
public class QccInfoFzghEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private String rowkey;
	/**
	 * 自增ID
	 */
	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;
	/**
	 * 客户公司
	 */
	private String companyName;
	/**
	 * 经营状态
	 */
	private String regstatus;
	/**
	 * 客户姓名
	 */
	private String custName;
	/**
	 * 注册资本_金额
	 */
	private Integer registCapital;
	/**
	 * 注册资本_描述
	 */
	private String registCapitalDesc;
	/**
	 * 实缴资本
	 */
	private String trueCapitalDesc;
	/**
	 * 成立时间
	 */
	private String applyTime;
	/**
	 * 核准时间
	 */
	private String ratifyTime;
	/**
	 * 营业期限
	 */
	private String timeEnd;
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
	 * 纳税人识别号
	 */
	private String taxnumber;
	/**
	 * 注册号
	 */
	private String registrationNum;
	/**
	 * 组织机构代码
	 */
	private String organizerCode;
	/**
	 * 参保人数
	 */
	private String insuredNum;
	/**
	 * 公司类型
	 */
	private String companytype;
	/**
	 * 所属行业
	 */
	private String industry;
	/**
	 * 曾用名
	 */
	private String oldCompanyName;
	/**
	 * 联系地址
	 */
	private String address;
	/**
	 * 最新年报地址
	 */
	private String newAddress;
	/**
	 * 网址
	 */
	private String web;
	/**
	 * 联系号码
	 */
	private String phone;
	/**
	 * 联系号码S
	 */
	private String phones;
	/**
	 * 邮箱
	 */
	private String custEmail;
	/**
	 * 邮箱
	 */
	private String otherEmail;
	/**
	 * 经营范围
	 */
	private String bussScope;
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
	 * 错误原因
	 */
	private String wrongMsg;
	/**
	 * 
	 */
	private Integer custId;
	/**
	 * 
	 */
	private String englishCompanyName;

}
