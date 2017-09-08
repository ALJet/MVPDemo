package indi.aljet.mvpdemo.service.entity;

/**
 * Created by PC-LJL on 2017/9/7.
 */

public class TagsBean {
    private int count;
    private String name;
    private String title;

    public TagsBean() {
    }

    public TagsBean(int count, String name, String title) {
        this.count = count;
        this.name = name;
        this.title = title;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
