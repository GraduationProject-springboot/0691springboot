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


import com.dao.LipinfafangDao;
import com.entity.LipinfafangEntity;
import com.service.LipinfafangService;
import com.entity.vo.LipinfafangVO;
import com.entity.view.LipinfafangView;

@Service("lipinfafangService")
public class LipinfafangServiceImpl extends ServiceImpl<LipinfafangDao, LipinfafangEntity> implements LipinfafangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LipinfafangEntity> page = this.selectPage(
                new Query<LipinfafangEntity>(params).getPage(),
                new EntityWrapper<LipinfafangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LipinfafangEntity> wrapper) {
		  Page<LipinfafangView> page =new Query<LipinfafangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LipinfafangVO> selectListVO(Wrapper<LipinfafangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LipinfafangVO selectVO(Wrapper<LipinfafangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LipinfafangView> selectListView(Wrapper<LipinfafangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LipinfafangView selectView(Wrapper<LipinfafangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
