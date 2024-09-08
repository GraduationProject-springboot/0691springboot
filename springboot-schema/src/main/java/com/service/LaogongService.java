package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LaogongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LaogongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LaogongView;


/**
 * 劳工
 *
 * @author 
 * @email 
 * @date 2022-03-02 17:48:05
 */
public interface LaogongService extends IService<LaogongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LaogongVO> selectListVO(Wrapper<LaogongEntity> wrapper);
   	
   	LaogongVO selectVO(@Param("ew") Wrapper<LaogongEntity> wrapper);
   	
   	List<LaogongView> selectListView(Wrapper<LaogongEntity> wrapper);
   	
   	LaogongView selectView(@Param("ew") Wrapper<LaogongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LaogongEntity> wrapper);
   	

}

