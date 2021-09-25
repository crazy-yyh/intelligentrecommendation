package com.btmf.business.entity.master;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 有资质的客户
 * 
 * @author yyh
 * @email yyh@demo.com
 * @date 2021-09-25 23:03:01
 */
@Data
@TableName("dt_seniority")
public class DtSeniorityEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 自增ID
	 */
	private Integer id;
	/**
	 * 客户ID
	 */
	@TableId
	private Integer customerId;
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
	 * 是否黑名单
	 */
	private Integer isBlacklist;
	/**
	 * 状态（'ENABLE-启用','DISABLE-禁用','DELETE-删除'）
	 */
	private String infoStatus;
	/**
	 * 房产类型（'1-商品房','2-商铺','3-其它'）
	 */
	private String houseType;
	/**
	 * 按揭类型（'1-按揭','2-全款'）
	 */
	private String houseMortgageType;
	/**
	 * 房按揭起始年
	 */
	private String mortgageTime;
	/**
	 * 房产价值万元（'1-[0~100)','2-[100~300)','3-[300以上'）
	 */
	private String housePrice;
	/**
	 * 按揭金额元（'1-[0~1500)','2-[1500~3000)','3-[3000~10000）','4-[10000以上）'）
	 */
	private String mortgageMoney;
	/**
	 * 是否主贷人（'1-是','2-否'）
	 */
	private String isLoanSelf;
	/**
	 * 按揭银行（'1-四大行','2-商业银行','3-其它银行'）
	 */
	private String mortgageBank;
	/**
	 * 购车起始年
	 */
	private String buyTime;
	/**
	 * 车辆价值万元（'1-[0~12)','2-[12~30)','3-[30~60)','4-[60以上'）
	 */
	private String carPrice;
	/**
	 * 按揭类型（'1-按揭','2-全款'）
	 */
	private String carMortgageType;
	/**
	 * 年缴金额元（1-[0~2400)、2-[2400~3600)、3-[3600~10000)、4-[10000以上）
	 */
	private String insuranceMoney;
	/**
	 * 是否本人投保（'1-是','2-否'）
	 */
	private String isInsuranceSelf;
	/**
	 * 缴费起始年月
	 */
	private String insuranceTime;
	/**
	 * 月缴金额元（'1-[0~700)','2-[700~1000)','3-[1000~3000)','4-[3000以上'）
	 */
	private String fundMoney;
	/**
	 * 缴费起始年
	 */
	private String fundTime;
	/**
	 * 贷款银行（'1-四大行','2-商业银行','3-其他银行'）
	 */
	private String bank;
	/**
	 * 负债类型（'1-信用贷','2-房抵贷','3-车抵贷','4-税贷','5-担保','6-网贷小贷'）
	 */
	private String product;
	/**
	 * 贷款金额万元（'1-[0~20)','2-[20~50)','3-[50~100)','4-[100以上'）
	 */
	private String loanMoney;
	/**
	 * 纳税等级（A、B、C、D、M）
	 */
	private String taxesLevel;
	/**
	 * 是否法人（'1-是','2-否'）
	 */
	private String isLegalPerson;
	/**
	 * 是否涉诉（'1-是','2-否'）
	 */
	private String isInvolvedInAppeal;
	/**
	 * 法人变更时长月（'1-无变更','2-[0-6)','3-[6~12)','4-[12以上'）
	 */
	private String changeMonth;
	/**
	 * 纳税起始年份
	 */
	private String taxesYear;
	/**
	 * 年纳税金额万元（'1-[0~4)','2-[4~10)','3-[10~50)','4-[50以上'）
	 */
	private String taxesMoney;
	/**
	 * 开票金额万元（'1-[0~150)','2-[150~500)','3-[500以上'）
	 */
	private String billingMoney;
	/**
	 * 流水金额万元（'1-[0~360)','2-[360~1000)','3-[1000以上'）
	 */
	private String turnoverMoney;
	/**
	 * 结息金额元（'1-[0~28)','2-[28~60)','3-[60以上'）
	 */
	private String interestMoney;
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
	 * 有无银行贷款（'0-默认','1-有','2-无'）
	 */
	private String hasBankLoan;
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
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 状态（'ENABLE-启用','DISABLE-禁用','DELETE-删除','sensitive-敏感'）
	 */
	private String status;
	/**
	 * 推荐产品编号
	 */
	private String productId;
	/**
	 * 资质类型
	 */
	private String marketRecommendDesc;
	/**
	 * 资质评分
	 */
	private Integer qualificationScore;
	/**
	 * 最终评级
	 */
	private Integer finalLevel;
	/**
	 * 有无逾期（'0-默认','1-近半年有逾期','2-无','3-半年前有逾期'）
	 */
	private String hasOverdue;
	/**
	 * 信易融额度
	 */
	private Integer preQuota;
	/**
	 * 
	 */
	private String companyName;
	/**
	 * 客户推荐最佳产品
	 */
	private String productType;

}
