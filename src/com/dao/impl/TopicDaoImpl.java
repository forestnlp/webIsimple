package com.dao.impl;

import com.dao.TopicDao;
import com.entity.Topic;
import com.jdbc.BaseDao;

import java.util.List;

public class TopicDaoImpl extends BaseDao implements TopicDao {
    @Override
    public List<Topic> findByPage(String title, int currentPage, int pageSize) {
        String sql = "select * from topic where title like ? limit ?,?";
        List<Topic> list = baseQuery(Topic.class, sql, "%"+title+"%",(currentPage - 1) * pageSize, pageSize);
        return list;
    }

    @Override
    public int getTotalSize(String title) {
        String sql = "select count(*) from topic where title like ? ";
        return baseQueryInt(sql,"%"+title+"%");
    }

    public static void main(String[] args) {
        int totalSize = new TopicDaoImpl().getTotalSize("no ");
        System.out.println(totalSize);
    }
}
