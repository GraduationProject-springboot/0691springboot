package com.entity.vo;

import com.entity.ShangpinjinhuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 商品进货
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-02 17:48:05
 */
public class ShangpinjinhuoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 商品名称
	 */
	
	private String shangpinmingcheng;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 进货单价
	 */
	
	private Integer jinhuodanjia;
		
	/**
	 * 进货总价
	 */
	
	private String jinhuozongjia;
		
	/**
	 * 进货时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jinhuoshijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：商品名称
	 */
	 
	public void setShangpinmingcheng(String shangpinmingcheng) {
		this.shangpinmingcheng = shangpinmingcheng;
	}
	
	/**
	 * 获取：商品名称
	 */
	public String getShangpinmingcheng() {
		return shangpinmingcheng;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：进货单价
	 */
	 
	public void setJinhuodanjia(Integer jinhuodanjia) {
		this.jinhuodanjia = jinhuodanjia;
	}
	
	/**
	 * 获取：进货单价
	 */
	public Integer getJinhuodanjia() {
		return jinhuodanjia;
	}
				
	
	/**
	 * 设置：进货总价
	 */
	 
	public void setJinhuozongjia(String jinhuozongjia) {
		this.jinhuozongjia = jinhuozongjia;
	}
	
	/**
	 * 获取：进货总价
	 */
	public String getJinhuozongjia() {
		return jinhuozongjia;
	}
				
	
	/**
	 * 设置：进货时间
	 */
	 
	public void setJinhuoshijian(Date jinhuoshijian) {
		this.jinhuoshijian = jinhuoshijian;
	}
	
	/**
	 * 获取：进货时间
	 */
	public Date getJinhuoshijian() {
		return jinhuoshijian;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
