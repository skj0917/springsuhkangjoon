package com.example.demo;

import com.example.demo.entity.User;

public class UserMain {
    public static void main(String[] args) {
        User u1 = new User();
        u1.setName("홍길동");
        u1.setAge(20);
        System.out.println(u1.getName());
        System.out.println(u1.getAge());

        User u2 = new User("김철수", 21);
        System.out.println(u2);

        User u3 = new User("김철수", 21);
        System.out.println(u2.equals(u3));
    }
}
