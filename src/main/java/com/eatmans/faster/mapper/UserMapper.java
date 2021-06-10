package com.eatmans.faster.mapper;

import com.eatmans.faster.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/6/9
 */

public interface UserMapper {

    List<User> getAllUser();

    Integer addUser(User user);

    Integer updateUserById(User user);

    Integer deleteUserById(Integer id);

}
