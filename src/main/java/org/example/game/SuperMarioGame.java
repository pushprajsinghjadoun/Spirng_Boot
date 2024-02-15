package org.example.game;

public class SuperMarioGame implements GamingConsole{
    public void up(){
        System.out.println("Jump");
    }
    public void down(){
        System.out.println("Go into hole");
    }
    public void left(){
        System.out.println("Go back");
    }
    public void right(){
        System.out.println("Accelerate");
    }

    public void print(){
        System.out.println("Super Mario Game");
    }

    public void print(String name){
        System.out.println("Super Mario Game " + name);
    }

    public void print(int num){
        System.out.println("Super Mario Game " + num);
    }

    public void print(String name, int num){
        System.out.println("Super Mario Game " + name + " " + num);
    }

    public void print(int num, String name){
        System.out.println("Super Mario Game " + num + " " + name);
    }

    public void print(String name, int num, String name2){
        System.out.println("Super Mario Game " + name + " " + num + " " + name2);
    }
}
