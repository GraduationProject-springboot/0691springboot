package com.dao;

import com.entity.LipinfafangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LipinfafangVO;
import com.entity.view.LipinfafangView;


/**
 * 礼品发放
 * 
 * @author 
 * @email 
 * @date 2022-03-02 17:48:05
 */
public interface LipinfafangDao extends BaseMapper<LipinfafangEntity> {
	
	List<LipinfafangVO> selectListVO(@Param("ew") Wrapper<LipinfafangEntity> wrapper);
	
	LipinfafangVO selectVO(@Param("ew") Wrapper<LipinfafangEntity> wrapper);
	
	List<LipinfafangView> selectListView(@Param("ew") Wrapper<LipinfafangEntity> wrapper);

	List<LipinfafangView> selectListView(Pagination page,@Param("ew") Wrapper<LipinfafangEntity> wrapper);
	
	LipinfafangView selectView(@Param("ew") Wrapper<LipinfafangEntity> wrapper);
	

}
