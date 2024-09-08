package com.entity.view;

import com.entity.ShangpinjinhuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 商品进货
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-02 17:48:05
 */
@TableName("shangpinjinhuo")
public class ShangpinjinhuoView  extends ShangpinjinhuoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShangpinjinhuoView(){
	}
 
 	public ShangpinjinhuoView(ShangpinjinhuoEntity shangpinjinhuoEntity){
 	try {
			BeanUtils.copyProperties(this, shangpinjinhuoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
