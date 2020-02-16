package com.lx.dal.mapper;

import com.lx.dal.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

/***
 * create by chenjiang on 2020/2/9 0009
 */
@Mapper
public interface GoodsMapper {
    int deleteByPrimaryKey(String gid);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(String gid);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}
