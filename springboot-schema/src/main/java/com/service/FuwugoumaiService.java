package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuwugoumaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FuwugoumaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FuwugoumaiView;


/**
 * 服务购买
 *
 * @author 
 * @email 
 * @date 2022-03-02 17:48:05
 */
public interface FuwugoumaiService extends IService<FuwugoumaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuwugoumaiVO> selectListVO(Wrapper<FuwugoumaiEntity> wrapper);
   	
   	FuwugoumaiVO selectVO(@Param("ew") Wrapper<FuwugoumaiEntity> wrapper);
   	
   	List<FuwugoumaiView> selectListView(Wrapper<FuwugoumaiEntity> wrapper);
   	
   	FuwugoumaiView selectView(@Param("ew") Wrapper<FuwugoumaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuwugoumaiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<FuwugoumaiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<FuwugoumaiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<FuwugoumaiEntity> wrapper);
}

