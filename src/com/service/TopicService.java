package com.service;

import com.entity.PageBean;
import com.entity.Topic;

public interface TopicService {
    public PageBean<Topic> findByPage(String title, int currentPage, int pageSize);
}
