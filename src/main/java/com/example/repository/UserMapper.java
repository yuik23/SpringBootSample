package com.example.repository;

import com.example.domain.user.model.MUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;

@Mapper
public interface UserMapper {

  /**ユーザー登録*/
  public int insertOne(MUser user);
}
