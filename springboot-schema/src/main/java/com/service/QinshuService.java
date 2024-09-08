package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QinshuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QinshuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QinshuView;


/**
 * 亲属
 *
 * @author 
 * @email 
 * @date 2022-03-02 17:48:05
 */
public interface QinshuService extends IService<QinshuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QinshuVO> selectListVO(Wrapper<QinshuEntity> wrapper);
   	
   	QinshuVO selectVO(@Param("ew") Wrapper<QinshuEntity> wrapper);
   	
   	List<QinshuView> selectListView(Wrapper<QinshuEntity> wrapper);
   	
   	QinshuView selectView(@Param("ew") Wrapper<QinshuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QinshuEntity> wrapper);
   	

}

