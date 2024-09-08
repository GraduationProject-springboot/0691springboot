package com.dao;

import com.entity.JiwangbingshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiwangbingshiVO;
import com.entity.view.JiwangbingshiView;


/**
 * 既往病史
 * 
 * @author 
 * @email 
 * @date 2022-03-02 17:48:05
 */
public interface JiwangbingshiDao extends BaseMapper<JiwangbingshiEntity> {
	
	List<JiwangbingshiVO> selectListVO(@Param("ew") Wrapper<JiwangbingshiEntity> wrapper);
	
	JiwangbingshiVO selectVO(@Param("ew") Wrapper<JiwangbingshiEntity> wrapper);
	
	List<JiwangbingshiView> selectListView(@Param("ew") Wrapper<JiwangbingshiEntity> wrapper);

	List<JiwangbingshiView> selectListView(Pagination page,@Param("ew") Wrapper<JiwangbingshiEntity> wrapper);
	
	JiwangbingshiView selectView(@Param("ew") Wrapper<JiwangbingshiEntity> wrapper);
	

}
