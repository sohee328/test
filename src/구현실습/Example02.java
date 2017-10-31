package 구현실습;

public class Example02 {
	
	static String getFileName(String path) {
		int a = path.lastIndexOf("/");
		return path.substring(a+1);
	}

	public static void main(String[] args) {
		String[] a = { "c:/data/student/lecture.docx", 
						  "c:/www/mainpage.html",
						  "c:/program files/java/javac.exe" };
		for (String s : a) {
			String fileName = getFileName(s);
			System.out.println(fileName);
		}
	}
}
