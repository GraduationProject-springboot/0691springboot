package com.entity.view;

import com.entity.DiscusslaogongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 劳工评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-02 17:48:06
 */
@TableName("discusslaogong")
public class DiscusslaogongView  extends DiscusslaogongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusslaogongView(){
	}
 
 	public DiscusslaogongView(DiscusslaogongEntity discusslaogongEntity){
 	try {
			BeanUtils.copyProperties(this, discusslaogongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
