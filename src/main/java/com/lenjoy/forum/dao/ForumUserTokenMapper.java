package com.lenjoy.forum.dao;

import com.lenjoy.forum.entity.ForumUser;
import com.lenjoy.forum.entity.ForumUserToken;

public interface ForumUserTokenMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(ForumUserToken record);

    int insertSelective(ForumUserToken record);

    ForumUserToken selectByPrimaryKey(Long userId);

    ForumUserToken selectByToken(String token);

    int updateByPrimaryKeySelective(ForumUserToken record);

    int updateByPrimaryKey(ForumUserToken record);
}
