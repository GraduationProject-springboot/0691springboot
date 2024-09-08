package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscusslaogongEntity;
import com.entity.view.DiscusslaogongView;

import com.service.DiscusslaogongService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;


/**
 * 劳工评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-02 17:48:06
 */
@RestController
@RequestMapping("/discusslaogong")
public class DiscusslaogongController {
    @Autowired
    private DiscusslaogongService discusslaogongService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscusslaogongEntity discusslaogong, 
		HttpServletRequest request){
        EntityWrapper<DiscusslaogongEntity> ew = new EntityWrapper<DiscusslaogongEntity>();
		PageUtils page = discusslaogongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusslaogong), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscusslaogongEntity discusslaogong, 
		HttpServletRequest request){
        EntityWrapper<DiscusslaogongEntity> ew = new EntityWrapper<DiscusslaogongEntity>();
		PageUtils page = discusslaogongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusslaogong), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscusslaogongEntity discusslaogong){
       	EntityWrapper<DiscusslaogongEntity> ew = new EntityWrapper<DiscusslaogongEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discusslaogong, "discusslaogong")); 
        return R.ok().put("data", discusslaogongService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscusslaogongEntity discusslaogong){
        EntityWrapper< DiscusslaogongEntity> ew = new EntityWrapper< DiscusslaogongEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discusslaogong, "discusslaogong")); 
		DiscusslaogongView discusslaogongView =  discusslaogongService.selectView(ew);
		return R.ok("查询劳工评论表成功").put("data", discusslaogongView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscusslaogongEntity discusslaogong = discusslaogongService.selectById(id);
        return R.ok().put("data", discusslaogong);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscusslaogongEntity discusslaogong = discusslaogongService.selectById(id);
        return R.ok().put("data", discusslaogong);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscusslaogongEntity discusslaogong, HttpServletRequest request){
    	discusslaogong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusslaogong);
        discusslaogongService.insert(discusslaogong);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscusslaogongEntity discusslaogong, HttpServletRequest request){
    	discusslaogong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusslaogong);
        discusslaogongService.insert(discusslaogong);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiscusslaogongEntity discusslaogong, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discusslaogong);
        discusslaogongService.updateById(discusslaogong);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discusslaogongService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DiscusslaogongEntity> wrapper = new EntityWrapper<DiscusslaogongEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discusslaogongService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	





}
