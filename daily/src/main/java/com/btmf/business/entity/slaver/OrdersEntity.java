package com.btmf.business.entity.slaver;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 订单主表信息
 * 
 * @author yyh
 * @email yyh@demo.com
 * @date 2021-09-25 22:56:29
 */
@Data
@TableName("orders")
public class OrdersEntity implements Serializable {
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
	 * 客户姓名
	 */
	private String customerName;
	/**
	 * 客户地址
	 */
	private String customerAddress;
	/**
	 * 客户坐标
	 */
	private String customerCoordinate;
	/**
	 * 订单来源（'0-默认','1-AI','2-短信','3-回访','4-人工推荐','5-智能推荐','6-转介绍','7-公众号','8-合作伙伴','9-新媒体','10-测呗','99-其他'）
	 */
	private String orderSource;
	/**
	 * 订单类型（'0-默认','1-内部','2-外部'）
	 */
	private String orderType;
	/**
	 * 订单状态（'0-订单创建','10-意向营销','20-已出商机','30-分配上门','40-已出方案','50-已出额','60-已签约','100-已完成【没用】','-100-已结束【没用】'）
	 */
	private String orderStatus;
	/**
	 * 开始时间
	 */
	private Date startTime;
	/**
	 * 完成时间
	 */
	private Date endTime;
	/**
	 * 是否完成 0:否 1:是
	 */
	private Integer isFinished;
	/**
	 * 是否确认意向
	 */
	private Integer isIntention;
	/**
	 * 意向确认时间
	 */
	private Date intentionTime;
	/**
	 * 分配次数
	 */
	private Integer dispatchCount;
	/**
	 * 分配时间
	 */
	private Date dispatchTime;
	/**
	 * 是否产品方案营销
	 */
	private Integer isProductMarketing;
	/**
	 * 产品营销方案时间
	 */
	private Date productMarketingTime;
	/**
	 * 是否出额
	 */
	private Integer isQuota;
	/**
	 * 出额时间
	 */
	private Date quotaTime;
	/**
	 * 是否签约
	 */
	private Integer isSign;
	/**
	 * 签约时间
	 */
	private Date signTime;
	/**
	 * 是否到账
	 */
	private Integer isAccount;
	/**
	 * 到账时间
	 */
	private Date accountTime;
	/**
	 * 是否贷后
	 */
	private Integer isAfterLoan;
	/**
	 * 贷后时间
	 */
	private Date afterLoanTime;
	/**
	 * 是否异常
	 */
	private Integer isException;
	/**
	 * 异常时间
	 */
	private Date exceptionTime;
	/**
	 * 营销名义
	 */
	private String marketName;
	/**
	 * 营销详细内容
	 */
	private String marketRecommendDesc;
	/**
	 * 渠道ID
	 */
	private Integer channelId;
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
