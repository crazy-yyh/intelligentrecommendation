package com.btmf.business.entity.slaver;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 客户信息表
 * 
 * @author yyh
 * @email yyh@demo.com
 * @date 2021-09-25 22:56:29
 */
@Data
@TableName("customer_info")
public class CustomerInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 自增ID
	 */
	@TableId
	private Integer id;
	/**
	 * 客户编号
	 */
	private String custCode;
	/**
	 * 客户姓名
	 */
	private String custName;
	/**
	 * 客户公司
	 */
	private String companyName;
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
	 * 乡镇街道
	 */
	private String town;
	/**
	 * 联系地址
	 */
	private String address;
	/**
	 * 坐标位置
	 */
	private String coordinate;
	/**
	 * 联系人姓名
	 */
	private String contactName;
	/**
	 * 联系人生日
	 */
	private String contactBirthday;
	/**
	 * 联系人户籍
	 */
	private String contactBirthplace;
	/**
	 * 成立时间
	 */
	private Date applyTime;
	/**
	 * 成立年限
	 */
	private Integer applyLong;
	/**
	 * 社会统一代码
	 */
	private String socialCode;
	/**
	 * 注册资本_金额
	 */
	private BigDecimal registCapital;
	/**
	 * 注册资本_描述
	 */
	private String registCapitalDesc;
	/**
	 * 经营范围
	 */
	private String bussScope;
	/**
	 * 名单来源
	 */
	private String source;
	/**
	 * 查询编码
	 */
	private String hashCode;
	/**
	 * 加密编码
	 */
	private String phoneCode;
	/**
	 * 联系号码S
	 */
	private String phones;
	/**
	 * 联系号码
	 */
	private String phone;
	/**
	 * 未知
	 */
	private Integer type;
	/**
	 * 是否黑名单
	 */
	private Integer isBlacklist;
	/**
	 * 是否公开允许访问
	 */
	private Integer isWebPublic;
	/**
	 * 意向评分
	 */
	private Double intentionScore;
	/**
	 * 资质评分
	 */
	private Double seniorityScore;
	/**
	 * 价值评分
	 */
	private Double valuableScore;
	/**
	 * 综合评分
	 */
	private Double multipleScore;
	/**
	 * 推荐强度
	 */
	private Integer recoIntensity;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 状态（'ENABLE-启用','DISABLE-禁用','DELETE-删除'）
	 */
	private String status;

}
