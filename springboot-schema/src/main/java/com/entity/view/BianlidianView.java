package com.entity.view;

import com.entity.BianlidianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 便利店
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-02 17:48:05
 */
@TableName("bianlidian")
public class BianlidianView  extends BianlidianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BianlidianView(){
	}
 
 	public BianlidianView(BianlidianEntity bianlidianEntity){
 	try {
			BeanUtils.copyProperties(this, bianlidianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
