package com.dao;

import com.entity.DiscusslaogongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusslaogongVO;
import com.entity.view.DiscusslaogongView;


/**
 * 劳工评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-02 17:48:06
 */
public interface DiscusslaogongDao extends BaseMapper<DiscusslaogongEntity> {
	
	List<DiscusslaogongVO> selectListVO(@Param("ew") Wrapper<DiscusslaogongEntity> wrapper);
	
	DiscusslaogongVO selectVO(@Param("ew") Wrapper<DiscusslaogongEntity> wrapper);
	
	List<DiscusslaogongView> selectListView(@Param("ew") Wrapper<DiscusslaogongEntity> wrapper);

	List<DiscusslaogongView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusslaogongEntity> wrapper);
	
	DiscusslaogongView selectView(@Param("ew") Wrapper<DiscusslaogongEntity> wrapper);
	

}
