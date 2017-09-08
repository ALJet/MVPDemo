package indi.aljet.mvpdemo.service.entity;

/**
 * Created by PC-LJL on 2017/9/7.
 */

public class ImageBean {

    private String small;
    private String large;
    private String medium;

    public ImageBean() {
    }

    public ImageBean(String small, String large, String medium) {
        this.small = small;
        this.large = large;
        this.medium = medium;
    }


    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    @Override
    public String toString() {
        return "ImagesBean{" +
                "small='" + small + '\'' +
                ", large='" + large + '\'' +
                ", medium='" + medium + '\'' +
                '}';
    }
}
