
public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        Integer num = 45;  // Example of autoboxing from primitive to wrapper

        Integer a = 10;
        Integer b = 20;
        swap(a, b);  // This won't swap original values because Java is pass-by-value

        System.out.println(a + " " + b);  // Output: 10 20 (no swap happened)

//        final int bonus = 2;
//        bonus = 3; //  we can't modify it, since it's final

        //  my comment: when a non-primitive is declared final, you can't reassign it,
        // but you can still change its fields
        final A aashish = new A("Aashish Verma)");
        aashish.name = "other name";  // Allowed: modifying the field

        //  we can’t reassign the object reference
//        aashish = new A("new object");

        // Creating many objects to demonstrate finalize() being called by garbage collector
        A obj = new A("sadgi");
        System.out.println(obj);

//        for (int j = 0; j < 1000000000; j++) {
//            obj = new A("Random name");
//        }
    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}

class A {
    final int num = 10;  // constant variable
    String name;

    public A(String name) {
//        System.out.println("object created");  // Uncomment to track object creation
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
