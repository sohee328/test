package lecture01;

public class ex01 {
	static void test01() {
		String s1 = "hello";
		System.out.println(s1.charAt(1));
	}

	static void test02() {
		String s1 = "aaa", s2 = "bbb";
		System.out.println(s1.compareTo(s2) > 0);
	}

	static void test03() {
		String s1 = " ";
		System.out.println(s1.isEmpty());
	}

	static void test04() {
		String s1 = "aaa", s2 = "AAA";
		s1.toUpperCase();
		System.out.println(s1.equals(s2));
	}

	static void test05() {
		String s1 = "hello";
		System.out.println(s1.indexOf('e'));
	}

	static void test06() {
		int a = 0;
		test06_1(a);
		System.out.println(a);
	}

	static void test06_1(int a) {
		++a;
	}

	static void test07() {
		String s1 = "ab cd ef";
		System.out.println(s1.split(" ").length);
	}

	static void test08() {
		String s1 = "hello";
		String s2 = s1;
		s2 = s1.toUpperCase();
		System.out.printf("%s %s\n", s1, s2);
	}

	static void test09() {
		String s1 = "hello";
		System.out.println(s1 instanceof String);
		System.out.println(s1 instanceof CharSequence);
	}

	static void test10() {
		double d = 3.14;
		System.out.printf("%07.3f %.3f\n", d, d);
	}

	static void test11() {
		StringBuilder s1 = new StringBuilder(), s2 = new StringBuilder();
		s1.append("hello");
		s2.append("hello");
		System.out.println(s1.equals(s2));
	}

	static void test12() {
		String s1 = "hello world";
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < s1.length(); ++i)

			builder.append(s1.charAt(i)).append(i);
		System.out.println(builder.toString());
	}

	static void test13() {
		int[] a = { 1, 2, 3 };
		test13_1(a);
		System.out.println(a[0]);
	}

	static void test13_1(int[] a) {
		a[0] = 10;
	}

	static void test14() {
		Object[] a = { 1, new Integer(2), 3 };
		for (int i = 0; i < a.length; ++i)
			System.out.print(a[i] instanceof Integer);
		System.out.println();
	}

	static void test15() {
		String[] a1 = { "a", "b", "c" };
		String[] a2 = { "a", "b", "c" };
		System.out.print(a1 == a2);
		System.out.print(a1.equals(a2));
		System.out.println();
	}

	static void test16() {
		String[] a = new String[3];
		a[0] = "hello";
		a[1] = a[0].toUpperCase();
		a[2] = a[0];
		System.out.print(a[0] == a[2]);
		System.out.print(a[0].equals(a[2]));
		System.out.println();
	}

	static void test17() {
		Object[] a1 = new Object[4];
		a1[0] = new Integer[] { 11, 22, 33 };
		a1[1] = new String[] { "a", "b", "c" };
		a1[2] = 4;
		a1[3] = new Data[] { new Data(5, "d"), new Data(6, "e") };
	}

	public static void main(String[] args) {
		test01();
		test02();
		test03();
		test04();
		test05();
		test06();
		test07();
		test08();
		test09();
		test10();
		test11();
		test12();
		test13();
		test14();
		test15();
		test16();
		test17();
	}
}

class Data {
	int i;
	String s;

	public Data(int i, String s) {
		this.i = i;
		this.s = s;
	}
}
