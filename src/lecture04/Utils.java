package lecture04;

class StringUtils {
	public static boolean isNullOrEmpty(String s) {
		return s == null || s.length() == 0;
	}

	public static boolean isNullOrBlank(String s) {
		return s == null || s.trim().length() == 0;
	}

	public static boolean isEmpty(String s) {
		return s.length() == 0;
	}

	public static boolean isBlank(String s) {     
		return s.trim().length() == 0;   
	}
}

public class Utils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		if (StringUtils.isNullOrBlank(s) == false)
			System.out.println("내용을 입력하세요.");
	}

}
