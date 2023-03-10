package com.shop.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.shop.dto.WishDTO;
import com.shop.frame.MyMapper;

@Repository
@Mapper
public interface WishMapper extends MyMapper<Integer, WishDTO>{

}
