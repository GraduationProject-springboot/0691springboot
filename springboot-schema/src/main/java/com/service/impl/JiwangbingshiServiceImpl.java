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


import com.dao.JiwangbingshiDao;
import com.entity.JiwangbingshiEntity;
import com.service.JiwangbingshiService;
import com.entity.vo.JiwangbingshiVO;
import com.entity.view.JiwangbingshiView;

@Service("jiwangbingshiService")
public class JiwangbingshiServiceImpl extends ServiceImpl<JiwangbingshiDao, JiwangbingshiEntity> implements JiwangbingshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiwangbingshiEntity> page = this.selectPage(
                new Query<JiwangbingshiEntity>(params).getPage(),
                new EntityWrapper<JiwangbingshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiwangbingshiEntity> wrapper) {
		  Page<JiwangbingshiView> page =new Query<JiwangbingshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiwangbingshiVO> selectListVO(Wrapper<JiwangbingshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiwangbingshiVO selectVO(Wrapper<JiwangbingshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiwangbingshiView> selectListView(Wrapper<JiwangbingshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiwangbingshiView selectView(Wrapper<JiwangbingshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
