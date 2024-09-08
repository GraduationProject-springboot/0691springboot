package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusslaogongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusslaogongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusslaogongView;


/**
 * 劳工评论表
 *
 * @author 
 * @email 
 * @date 2022-03-02 17:48:06
 */
public interface DiscusslaogongService extends IService<DiscusslaogongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusslaogongVO> selectListVO(Wrapper<DiscusslaogongEntity> wrapper);
   	
   	DiscusslaogongVO selectVO(@Param("ew") Wrapper<DiscusslaogongEntity> wrapper);
   	
   	List<DiscusslaogongView> selectListView(Wrapper<DiscusslaogongEntity> wrapper);
   	
   	DiscusslaogongView selectView(@Param("ew") Wrapper<DiscusslaogongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusslaogongEntity> wrapper);
   	

}

