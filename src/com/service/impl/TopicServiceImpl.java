package com.service.impl;

import com.dao.TopicDao;
import com.dao.impl.TopicDaoImpl;
import com.entity.PageBean;
import com.entity.Topic;
import com.service.TopicService;

import java.util.List;

public class TopicServiceImpl implements TopicService {

    private TopicDao dao = new TopicDaoImpl();

    //分页逻辑封装
    @Override
    public PageBean<Topic> findByPage(String title, int currentPage, int pageSize) {
        List<Topic> list = dao.findByPage(title,currentPage,pageSize);
        int totalSize = dao.getTotalSize(title);
        int totalPage = totalSize%pageSize==0?totalSize/pageSize:totalSize/pageSize+1;
        PageBean<Topic> pageBean = new PageBean<>(list,totalSize,pageSize,totalPage,currentPage);
        return pageBean;
    }
}
