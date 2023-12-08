package com.snow2;

public class SkiSlope {
    private int fullLength;
    private int course;
    private int lift;
    private int parkItem;

    public SkiSlope(int fullLength, int course, int lift, int parkItem) {
        this.fullLength = fullLength;
        this.course = course;
        this.lift = lift;
        this.parkItem = parkItem;
    }

    public int getFullLength() {
        return fullLength;
    }

    public int getCourse() {
        return course;
    }

    public int getLift() {
        return lift;
    }

    public int getParkItem() {
        return parkItem;
    }
}
