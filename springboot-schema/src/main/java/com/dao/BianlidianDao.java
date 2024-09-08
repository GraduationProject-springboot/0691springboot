package com.dao;

import com.entity.BianlidianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BianlidianVO;
import com.entity.view.BianlidianView;


/**
 * 便利店
 * 
 * @author 
 * @email 
 * @date 2022-03-02 17:48:05
 */
public interface BianlidianDao extends BaseMapper<BianlidianEntity> {
	
	List<BianlidianVO> selectListVO(@Param("ew") Wrapper<BianlidianEntity> wrapper);
	
	BianlidianVO selectVO(@Param("ew") Wrapper<BianlidianEntity> wrapper);
	
	List<BianlidianView> selectListView(@Param("ew") Wrapper<BianlidianEntity> wrapper);

	List<BianlidianView> selectListView(Pagination page,@Param("ew") Wrapper<BianlidianEntity> wrapper);
	
	BianlidianView selectView(@Param("ew") Wrapper<BianlidianEntity> wrapper);
	

}
