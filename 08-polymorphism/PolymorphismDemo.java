class Animal {
void sound() {
System.out.println("Animal sound");
}
}
class Dog extends Animal {
@Override
void sound() {
System.out.println("Dog barks");
}
}
class Cat extends Animal {
@Override
void sound() {
System.out.println("Cat meows");
}
}
public class PolymorphismDemo {
public static void main(String[] args) {
Animal first = new Dog();
Animal second = new Cat();
first.sound();
second.sound();
}
}