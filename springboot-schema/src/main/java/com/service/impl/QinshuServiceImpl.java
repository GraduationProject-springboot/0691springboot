package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.QinshuDao;
import com.entity.QinshuEntity;
import com.service.QinshuService;
import com.entity.vo.QinshuVO;
import com.entity.view.QinshuView;

@Service("qinshuService")
public class QinshuServiceImpl extends ServiceImpl<QinshuDao, QinshuEntity> implements QinshuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QinshuEntity> page = this.selectPage(
                new Query<QinshuEntity>(params).getPage(),
                new EntityWrapper<QinshuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QinshuEntity> wrapper) {
		  Page<QinshuView> page =new Query<QinshuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QinshuVO> selectListVO(Wrapper<QinshuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QinshuVO selectVO(Wrapper<QinshuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QinshuView> selectListView(Wrapper<QinshuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QinshuView selectView(Wrapper<QinshuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
