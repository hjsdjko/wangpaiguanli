package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WodewenjianEntity;
import java.util.Map;

/**
 * 推荐课程 服务类
 * @since 2021-05-22
 */
public interface WodewenjianService extends IService<WodewenjianEntity> {

     PageUtils queryPage(Map<String, Object> params);

}