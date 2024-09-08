package com.entity.view;

import com.entity.LaogongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 劳工
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-02 17:48:05
 */
@TableName("laogong")
public class LaogongView  extends LaogongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LaogongView(){
	}
 
 	public LaogongView(LaogongEntity laogongEntity){
 	try {
			BeanUtils.copyProperties(this, laogongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
