package com.entity.view;

import com.entity.FuwugoumaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 服务购买
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-02 17:48:05
 */
@TableName("fuwugoumai")
public class FuwugoumaiView  extends FuwugoumaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FuwugoumaiView(){
	}
 
 	public FuwugoumaiView(FuwugoumaiEntity fuwugoumaiEntity){
 	try {
			BeanUtils.copyProperties(this, fuwugoumaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
