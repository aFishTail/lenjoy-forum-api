package com.lenjoy.forum.dao;

import com.lenjoy.forum.entity.ForumUser;
import com.lenjoy.forum.util.PageQueryUtil;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ForumUserMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(ForumUser record);

    int insertSelective(ForumUser record);

    ForumUser selectByPrimaryKey(Long userId);

    ForumUser selectByLoginName(String loginName);

    ForumUser selectByLoginNameAndPasswd(@Param("loginName") String loginName, @Param("password") String password);

    int updateByPrimaryKeySelective(ForumUser record);

    int updateByPrimaryKey(ForumUser record);

    List<ForumUser> findForumUserList(PageQueryUtil pageUtil);

    int getTotalForumUsers(PageQueryUtil pageUtil);

    int lockUserBatch(@Param("ids") Long[] ids, @Param("lockStatus") int lockStatus);
}
