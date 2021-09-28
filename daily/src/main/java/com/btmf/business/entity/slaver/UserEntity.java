package com.btmf.business.entity.slaver;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户信息
 * 
 * @author yyh
 * @email yyh@demo.com
 * @date 2021-09-25 22:56:29
 */
@Data
@TableName("user")
public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 自增ID
	 */
	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 工号
	 */
	private String workNum;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 盐值
	 */
	private String saltVal;
	/**
	 * 姓名
	 */
	private String realname;
	/**
	 * 昵称
	 */
	private String nickname;
	/**
	 * 头像
	 */
	private String headImg;
	/**
	 * 手机号码
	 */
	private String mobile;
	/**
	 * 电子邮件
	 */
	private String email;
	/**
	 * 性别（'0-保密','1-男','2-女'）
	 */
	private String gender;
	/**
	 * 渠道ID
	 */
	private Integer channelId;
	/**
	 * 用户类型（'0-自营','1-公司','2-个人'）
	 */
	private String userType;
	/**
	 * 登陆时间
	 */
	private Date loginTime;
	/**
	 * 登陆IP
	 */
	private String loginIp;
	/**
	 * 入职时间
	 */
	private Date entryTime;
	/**
	 * 离职时间
	 */
	private Date exitTime;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改时间
	 */
	private Date updateTime;
	/**
	 * 状态（'ENABLE-启用','DISABLE-禁用','DELETE-删除'）
	 */
	private String status;

}
