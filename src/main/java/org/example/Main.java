package org.example;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
       // cat.name ="";
        //cat.age = -1000;
        //cat.weight = 0;
          cat.setName("Tom");
          cat.setAge(2);
          cat.setWeight(10);

          Cat cat2 = new Cat("Alex",3,80);
        System.out.println(cat.getName());
    }
}