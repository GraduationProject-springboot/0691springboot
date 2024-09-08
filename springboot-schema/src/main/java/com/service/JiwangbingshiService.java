package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiwangbingshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiwangbingshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiwangbingshiView;


/**
 * 既往病史
 *
 * @author 
 * @email 
 * @date 2022-03-02 17:48:05
 */
public interface JiwangbingshiService extends IService<JiwangbingshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiwangbingshiVO> selectListVO(Wrapper<JiwangbingshiEntity> wrapper);
   	
   	JiwangbingshiVO selectVO(@Param("ew") Wrapper<JiwangbingshiEntity> wrapper);
   	
   	List<JiwangbingshiView> selectListView(Wrapper<JiwangbingshiEntity> wrapper);
   	
   	JiwangbingshiView selectView(@Param("ew") Wrapper<JiwangbingshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiwangbingshiEntity> wrapper);
   	

}

