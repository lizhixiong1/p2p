package com.bw.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bw.pojo.User;
import com.util.common.PageUtil;

public interface UserMapper {
	List<User> getList(@Param("pageUtil")PageUtil pageUtil);

	int getConnt();
}
