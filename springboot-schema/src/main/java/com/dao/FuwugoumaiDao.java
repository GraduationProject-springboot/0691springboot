package com.dao;

import com.entity.FuwugoumaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuwugoumaiVO;
import com.entity.view.FuwugoumaiView;


/**
 * 服务购买
 * 
 * @author 
 * @email 
 * @date 2022-03-02 17:48:05
 */
public interface FuwugoumaiDao extends BaseMapper<FuwugoumaiEntity> {
	
	List<FuwugoumaiVO> selectListVO(@Param("ew") Wrapper<FuwugoumaiEntity> wrapper);
	
	FuwugoumaiVO selectVO(@Param("ew") Wrapper<FuwugoumaiEntity> wrapper);
	
	List<FuwugoumaiView> selectListView(@Param("ew") Wrapper<FuwugoumaiEntity> wrapper);

	List<FuwugoumaiView> selectListView(Pagination page,@Param("ew") Wrapper<FuwugoumaiEntity> wrapper);
	
	FuwugoumaiView selectView(@Param("ew") Wrapper<FuwugoumaiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<FuwugoumaiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<FuwugoumaiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<FuwugoumaiEntity> wrapper);
}
