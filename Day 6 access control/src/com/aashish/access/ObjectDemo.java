package com.aashish.access;

public class ObjectDemo {

    int num;
float gpa;

    // create a constructor
    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa= gpa;

    }


    //already covered these 2
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    }
// we will go in details of how to create in hashmap lecture.
    @Override
    public int hashCode() {
 //       return super.hashCode(); // output is 149928006,    713338599 ie random number

 //       return num; // then output is 34, 34

        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
}

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
//        ObjectDemo obj = new ObjectDemo(34, "Aashish");
//        ObjectDemo obj2 = new ObjectDemo(34);
 //       ObjectDemo obj2 = obj; // then output is same number

//        ObjectDemo obj2 = new ObjectDemo(45, "Rahul");

        ObjectDemo obj1 = new ObjectDemo(34, 56.8f);
        ObjectDemo obj2 = new ObjectDemo(34, 99.5f);

        if (obj1.equals(obj2)) {
            System.out.println("obj is equal to obj2");
        }

        if (obj1 == obj2) {
            System.out.println("obj is equal to obj2");
        }
        System.out.println(obj1.getClass().getName());


//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());
    }

