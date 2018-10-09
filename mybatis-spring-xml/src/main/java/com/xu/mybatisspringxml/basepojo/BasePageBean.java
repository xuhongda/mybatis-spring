package com.xu.mybatisspringxml.basepojo;

import java.io.Serializable;


/**
 * @author xuhongda
 */
public class BasePageBean implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 页数
     */
    private int page = 1;
    /**
     * 每页条数
     */
    private int limit = 30;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }


}
