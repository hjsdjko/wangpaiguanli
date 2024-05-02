package com.entity.view;

import com.entity.WodewenjianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;

/**
 * 推荐课程
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @email
 * @date 2021-05-22
 */
@TableName("wodewenjian")
public class WodewenjianView extends WodewenjianEntity implements Serializable {
    private static final long serialVersionUID = 1L;

	public WodewenjianView() {

	}

	public WodewenjianView(WodewenjianEntity wodewenjianEntity) {
		try {
			BeanUtils.copyProperties(this, wodewenjianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
