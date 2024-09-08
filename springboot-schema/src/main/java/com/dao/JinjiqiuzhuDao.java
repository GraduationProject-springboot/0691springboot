package com.dao;

import com.entity.JinjiqiuzhuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JinjiqiuzhuVO;
import com.entity.view.JinjiqiuzhuView;


/**
 * 紧急求助
 * 
 * @author 
 * @email 
 * @date 2022-03-02 17:48:05
 */
public interface JinjiqiuzhuDao extends BaseMapper<JinjiqiuzhuEntity> {
	
	List<JinjiqiuzhuVO> selectListVO(@Param("ew") Wrapper<JinjiqiuzhuEntity> wrapper);
	
	JinjiqiuzhuVO selectVO(@Param("ew") Wrapper<JinjiqiuzhuEntity> wrapper);
	
	List<JinjiqiuzhuView> selectListView(@Param("ew") Wrapper<JinjiqiuzhuEntity> wrapper);

	List<JinjiqiuzhuView> selectListView(Pagination page,@Param("ew") Wrapper<JinjiqiuzhuEntity> wrapper);
	
	JinjiqiuzhuView selectView(@Param("ew") Wrapper<JinjiqiuzhuEntity> wrapper);
	

}
