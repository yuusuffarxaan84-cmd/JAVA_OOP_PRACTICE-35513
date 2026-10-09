class Student {
String name;
int age;
void introduce() {
System.out.println(name + " is " + age + "years ");
}
}
public class StudentDemo {
public static void main(String[] args) {
Student student = new Student();
student.name = "Hodan";
student.age = 21;
student.introduce();
}
}