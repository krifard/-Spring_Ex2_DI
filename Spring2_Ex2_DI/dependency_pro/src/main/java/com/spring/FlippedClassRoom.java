package com.spring;

import java.util.List;

public class FlippedClassRoom {

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
    public void GetClassRoomInfo()
    {
        int i = 0;
        try
        {
            for(ClassRoom c: clsroom) {
                c.ShowMentorInfo();
                c.ShowStudentInfo();
                c.ShowLocationInfo();
                System.out.println("XXXXXXXXXXXXXX");
                System.out.println(i+1);
                i++;

            }
        }
        catch(Exception e)
        {

        }

    }
}
