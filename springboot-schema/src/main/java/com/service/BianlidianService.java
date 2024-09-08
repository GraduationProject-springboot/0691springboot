package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BianlidianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BianlidianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BianlidianView;


/**
 * 便利店
 *
 * @author 
 * @email 
 * @date 2022-03-02 17:48:05
 */
public interface BianlidianService extends IService<BianlidianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BianlidianVO> selectListVO(Wrapper<BianlidianEntity> wrapper);
   	
   	BianlidianVO selectVO(@Param("ew") Wrapper<BianlidianEntity> wrapper);
   	
   	List<BianlidianView> selectListView(Wrapper<BianlidianEntity> wrapper);
   	
   	BianlidianView selectView(@Param("ew") Wrapper<BianlidianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BianlidianEntity> wrapper);
   	

}

