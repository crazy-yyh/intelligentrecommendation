package com.btmf.business.entity.slaver;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 订单跟进信息
 * 
 * @author yyh
 * @email yyh@demo.com
 * @date 2021-09-25 22:56:29
 */
@Data
@TableName("order_follow")
public class OrderFollowEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 自增ID
	 */
	@TableId
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
	 * 订单状态（'0-订单创建','10-意向营销','20-已出商机','30-分配上门','40-已出方案','50-已出额','60-已签约','100-已完成'）
	 */
	private String orderStatus;
	/**
	 * 回访类型（'0-默认','1-电销','2-上门')
	 */
	private String visitType;
	/**
	 * 跟进内容
	 */
	private String content;
	/**
	 * 下次跟进
	 */
	private Date nextTime;
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
