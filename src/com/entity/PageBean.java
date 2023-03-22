package com.entity;

import java.io.Serializable;
import java.util.List;

public class PageBean<T> implements Serializable {
    private List<T> data;
    private int totalSize;
    private int pageSize;
    private int totalPage;
    private int currentPage;

    public PageBean() {
    }

    public PageBean(List<T> data, int totalSize, int pageSize, int totalPage, int currentPage) {
        this.data = data;
        this.totalSize = totalSize;
        this.pageSize = pageSize;
        this.totalPage = totalPage;
        this.currentPage = currentPage;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public int getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "data=" + data +
                ", totalSize=" + totalSize +
                ", pageSize=" + pageSize +
                ", totalPage=" + totalPage +
                ", currentPage=" + currentPage +
                '}';
    }
}
