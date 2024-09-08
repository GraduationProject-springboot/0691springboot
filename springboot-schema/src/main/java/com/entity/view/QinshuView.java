package com.entity.view;

import com.entity.QinshuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 亲属
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-02 17:48:05
 */
@TableName("qinshu")
public class QinshuView  extends QinshuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QinshuView(){
	}
 
 	public QinshuView(QinshuEntity qinshuEntity){
 	try {
			BeanUtils.copyProperties(this, qinshuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
