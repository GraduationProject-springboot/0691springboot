package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LipinfafangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LipinfafangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LipinfafangView;


/**
 * 礼品发放
 *
 * @author 
 * @email 
 * @date 2022-03-02 17:48:05
 */
public interface LipinfafangService extends IService<LipinfafangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LipinfafangVO> selectListVO(Wrapper<LipinfafangEntity> wrapper);
   	
   	LipinfafangVO selectVO(@Param("ew") Wrapper<LipinfafangEntity> wrapper);
   	
   	List<LipinfafangView> selectListView(Wrapper<LipinfafangEntity> wrapper);
   	
   	LipinfafangView selectView(@Param("ew") Wrapper<LipinfafangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LipinfafangEntity> wrapper);
   	

}

