package com.entity;

import java.io.Serializable;

public class Topic implements Serializable {
    private int id;
    private String title;
    private String url;
    private String page_create_time;
    private String view_count;

    public Topic() {
    }

    @Override
    public String toString() {
        return "Topic{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", page_create_time='" + page_create_time + '\'' +
                ", view_count='" + view_count + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPage_create_time() {
        return page_create_time;
    }

    public void setPage_create_time(String page_create_time) {
        this.page_create_time = page_create_time;
    }

    public String getView_count() {
        return view_count;
    }

    public void setView_count(String view_count) {
        this.view_count = view_count;
    }
}
