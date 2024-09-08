package com.entity.vo;

import com.entity.MeirijiankangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 每日健康
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-02 17:48:05
 */
public class MeirijiankangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 老人姓名
	 */
	
	private String laorenxingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 年龄
	 */
	
	private String nianling;
		
	/**
	 * 体温
	 */
	
	private String tiwen;
		
	/**
	 * 血压
	 */
	
	private String xueya;
		
	/**
	 * 心跳
	 */
	
	private String xintiao;
		
	/**
	 * 健康报告
	 */
	
	private String jiankangbaogao;
		
	/**
	 * 建议
	 */
	
	private String jianyi;
		
	/**
	 * 添加时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tianjiashijian;
				
	
	/**
	 * 设置：老人姓名
	 */
	 
	public void setLaorenxingming(String laorenxingming) {
		this.laorenxingming = laorenxingming;
	}
	
	/**
	 * 获取：老人姓名
	 */
	public String getLaorenxingming() {
		return laorenxingming;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：年龄
	 */
	 
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
		return nianling;
	}
				
	
	/**
	 * 设置：体温
	 */
	 
	public void setTiwen(String tiwen) {
		this.tiwen = tiwen;
	}
	
	/**
	 * 获取：体温
	 */
	public String getTiwen() {
		return tiwen;
	}
				
	
	/**
	 * 设置：血压
	 */
	 
	public void setXueya(String xueya) {
		this.xueya = xueya;
	}
	
	/**
	 * 获取：血压
	 */
	public String getXueya() {
		return xueya;
	}
				
	
	/**
	 * 设置：心跳
	 */
	 
	public void setXintiao(String xintiao) {
		this.xintiao = xintiao;
	}
	
	/**
	 * 获取：心跳
	 */
	public String getXintiao() {
		return xintiao;
	}
				
	
	/**
	 * 设置：健康报告
	 */
	 
	public void setJiankangbaogao(String jiankangbaogao) {
		this.jiankangbaogao = jiankangbaogao;
	}
	
	/**
	 * 获取：健康报告
	 */
	public String getJiankangbaogao() {
		return jiankangbaogao;
	}
				
	
	/**
	 * 设置：建议
	 */
	 
	public void setJianyi(String jianyi) {
		this.jianyi = jianyi;
	}
	
	/**
	 * 获取：建议
	 */
	public String getJianyi() {
		return jianyi;
	}
				
	
	/**
	 * 设置：添加时间
	 */
	 
	public void setTianjiashijian(Date tianjiashijian) {
		this.tianjiashijian = tianjiashijian;
	}
	
	/**
	 * 获取：添加时间
	 */
	public Date getTianjiashijian() {
		return tianjiashijian;
	}
			
}
