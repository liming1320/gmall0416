package com.atguigu.gmall.manage.mapper;

import com.atguigu.gmall.bean.BaseAttrInfo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface BaseAttrInfoMapper extends Mapper<BaseAttrInfo> {

    // 根据三级分类Id进行查询 List<BaseAttrInfo>
    List<BaseAttrInfo> getBaseAttrInfoListByCatalog3Id(Long catalog3Id);

    // 根据平台属性值id查询平台属性集合
    List<BaseAttrInfo> selectAttrInfoListByIds(@Param("valueIds") String valueIds);
}
