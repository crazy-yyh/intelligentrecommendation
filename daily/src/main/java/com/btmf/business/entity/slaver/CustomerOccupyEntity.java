package com.btmf.business.entity.slaver;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 客户占用信息
 * 
 * @author yyh
 * @email yyh@demo.com
 * @date 2021-09-25 22:56:29
 */
@Data
@TableName("customer_occupy")
public class CustomerOccupyEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 自增ID
	 */
	@TableId
	private Integer id;
	/**
	 * 用户ID
	 */
	private Integer userId;
	/**
	 * 用户姓名
	 */
	private String userRealname;
	/**
	 * 订单ID
	 */
	private Integer orderId;
	/**
	 * 客户ID
	 */
	private Integer customerId;
	/**
	 * 占用类型（'0-重点客户','1-营销阶段','2-商机阶段','3-上门阶段','4-异常阶段','5-已出方案阶段'）
	 */
	private String occupyType;
	/**
	 * 过期时间
	 */
	private Date expireTime;
	/**
	 * 创建时间
	 */
	private Date createTime;

}
