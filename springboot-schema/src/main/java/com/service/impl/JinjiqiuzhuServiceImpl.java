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


import com.dao.JinjiqiuzhuDao;
import com.entity.JinjiqiuzhuEntity;
import com.service.JinjiqiuzhuService;
import com.entity.vo.JinjiqiuzhuVO;
import com.entity.view.JinjiqiuzhuView;

@Service("jinjiqiuzhuService")
public class JinjiqiuzhuServiceImpl extends ServiceImpl<JinjiqiuzhuDao, JinjiqiuzhuEntity> implements JinjiqiuzhuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JinjiqiuzhuEntity> page = this.selectPage(
                new Query<JinjiqiuzhuEntity>(params).getPage(),
                new EntityWrapper<JinjiqiuzhuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JinjiqiuzhuEntity> wrapper) {
		  Page<JinjiqiuzhuView> page =new Query<JinjiqiuzhuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JinjiqiuzhuVO> selectListVO(Wrapper<JinjiqiuzhuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JinjiqiuzhuVO selectVO(Wrapper<JinjiqiuzhuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JinjiqiuzhuView> selectListView(Wrapper<JinjiqiuzhuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JinjiqiuzhuView selectView(Wrapper<JinjiqiuzhuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
