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


import com.dao.LaogongDao;
import com.entity.LaogongEntity;
import com.service.LaogongService;
import com.entity.vo.LaogongVO;
import com.entity.view.LaogongView;

@Service("laogongService")
public class LaogongServiceImpl extends ServiceImpl<LaogongDao, LaogongEntity> implements LaogongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LaogongEntity> page = this.selectPage(
                new Query<LaogongEntity>(params).getPage(),
                new EntityWrapper<LaogongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LaogongEntity> wrapper) {
		  Page<LaogongView> page =new Query<LaogongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LaogongVO> selectListVO(Wrapper<LaogongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LaogongVO selectVO(Wrapper<LaogongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LaogongView> selectListView(Wrapper<LaogongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LaogongView selectView(Wrapper<LaogongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
