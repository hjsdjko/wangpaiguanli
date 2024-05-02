package com.controller;

import java.text.SimpleDateFormat;
import java.util.*;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.WodewenjianEntity;

import com.service.WodewenjianService;
import com.utils.PageUtils;
import com.utils.R;

/**
 * 推荐课程
 * 后端接口
 * @author
 * @email
 * @date 2021-05-22
*/
@RestController
@Controller
@RequestMapping("/wodewenjian")
public class WodewenjianController {
    private static final Logger logger = LoggerFactory.getLogger(WodewenjianController.class);

    @Autowired
    private WodewenjianService wodewenjianService;

    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("Controller:"+this.getClass().getName()+",page方法");
        if(!params.containsKey("zhuangt1Types")){
            if(request.getSession().getAttribute("role").equals("用户")){
                params.put("yonghuTypes",request.getSession().getAttribute("userId"));
            }
        }

        PageUtils page = wodewenjianService.queryPage(params);
        return R.ok().put("data", page);
    }
    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("Controller:"+this.getClass().getName()+",info方法");
        WodewenjianEntity wodewenjian = wodewenjianService.selectById(id);
        if(wodewenjian!=null){
            return R.ok().put("data", wodewenjian);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody WodewenjianEntity wodewenjian, HttpServletRequest request){
        logger.debug("Controller:"+this.getClass().getName()+",save");
        wodewenjian.setYonghuTypes((Integer) request.getSession().getAttribute("userId"));
        wodewenjian.setZhuangt1Types(1);//没共享
        Wrapper<WodewenjianEntity> queryWrapper = new EntityWrapper<WodewenjianEntity>()
            .eq("yonghu_types", wodewenjian.getYonghuTypes())
            .eq("wodewenjian_name", wodewenjian.getWodewenjianName())
            .eq("leixing_types", wodewenjian.getLeixingTypes())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        WodewenjianEntity wodewenjianEntity = wodewenjianService.selectOne(queryWrapper);
        if("".equals(wodewenjian.getWodewenjianFile()) || "null".equals(wodewenjian.getWodewenjianFile())){
            wodewenjian.setWodewenjianFile(null);
        }
        if(StringUtils.isNotBlank(wodewenjian.getWodewenjianContent())){
            wodewenjian.setWodewenjianContent(wodewenjian.getWodewenjianContent().replace("<p>",""));
            wodewenjian.setWodewenjianContent(wodewenjian.getWodewenjianContent().replace("</p>",""));
        }
            wodewenjian.setShuangchuanTime(new Date());
            wodewenjian.setWodewenjianTime(new Date());
        if(wodewenjianEntity==null){
            wodewenjianService.insert(wodewenjian);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody WodewenjianEntity wodewenjian, HttpServletRequest request){
        logger.debug("Controller:"+this.getClass().getName()+",update");
        //根据字段查询是否有相同数据
        Wrapper<WodewenjianEntity> queryWrapper = new EntityWrapper<WodewenjianEntity>()
            .notIn("id",wodewenjian.getId())
            .eq("yonghu_types", wodewenjian.getYonghuTypes())
            .eq("wodewenjian_name", wodewenjian.getWodewenjianName())
            .eq("leixing_types", wodewenjian.getLeixingTypes())
            .eq("wodewenjian_content", wodewenjian.getWodewenjianContent())
            .eq("zhuangt1_types", wodewenjian.getZhuangt1Types())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        WodewenjianEntity wodewenjianEntity = wodewenjianService.selectOne(queryWrapper);
        if("".equals(wodewenjian.getWodewenjianFile()) || "null".equals(wodewenjian.getWodewenjianFile())){
                wodewenjian.setWodewenjianFile(null);
        }
        if(StringUtils.isNotBlank(wodewenjian.getWodewenjianContent())){
            wodewenjian.setWodewenjianContent(wodewenjian.getWodewenjianContent().replace("<p>",""));
            wodewenjian.setWodewenjianContent(wodewenjian.getWodewenjianContent().replace("</p>",""));
        }
                wodewenjian.setShuangchuanTime(new Date());
                wodewenjian.setWodewenjianTime(new Date());
        if(wodewenjianEntity==null){
            wodewenjianService.updateById(wodewenjian);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        logger.debug("Controller:"+this.getClass().getName()+",delete");
        wodewenjianService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
}

