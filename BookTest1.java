package working;

public class BookTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookTest1 bk = new BookTest1();
		bk.test1();
	}

	public void test1() {
		BookDTO1 book1 = new BookDTO1(21424, "Java Basic", "김하나", "Jaen.kr", 15000, "Java 기본 문법");
		BookDTO1 book2 = new BookDTO1(33455, "JDBC Pro", "김철수", "Jaen.kr", 23000, "");
		BookDTO1 book3 = new BookDTO1(55355, "Servlet/JSP", "박자바", "Jaen.kr", 41000, "Model2 기반");
		BookDTO1 book4 = new BookDTO1(35332, "Android App", "홍길동", "Jaen.kr", 25000, "Lightweight Framework");
		BookDTO1 book5 = new BookDTO1(35355, "OOAD 분석,설계", "소나무", "Jaen.kr", 30000, "");
		System.out.println("************************도서목록****************************");
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());
		System.out.println(book4.toString());
		System.out.println(book5.toString());
	}

}
