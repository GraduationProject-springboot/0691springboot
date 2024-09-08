package com.dao;

import com.entity.MeirijiankangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MeirijiankangVO;
import com.entity.view.MeirijiankangView;


/**
 * 每日健康
 * 
 * @author 
 * @email 
 * @date 2022-03-02 17:48:05
 */
public interface MeirijiankangDao extends BaseMapper<MeirijiankangEntity> {
	
	List<MeirijiankangVO> selectListVO(@Param("ew") Wrapper<MeirijiankangEntity> wrapper);
	
	MeirijiankangVO selectVO(@Param("ew") Wrapper<MeirijiankangEntity> wrapper);
	
	List<MeirijiankangView> selectListView(@Param("ew") Wrapper<MeirijiankangEntity> wrapper);

	List<MeirijiankangView> selectListView(Pagination page,@Param("ew") Wrapper<MeirijiankangEntity> wrapper);
	
	MeirijiankangView selectView(@Param("ew") Wrapper<MeirijiankangEntity> wrapper);
	

}
