interface Printable {
void print();
}
class Report implements Printable {
@Override
public void print() {
System.out.println("Printing student report");
}
}
public class InterfaceDemo {
public static void main(String[] args) {
Printable item = new Report();
item.print();
}
}