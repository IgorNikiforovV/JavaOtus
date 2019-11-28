package oop;

import oop.good.Bird;
import oop.good.Blackbird;
import oop.good.Crow;

public class Main {
    public static void main(String[] args) {
        Bird birds[] = {new Crow("Crow"), new Blackbird("Blackbird")};

        new Main().print(birds);

        birds[0].feed();
        birds[1].feed();

        new Main().print(birds);

        System.out.println("-----------------");

        Object o[] = {'1', 3, false, "Hi"};

        for (int x=0; x < o.length; x++){
            System.out.println(o[x].toString() + " <=");
        }

    }

    private void print(Bird[] birds){
        for (Bird bird : birds){
            System.out.println(bird);
        }
    }
}
