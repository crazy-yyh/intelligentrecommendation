package com.btmf.business.entity.slaver;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 订单意向营销信息
 * 
 * @author yyh
 * @email yyh@demo.com
 * @date 2021-09-25 22:56:29
 */
@Data
@TableName("order_marketing")
public class OrderMarketingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 自增ID
	 */
	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;
	/**
	 * 订单ID
	 */
	private Integer orderId;
	/**
	 * 客户ID
	 */
	private Integer customerId;
	/**
	 * 用户ID
	 */
	private Integer userId;
	/**
	 * 用户姓名
	 */
	private String userRealname;
	/**
	 * 用户意见
	 */
	private String userSuggest;
	/**
	 * 资质类型（'0-默认','1-资质优良','2-资质一般','3-资质不确定','4-无资质','5-黑户'）
	 */
	private String naturalType;
	/**
	 * 接通状态（'0-默认','1-未接通1次','2-未接通2次','3-未接通3次','4-已接通'）
	 */
	private String connectStatus;
	/**
	 * 微信状态（'0-默认','1-已通过','2-未通过','3-未添加'）
	 */
	private String wechatStatus;
	/**
	 * 配合情况（'0-默认','11-可上门','12-待跟进','13-无法上门'）
	 */
	private String matcheStatus;
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
