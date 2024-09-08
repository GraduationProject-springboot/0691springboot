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


import com.dao.BianlidianDao;
import com.entity.BianlidianEntity;
import com.service.BianlidianService;
import com.entity.vo.BianlidianVO;
import com.entity.view.BianlidianView;

@Service("bianlidianService")
public class BianlidianServiceImpl extends ServiceImpl<BianlidianDao, BianlidianEntity> implements BianlidianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BianlidianEntity> page = this.selectPage(
                new Query<BianlidianEntity>(params).getPage(),
                new EntityWrapper<BianlidianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BianlidianEntity> wrapper) {
		  Page<BianlidianView> page =new Query<BianlidianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BianlidianVO> selectListVO(Wrapper<BianlidianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BianlidianVO selectVO(Wrapper<BianlidianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BianlidianView> selectListView(Wrapper<BianlidianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BianlidianView selectView(Wrapper<BianlidianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
