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


import com.dao.FuwugoumaiDao;
import com.entity.FuwugoumaiEntity;
import com.service.FuwugoumaiService;
import com.entity.vo.FuwugoumaiVO;
import com.entity.view.FuwugoumaiView;

@Service("fuwugoumaiService")
public class FuwugoumaiServiceImpl extends ServiceImpl<FuwugoumaiDao, FuwugoumaiEntity> implements FuwugoumaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FuwugoumaiEntity> page = this.selectPage(
                new Query<FuwugoumaiEntity>(params).getPage(),
                new EntityWrapper<FuwugoumaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FuwugoumaiEntity> wrapper) {
		  Page<FuwugoumaiView> page =new Query<FuwugoumaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FuwugoumaiVO> selectListVO(Wrapper<FuwugoumaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FuwugoumaiVO selectVO(Wrapper<FuwugoumaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FuwugoumaiView> selectListView(Wrapper<FuwugoumaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FuwugoumaiView selectView(Wrapper<FuwugoumaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<FuwugoumaiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<FuwugoumaiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<FuwugoumaiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
