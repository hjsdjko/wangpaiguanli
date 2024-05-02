package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NewsEntity;
import java.util.Map;

/**
 * 公告信息 服务类
 * @since 2021-05-22
 */
public interface NewsService extends IService<NewsEntity> {

     PageUtils queryPage(Map<String, Object> params);

}