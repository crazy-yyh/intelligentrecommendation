package com.btmf.business.entity.slaver;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 客户资质信息
 * 
 * @author yyh
 * @email yyh@demo.com
 * @date 2021-09-28 14:29:48
 */
@Data
@TableName("customer_seniority")
public class CustomerSeniorityEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 自增ID
	 */
	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;
	/**
	 * 客户ID
	 */
	private Integer customerId;
	/**
	 * 有无房产（'0-默认','1-有','2-无'）
	 */
	private String hasHouse;
	/**
	 * 有无车辆（'0-默认','1-有','2-无'）
	 */
	private String hasCar;
	/**
	 * 有无保单（'0-默认','1-有','2-无'）
	 */
	private String hasInsurance;
	/**
	 * 有无公积金（'0-默认','1-有','2-无'）
	 */
	private String hasHouseFund;
	/**
	 * 有无网贷（'0-默认','1-有','2-无'）
	 */
	private String hasNetLoan;
	/**
	 * 有无对外担保（'0-默认','1-有','2-无'）
	 */
	private String hasGuarantee;
	/**
	 * 有无逾期（'0-默认','1-近半年有逾期','2-无','3-半年前有逾期'）
	 */
	private String hasOverdue;
	/**
	 * 有无银行贷款（'0-默认','1-有','2-无'）
	 */
	private String hasBankLoan;
	/**
	 * 是否按揭房（'0-默认','1-是','2-否'）
	 */
	private String isHouseMortgage;
	/**
	 * 是否按揭车（'0-默认','1-是','2-否'）
	 */
	private String isCarMortgage;
	/**
	 * 是否白户（'0-默认','1-是','2-否'）
	 */
	private String isWhite;
	/**
	 * 是否黑户（'0-默认','1-是','2-否'）
	 */
	private String isBlack;
	/**
	 * 是否已无产品可做（'0-默认','1-是','2-否'）
	 */
	private String isNotProduct;
	/**
	 * 按揭金额-房
	 */
	private BigDecimal houseMortgageMoney;
	/**
	 * 车辆价值
	 */
	private BigDecimal carPrice;
	/**
	 * 按揭金额-车
	 */
	private BigDecimal carMortgageMoney;
	/**
	 * 年缴金额-保险
	 */
	private BigDecimal insuranceMoney;
	/**
	 * 月缴金额-公积金
	 */
	private BigDecimal houseFundMoney;
	/**
	 * 信用卡额度
	 */
	private BigDecimal creditCardMoney;
	/**
	 * 信用卡使用率
	 */
	private Double creditCardUse;
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
