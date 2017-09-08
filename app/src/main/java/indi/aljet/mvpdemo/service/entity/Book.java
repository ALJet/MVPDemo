package indi.aljet.mvpdemo.service.entity;

import java.util.List;

/**
 * Created by PC-LJL on 2017/9/7.
 */

public class Book {
    private int count;
    private int start;
    private int total;
    private List<BooksBean> books;

    public Book() {
    }

    public Book(int count, int start, int total, List<BooksBean> books) {
        this.count = count;
        this.start = start;
        this.total = total;
        this.books = books;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<BooksBean> getBooks() {
        return books;
    }

    public void setBooks(List<BooksBean> books) {
        this.books = books;
    }


    @Override
    public String toString() {
        return "Book{" +
                "count=" + count +
                ", start=" + start +
                ", total=" + total +
                ", books=" + books +
                '}';
    }
}
