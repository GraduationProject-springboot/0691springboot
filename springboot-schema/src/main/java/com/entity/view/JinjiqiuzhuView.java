package com.entity.view;

import com.entity.JinjiqiuzhuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 紧急求助
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-02 17:48:05
 */
@TableName("jinjiqiuzhu")
public class JinjiqiuzhuView  extends JinjiqiuzhuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JinjiqiuzhuView(){
	}
 
 	public JinjiqiuzhuView(JinjiqiuzhuEntity jinjiqiuzhuEntity){
 	try {
			BeanUtils.copyProperties(this, jinjiqiuzhuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
