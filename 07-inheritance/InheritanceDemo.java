class Employee {
String name = "Ali ";
void work() {
System.out.println(name + "works ");
}
}
class Developer extends Employee {
void code() {
System.out.println(name + "writes Java ");
}
}
public class InheritanceDemo {
public static void main(String[] args) {
Developer developer = new Developer();
developer.work();
developer.code();
}
}