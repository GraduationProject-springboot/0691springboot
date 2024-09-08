package com.dao;

import com.entity.LaogongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LaogongVO;
import com.entity.view.LaogongView;


/**
 * 劳工
 * 
 * @author 
 * @email 
 * @date 2022-03-02 17:48:05
 */
public interface LaogongDao extends BaseMapper<LaogongEntity> {
	
	List<LaogongVO> selectListVO(@Param("ew") Wrapper<LaogongEntity> wrapper);
	
	LaogongVO selectVO(@Param("ew") Wrapper<LaogongEntity> wrapper);
	
	List<LaogongView> selectListView(@Param("ew") Wrapper<LaogongEntity> wrapper);

	List<LaogongView> selectListView(Pagination page,@Param("ew") Wrapper<LaogongEntity> wrapper);
	
	LaogongView selectView(@Param("ew") Wrapper<LaogongEntity> wrapper);
	

}
