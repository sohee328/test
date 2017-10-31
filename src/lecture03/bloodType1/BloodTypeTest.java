package lecture03.bloodType1;

public class BloodTypeTest {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 18, BloodType.AB);
		Person p2 = new Person("전우치", 24, BloodType.O);
		
		System.out.println(p1);
		System.out.println(p2);
		
		BloodType blood1 = BloodType.valueOf("AB");
		BloodType blood2 = BloodType.valueOf("A");
		
		System.out.println(blood1.canGiveTo(blood2));
		System.out.println(blood2.canGiveTo(blood1));
		
		for (BloodType blood : BloodType.values())
			System.out.println(blood);
		String s = "";
		if (p1.getBloodType() == BloodType.A)
			s = "A형";
		else if (p1.getBloodType() == BloodType.B)
			s = "B형";
		else if (p1.getBloodType() == BloodType.AB)
			s = "AB형";
		else if (p1.getBloodType() == BloodType.O)
			s = "O형";
		System.out.println(s);
	}
}
