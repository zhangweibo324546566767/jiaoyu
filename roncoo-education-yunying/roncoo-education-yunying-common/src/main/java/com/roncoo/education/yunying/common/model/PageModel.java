package com.roncoo.education.yunying.common.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PageModel<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private int pageon;
    private int rowcount;
    private int pagecount;
    private int row;
    private int start;
    private int end;
    private int pageNumber;
    private List<T> list = new ArrayList<>();

    public int getPageon() {
        return pageon;
    }
    public void setPageon(int pageon) {
        this.pageon = pageon;
    }
    public int getRowcount() {
        return rowcount;
    }
    public void setRowcount(int rowcount) {
        this.rowcount = rowcount;
    }
    public int getPagecount() {
        return pagecount;
    }
    public void setPagecount(int pagecount) {
        this.pagecount = pagecount;
    }
    public int getRow() {
        return row;
    }
    public void setRow(int row) {
        this.row = row;
    }
    public PageModel(int pageon, int row, int rowcount) {
        pageNumber = 11;
        this.pageon = pageon;
        this.row = row;
        this.rowcount = rowcount;
        compute();
    }
    public PageModel(int pageon, int row) {
        pageNumber = 11;
        this.pageon = pageon;
        this.row = row;
    }
    public PageModel(int pageon) {
        pageNumber = 11;
        this.pageon = pageon;
    }
    public PageModel() {
        pageNumber = 11;
    }
    public int getPageNumber() {
        return pageNumber;
    }
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
    public void compute() {
        if (rowcount <= 0){return;}

        if (row <= 0){row = 10;}

        pagecount = rowcount % row != 0 ? rowcount / row + 1 : rowcount / row;
        if (pageon > pagecount){ pageon = pagecount;}

        if (pageon < 1){ pageon = 1;}

        start = (pageon - 1) * row;
        end = pageon * row;
        if (end > rowcount){end = rowcount;}

    }
    public int getStart() {
        return start;
    }
    public void setStart(int start) {
        this.start = start;
    }
    public int getEnd() {
        return end;
    }
    public void setEnd(int end) {
        this.end = end;
    }
    public void setRowcountAndCompute(int rowcount) {
        this.rowcount = rowcount;
        compute();
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
