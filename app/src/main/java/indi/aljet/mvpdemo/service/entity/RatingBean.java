package indi.aljet.mvpdemo.service.entity;

/**
 * Created by PC-LJL on 2017/9/7.
 */

public class RatingBean {
    private int max;
    private int numRaters;
    private String average;
    private int min;

    public RatingBean() {
    }

    public RatingBean(int max, int numRaters, String average, int min) {
        this.max = max;
        this.numRaters = numRaters;
        this.average = average;
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getNumRaters() {
        return numRaters;
    }

    public void setNumRaters(int numRaters) {
        this.numRaters = numRaters;
    }

    public String getAverage() {
        return average;
    }

    public void setAverage(String average) {
        this.average = average;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    @Override
    public String toString() {
        return "RatingBean{" +
                "max=" + max +
                ", numRaters=" + numRaters +
                ", average='" + average + '\'' +
                ", min=" + min +
                '}';
    }
}
