package 구현실습;

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class Example04 {
	public static void main(String[] args) {
		Object[] a = new Object[3];
		Object[] b = a;
		Person p = new Person ("임꺽정", 22);
		
		a[0] = new Double[] {1.1, 2.2, 3.3};
		a[1] = new Object[] {"a", "b", "c"};
		a[2] = new Person[] {p,p};
	}
}
