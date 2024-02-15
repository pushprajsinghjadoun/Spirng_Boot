package org.example.game;

import org.springframework.stereotype.Component;

@Component
public class PangGame implements GamingConsole{
    public void up(){
        System.out.println("Jump");
    }
    public void down(){
        System.out.println("Go into a hole");
    }
    public void left(){
        System.out.println("Go back");
    }
    public void right(){
        System.out.println("Accelerate");
    }

    public void print(){
        System.out.println("Mario Game");
    }

    public void print(String name){
        System.out.println("Mario Game " + name);
    }

    public void print(String name, int age){
        System.out.println("Mario Game " + name + " " + age);
    }

    public void print(int age, String name){
        System.out.println("Mario Game " + name + " " + age);
    }

    public void print(int age, String name, int height){
        System.out.println("Pang Game " + name + " " + age + " " + height);
    }
}
