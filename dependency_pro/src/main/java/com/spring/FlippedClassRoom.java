package com.spring;

import java.util.List;

public class FlippedClassRoom extends ClassRoom{

    public List<ClassRoom> getClsroom() {
        return clsroom;
    }

    public void setClsroom(List<ClassRoom> clsroom) {
        this.clsroom = clsroom;
    }

    public List<ClassRoom> clsroom;

    private int duration;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }




    }

