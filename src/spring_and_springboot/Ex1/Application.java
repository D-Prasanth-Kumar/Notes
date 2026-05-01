package spring_and_springboot.Ex1;
// package com

public class Application {
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");

        User user1 = container.getBean("user", User.class);
        System.out.println(user1);

        User user2 = container.getBean("user", User.class);
        System.out.println(user2);

        User user3 = container.getBean("user", User.class);
        System.out.println(user3);

        // output of all three will be same, as spring follow singleton design pattern.
    }
}
