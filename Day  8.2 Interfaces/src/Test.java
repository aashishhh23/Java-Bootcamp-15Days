import com.aashish.interfaces.animals.Animal;
import com.aashish.interfaces.animals.Cat;
import com.aashish.interfaces.animals.Dog;
import com.aashish.interfaces.devices.SmartPhone;

public class Test {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        Cat cat = new Cat();
//        dog.eat();
//
//        // to access animal and Dog
//        System.out.println(Dog.MAX_AGE);
//        System.out.println(Animal.MAX_AGE);
//        Animal.info();
//        dog.run(1,2);
//        cat.run(2,3);
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.makeCall("3543856347");
        smartPhone.endCall();
        smartPhone.playMusic();
        smartPhone.takePhoto();
        smartPhone.recordVideo();

    }
}
