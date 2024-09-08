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


import com.dao.MeirijiankangDao;
import com.entity.MeirijiankangEntity;
import com.service.MeirijiankangService;
import com.entity.vo.MeirijiankangVO;
import com.entity.view.MeirijiankangView;

@Service("meirijiankangService")
public class MeirijiankangServiceImpl extends ServiceImpl<MeirijiankangDao, MeirijiankangEntity> implements MeirijiankangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MeirijiankangEntity> page = this.selectPage(
                new Query<MeirijiankangEntity>(params).getPage(),
                new EntityWrapper<MeirijiankangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MeirijiankangEntity> wrapper) {
		  Page<MeirijiankangView> page =new Query<MeirijiankangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MeirijiankangVO> selectListVO(Wrapper<MeirijiankangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MeirijiankangVO selectVO(Wrapper<MeirijiankangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MeirijiankangView> selectListView(Wrapper<MeirijiankangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MeirijiankangView selectView(Wrapper<MeirijiankangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
