package com.soft1851.spring.orm.dao;


import com.soft1851.spring.orm.entity.Post;

import java.util.List;

/**
 * @InterfaceName PostDao
 * @Description TODO
 * @Author wanghuanle
 * @Date 2020/3/17
 **/
public interface PostDao {
    /**
     * 新增Post
     * @param post
     * @return
     */
    int insert(Post post);

    /**
     * 批量新增Post
     * @param posts
     * @return
     */
    int[] batchInsertPost(List<Post> posts);

    /**
     * 根据postId删除post
     * @param postId
     * @return
     */
     int delete(int postId);

    /**
     * 批量删除post
     * @param postId
     * @return
     */
    int[] batchDelete(int[] postId);

    /**
     * 根据id查询post
     * @param postId
     * @return
     */
    Post get(int postId);

    /**
     * 根据关键字查找post
     * @param keywords
     * @return
     */
    List<Post> selectByKeywords(String keywords);

    /**
     * 根据论坛的id统计帖子数量
     * @param forumId
     * @return
     */
    int countByForumId(int forumId);
}
