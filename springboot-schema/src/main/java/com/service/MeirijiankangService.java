package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MeirijiankangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MeirijiankangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MeirijiankangView;


/**
 * 每日健康
 *
 * @author 
 * @email 
 * @date 2022-03-02 17:48:05
 */
public interface MeirijiankangService extends IService<MeirijiankangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MeirijiankangVO> selectListVO(Wrapper<MeirijiankangEntity> wrapper);
   	
   	MeirijiankangVO selectVO(@Param("ew") Wrapper<MeirijiankangEntity> wrapper);
   	
   	List<MeirijiankangView> selectListView(Wrapper<MeirijiankangEntity> wrapper);
   	
   	MeirijiankangView selectView(@Param("ew") Wrapper<MeirijiankangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MeirijiankangEntity> wrapper);
   	

}

