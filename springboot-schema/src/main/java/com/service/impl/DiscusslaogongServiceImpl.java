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


import com.dao.DiscusslaogongDao;
import com.entity.DiscusslaogongEntity;
import com.service.DiscusslaogongService;
import com.entity.vo.DiscusslaogongVO;
import com.entity.view.DiscusslaogongView;

@Service("discusslaogongService")
public class DiscusslaogongServiceImpl extends ServiceImpl<DiscusslaogongDao, DiscusslaogongEntity> implements DiscusslaogongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusslaogongEntity> page = this.selectPage(
                new Query<DiscusslaogongEntity>(params).getPage(),
                new EntityWrapper<DiscusslaogongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusslaogongEntity> wrapper) {
		  Page<DiscusslaogongView> page =new Query<DiscusslaogongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusslaogongVO> selectListVO(Wrapper<DiscusslaogongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusslaogongVO selectVO(Wrapper<DiscusslaogongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusslaogongView> selectListView(Wrapper<DiscusslaogongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusslaogongView selectView(Wrapper<DiscusslaogongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
