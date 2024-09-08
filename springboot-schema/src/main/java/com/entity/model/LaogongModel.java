package com.entity.model;

import com.entity.LaogongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 劳工
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-02 17:48:05
 */
public class LaogongModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 年龄
	 */
	
	private String nianling;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 工作年龄
	 */
	
	private String gongzuonianling;
		
	/**
	 * 专长
	 */
	
	private String zhuanzhang;
		
	/**
	 * 劳工介绍
	 */
	
	private String laogongjieshao;
				
	
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
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：工作年龄
	 */
	 
	public void setGongzuonianling(String gongzuonianling) {
		this.gongzuonianling = gongzuonianling;
	}
	
	/**
	 * 获取：工作年龄
	 */
	public String getGongzuonianling() {
		return gongzuonianling;
	}
				
	
	/**
	 * 设置：专长
	 */
	 
	public void setZhuanzhang(String zhuanzhang) {
		this.zhuanzhang = zhuanzhang;
	}
	
	/**
	 * 获取：专长
	 */
	public String getZhuanzhang() {
		return zhuanzhang;
	}
				
	
	/**
	 * 设置：劳工介绍
	 */
	 
	public void setLaogongjieshao(String laogongjieshao) {
		this.laogongjieshao = laogongjieshao;
	}
	
	/**
	 * 获取：劳工介绍
	 */
	public String getLaogongjieshao() {
		return laogongjieshao;
	}
			
}
