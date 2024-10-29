package com.dao;

import com.entity.SheyingshiOrderEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.SheyingshiOrderView;

/**
 * 摄影师预约 Dao 接口
 *
 * @author 
 */
public interface SheyingshiOrderDao extends BaseMapper<SheyingshiOrderEntity> {

   List<SheyingshiOrderView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
