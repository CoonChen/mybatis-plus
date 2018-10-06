package com.coon.mybaitsplus.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.coon.mybaitsplus.domain.User;
import com.coon.mybaitsplus.dto.UserDto;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends BaseMapper<User> {
    UserDto findOne(@Param(value = "id") String id);
}
