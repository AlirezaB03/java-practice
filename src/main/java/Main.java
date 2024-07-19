public class Main {
    public static void main(String[] args) {

    }
}

class Animal {
    String name;
    int age;

    public void eat() {
        System.out.println("animal is eating");
    }

    public void printAge() {
        System.out.println("animal age is " + age);
    }
}

class Cat extends Animal {

}


