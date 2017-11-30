package com.augmentum.oes.model;

import com.augmentum.oes.util.PropertyUtil;

public class Pagination {
    private static final String KEY_PAGE_SIZE = "pagination.pageSize";
    private int totalCount;
    private int pageSize;
    private int pageCount;
    private int currentPage;
    private int offset;
    private String keyWord;
    private int OrderId;

    public int getOrderId() {
        return OrderId;
    }

    public void setOrderId(int orderId) {
        OrderId = orderId;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getPageSize() {
        if (pageSize == 0) {
            String size = PropertyUtil.getProperty(KEY_PAGE_SIZE);
            pageSize = Integer.parseInt(size);
        }

        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageCount() {

        //Math.ceil(totalCount/getPageSize()) is simple with this
        if (totalCount < 1) {
            pageCount = 0;
            return pageCount;
        }
        pageCount = (totalCount - 1) / getPageSize() + 1;

        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getOffset() {
        if (getCurrentPage() == 0) {
            offset = 0;
        } else {
            offset = (getCurrentPage() - 1) * getPageSize();
        }

        return offset;
    }

    public int getCurrentPage() {
        if (currentPage < 0) {
            currentPage = 0;
        }

        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    @Override
    public String toString() {
        return "Pagination [totalCount=" + totalCount + ", pageSize="
                + pageSize + ", pageCount=" + pageCount + ", currentPage="
                + currentPage + ", offset=" + offset + ", keyWord=" + keyWord
                + ", OrderId=" + OrderId + "]";
    }
}
