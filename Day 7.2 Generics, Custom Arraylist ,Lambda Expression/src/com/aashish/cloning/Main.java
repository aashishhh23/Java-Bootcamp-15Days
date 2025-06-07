package com.aashish.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human aashish = new Human(34, "aashish Verma" );
 //       Human twin = new Human(aashish);

        Human twin = (Human)aashish.clone();
        System.out.println(twin.age+ " "+ twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] =100;

        System.out.println(Arrays.toString(aashish.arr));

    }
}
