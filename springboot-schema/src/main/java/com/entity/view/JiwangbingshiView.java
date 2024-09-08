package com.entity.view;

import com.entity.JiwangbingshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 既往病史
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-02 17:48:05
 */
@TableName("jiwangbingshi")
public class JiwangbingshiView  extends JiwangbingshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiwangbingshiView(){
	}
 
 	public JiwangbingshiView(JiwangbingshiEntity jiwangbingshiEntity){
 	try {
			BeanUtils.copyProperties(this, jiwangbingshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
