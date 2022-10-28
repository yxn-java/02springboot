package com.example.w3cschool_springdemo7;

public class Student {


    private ClassRoom classRoom;


    public void printClassRoomName() {
        System.out.println(classRoom.getClassRoomName());
    }


    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }
}
