package com.btmf.business.entity.slaver;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 订单商机信息
 * 
 * @author yyh
 * @email yyh@demo.com
 * @date 2021-09-25 22:56:29
 */
@Data
@TableName("order_opportunity")
public class OrderOpportunityEntity implements Serializable {
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
	 * 上门省份
	 */
	private String visitProv;
	/**
	 * 上门城市
	 */
	private String visitCity;
	/**
	 * 上门区县
	 */
	private String visitArea;
	/**
	 * 上门地址
	 */
	private String visitAddress;
	/**
	 * 上门时间
	 */
	private Date visitTime;
	/**
	 * 是否准确 (0:否 1:是)
	 */
	private Integer isExact;
	/**
	 * 是否更换 (0:否 1:是)
	 */
	private Integer isContinue;
	/**
	 * 渠道ID
	 */
	private Integer channelId;
	/**
	 * 商机分类（'A','B','C'）
	 */
	private String type;
	/**
	 * 商机来源（'0-创建','1-异常','2-求助'）
	 */
	private String source;
	/**
	 * 来源ID
	 */
	private Integer sourceId;
	/**
	 * 分配方式（'0-默认','1-系统','2-人工'）
	 */
	private String allotMethod;
	/**
	 * 分配状态（'0-未分配','1-已分配'）
	 */
	private String allotStatus;
	/**
	 * 分配时间
	 */
	private Date allotTime;
	/**
	 * 营销方式（'0-默认','1-非独立营销','2-独立营销','3-给外渠'）
	 */
	private String marketMethod;
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
