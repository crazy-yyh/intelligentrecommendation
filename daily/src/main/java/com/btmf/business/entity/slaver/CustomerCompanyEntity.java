package com.btmf.business.entity.slaver;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 客户公司信息
 * 
 * @author yyh
 * @email yyh@demo.com
 * @date 2021-09-25 22:56:29
 */
@Data
@TableName("customer_company")
public class CustomerCompanyEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 自增ID
	 */
	@TableId
	private Integer id;
	/**
	 * 客户ID
	 */
	private Integer customerId;
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
	 * 是否有营业执照('1-是','2-否')
	 */
	private String isBusinessLicense;
	/**
	 * 营业执照注册时长('1-[0~6个月), 2-[6~12个月), 3-[12个月以上)')
	 */
	private String businessLicenseRegLength;
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
	 * 贷款人身份('1-法人', '2-股东')
	 */
	private String loanIdentity;
	/**
	 * 法人持股占比('1-[0~20%]', '2-[20~25%]', '3-[25~30%]', '4-[30~50%]', '5-[50%以上]')
	 */
	private String corporationStockRatio;
	/**
	 * 股东持股占比('1-[10~20%]', '2-[20~30%]', '3-[30~50%]', '4-[50%以上]')
	 */
	private String shareholderStockRatio;
	/**
	 * 来源('1-营销支持岗', '2-客户经理', '3-测呗(比比特)', '4-测呗(比特铁军)')
	 */
	private String source;
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
