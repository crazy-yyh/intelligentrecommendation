package com.btmf.business.entity.master;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 厦门国际银行预授信额度
 * 
 * @author yyh
 * @email yyh@demo.com
 * @date 2021-09-25 23:03:00
 */
@Data
@TableName("credit_line")
public class CreditLineEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 自增ID
	 */
	@TableId
	private Integer id;
	/**
	 * 客户公司
	 */
	private String companyName;
	/**
	 * 信用分值
	 */
	private String score;
	/**
	 * 预授信金额
	 */
	private String prequota;
	/**
	 * 信用历史得分
	 */
	private String credithistoryscore;
	/**
	 * 企业背景得分
	 */
	private String enterprisebackgroundscore;
	/**
	 * 行业实力得分
	 */
	private String industrystrengthscore;
	/**
	 * 创新能力得分
	 */
	private String innovationabilityscore;
	/**
	 * 运营状况评分
	 */
	private String operationsituationscore;
	/**
	 * 履约行为得分
	 */
	private String tradescore;
	/**
	 * 
	 */
	private String msg;
	/**
	 * 
	 */
	private String prov;
	/**
	 * 
	 */
	private Integer custId;
	/**
	 * 
	 */
	private String city;
	/**
	 * 
	 */
	private String area;
	/**
	 * 工程企信贷额度
	 */
	private String ycPrequota;
	/**
	 * 企信贷信用分值
	 */
	private String ycScore;
	/**
	 * 
	 */
	private Integer bhquota;

}
