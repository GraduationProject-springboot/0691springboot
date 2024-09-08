package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JinjiqiuzhuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JinjiqiuzhuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JinjiqiuzhuView;


/**
 * 紧急求助
 *
 * @author 
 * @email 
 * @date 2022-03-02 17:48:05
 */
public interface JinjiqiuzhuService extends IService<JinjiqiuzhuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JinjiqiuzhuVO> selectListVO(Wrapper<JinjiqiuzhuEntity> wrapper);
   	
   	JinjiqiuzhuVO selectVO(@Param("ew") Wrapper<JinjiqiuzhuEntity> wrapper);
   	
   	List<JinjiqiuzhuView> selectListView(Wrapper<JinjiqiuzhuEntity> wrapper);
   	
   	JinjiqiuzhuView selectView(@Param("ew") Wrapper<JinjiqiuzhuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JinjiqiuzhuEntity> wrapper);
   	

}

