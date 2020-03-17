package com.soft1851.spring.ioc.dao;

import com.soft1851.spring.ioc.entity.Forum;
import com.soft1851.spring.ioc.entity.Post;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class PostDaoTest {

    @Autowired
    private PostDao postDao;
    @Test
    public void insert() {
        Post post = Post.builder().forumId(1).title("Java").content("Java学习").build();
        int n = postDao.insert(post);
        assertEquals(1,n);
    }

    @Test
    public void batchInsertPost() {
        Post[] posts = {Post.builder().forumId(1).title("Java1").content("Java学习1").build(),
                Post.builder().forumId(1).title("Java2").content("Java学习2").build(),
                Post.builder().forumId(1).title("Java3").content("Java学习3").build(),
        } ;
        List<Post> postList = Arrays.asList(posts);
        int[] rows = postDao.batchInsertPost(postList);
        assertEquals(3,rows.length);
    }

    @Test
    public void delete() {
        int n = postDao.delete(2);
        assertEquals(1,n);
    }

    @Test
    public void batchDelete() {
        int[] tem = {4,5};
        int[] rows = postDao.batchDelete(tem);
        assertEquals(2,rows.length);
    }

    @Test
    public void get() {
        Post post = postDao.get(1);
        assertNotNull(post);
    }

    @Test
    public void selectByKeywords() {
        List<Post> postList = postDao.selectByKeywords("Java");
        postList.forEach(item -> System.out.println(item.getPostId()));
    }

    @Test
    public void countByForumId() {
        int n = postDao.countByForumId(1);
        System.out.println(n);
    }
}