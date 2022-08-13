package com.example.d4.mapper;

import com.example.d4.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<User> getAll();

}
