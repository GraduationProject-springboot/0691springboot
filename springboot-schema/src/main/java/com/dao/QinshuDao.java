package com.dao;

import com.entity.QinshuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QinshuVO;
import com.entity.view.QinshuView;


/**
 * 亲属
 * 
 * @author 
 * @email 
 * @date 2022-03-02 17:48:05
 */
public interface QinshuDao extends BaseMapper<QinshuEntity> {
	
	List<QinshuVO> selectListVO(@Param("ew") Wrapper<QinshuEntity> wrapper);
	
	QinshuVO selectVO(@Param("ew") Wrapper<QinshuEntity> wrapper);
	
	List<QinshuView> selectListView(@Param("ew") Wrapper<QinshuEntity> wrapper);

	List<QinshuView> selectListView(Pagination page,@Param("ew") Wrapper<QinshuEntity> wrapper);
	
	QinshuView selectView(@Param("ew") Wrapper<QinshuEntity> wrapper);
	

}
