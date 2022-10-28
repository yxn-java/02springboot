package com.example.w3cschool_springdemo8;

public class Student {


    private ClassRoom classRoom;
    //在构造方法中实现classRoom对象注入
    public Student(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }


    public void printClassRoomName() {
        System.out.println(classRoom.getClassRoomName());
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

}
