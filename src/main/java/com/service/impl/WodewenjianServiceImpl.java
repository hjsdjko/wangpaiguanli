package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;

import com.dao.WodewenjianDao;
import com.entity.WodewenjianEntity;
import com.service.WodewenjianService;
import com.entity.view.WodewenjianView;

/**
 * 推荐课程 服务实现类
 * @since 2021-05-22
 */
@Service("wodewenjianService")
@Transactional
public class WodewenjianServiceImpl extends ServiceImpl<WodewenjianDao, WodewenjianEntity> implements WodewenjianService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<WodewenjianView> page =new Query<WodewenjianView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }

}
