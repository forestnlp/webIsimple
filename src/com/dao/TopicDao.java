package com.dao;

import com.entity.Topic;

import java.util.List;

public interface TopicDao {
    List<Topic> findByPage(String title,int currentPage, int pageSize);

    int getTotalSize(String title);
}
