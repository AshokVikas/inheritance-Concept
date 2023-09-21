package hierachicalLevel;

public class DemoMainClass {

	public static void main(String[] args) {
            Demo1 d = new Demo1 ();
            System.out.println("a=" +d.a);
            d.test();
            System.out.println("b=" +d.b);
            d.print();
            Demo2 d1 = new Demo2();
            System.out.println("c=" +d1.c);
            d1.display();
	}

}
