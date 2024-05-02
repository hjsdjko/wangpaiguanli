package com.dao;

import com.entity.WodewenjianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.WodewenjianView;

/**
 * 推荐课程 Dao 接口
 *
 * @since 2021-05-22
 */
public interface WodewenjianDao extends BaseMapper<WodewenjianEntity> {

   List<WodewenjianView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
