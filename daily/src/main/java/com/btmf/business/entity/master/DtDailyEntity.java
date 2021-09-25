package com.btmf.business.entity.master;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 智能推荐日报
 * 
 * @author yyh
 * @email yyh@demo.com
 * @date 2021-09-25 23:03:00
 */
@Data
@TableName("dt_daily")
public class DtDailyEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer jobUid;
	/**
	 * 
	 */
	private String jobName;
	/**
	 * 处理号码数
	 */
	private Integer overNum;
	/**
	 * 处理号码进度
	 */
	private String expression;
	/**
	 * 转化率
	 */
	private String rate;
	/**
	 * 转化率排名
	 */
	private String rateDesc;
	/**
	 * 商机数
	 */
	private Integer businessOpportunityNum;
	/**
	 * 氧气贷
	 */
	private Integer 氧气贷;
	/**
	 * 新一贷
	 */
	private Integer 新一贷;
	/**
	 * 兴业消金
	 */
	private Integer 兴业消金;
	/**
	 * 车抵贷
	 */
	private Integer 车抵贷;
	/**
	 * 房抵贷
	 */
	private Integer 房抵贷;
	/**
	 * 税金贷
	 */
	private Integer 税金贷;
	/**
	 * 兴安贷
	 */
	private Integer 兴安贷;
	/**
	 * 纳税AB
	 */
	private Integer 纳税ab;
	/**
	 * AI短信回访
	 */
	private Integer ai短信回访;
	/**
	 * 
	 */
	private Integer 科创贷;
	/**
	 * 职场
	 */
	private String workplace;
	/**
	 * 余数上传数量
	 */
	private Integer upNum;
	/**
	 * 
	 */
	private String city;
	/**
	 * 状态（'ENABLE-启用','DISABLE-禁用','DELETE-删除'）
	 */
	private String status;
	/**
	 * 推荐产品
	 */
	private String productId;
	/**
	 * 擅长产品类型
	 */
	private String productType;
	/**
	 * 等级
	 */
	private String level;
	/**
	 * 是否客服
	 */
	private String customerService;

}
