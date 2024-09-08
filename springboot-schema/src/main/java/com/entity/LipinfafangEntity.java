package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 礼品发放
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-02 17:48:05
 */
@TableName("lipinfafang")
public class LipinfafangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LipinfafangEntity() {
		
	}
	
	public LipinfafangEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 老人账号
	 */
					
	private String laorenzhanghao;
	
	/**
	 * 老人姓名
	 */
					
	private String laorenxingming;
	
	/**
	 * 老人手机
	 */
					
	private String laorenshouji;
	
	/**
	 * 积分
	 */
					
	private String jifen;
	
	/**
	 * 礼品
	 */
					
	private String lipin;
	
	/**
	 * 礼品图片
	 */
					
	private String lipintupian;
	
	/**
	 * 发放时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fafangshijian;
	
	/**
	 * 发放人
	 */
					
	private String fafangren;
	
	/**
	 * 发放事由
	 */
					
	private String fafangshiyou;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：老人账号
	 */
	public void setLaorenzhanghao(String laorenzhanghao) {
		this.laorenzhanghao = laorenzhanghao;
	}
	/**
	 * 获取：老人账号
	 */
	public String getLaorenzhanghao() {
		return laorenzhanghao;
	}
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
	 * 设置：老人手机
	 */
	public void setLaorenshouji(String laorenshouji) {
		this.laorenshouji = laorenshouji;
	}
	/**
	 * 获取：老人手机
	 */
	public String getLaorenshouji() {
		return laorenshouji;
	}
	/**
	 * 设置：积分
	 */
	public void setJifen(String jifen) {
		this.jifen = jifen;
	}
	/**
	 * 获取：积分
	 */
	public String getJifen() {
		return jifen;
	}
	/**
	 * 设置：礼品
	 */
	public void setLipin(String lipin) {
		this.lipin = lipin;
	}
	/**
	 * 获取：礼品
	 */
	public String getLipin() {
		return lipin;
	}
	/**
	 * 设置：礼品图片
	 */
	public void setLipintupian(String lipintupian) {
		this.lipintupian = lipintupian;
	}
	/**
	 * 获取：礼品图片
	 */
	public String getLipintupian() {
		return lipintupian;
	}
	/**
	 * 设置：发放时间
	 */
	public void setFafangshijian(Date fafangshijian) {
		this.fafangshijian = fafangshijian;
	}
	/**
	 * 获取：发放时间
	 */
	public Date getFafangshijian() {
		return fafangshijian;
	}
	/**
	 * 设置：发放人
	 */
	public void setFafangren(String fafangren) {
		this.fafangren = fafangren;
	}
	/**
	 * 获取：发放人
	 */
	public String getFafangren() {
		return fafangren;
	}
	/**
	 * 设置：发放事由
	 */
	public void setFafangshiyou(String fafangshiyou) {
		this.fafangshiyou = fafangshiyou;
	}
	/**
	 * 获取：发放事由
	 */
	public String getFafangshiyou() {
		return fafangshiyou;
	}

}
