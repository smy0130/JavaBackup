package study.class_.etc.main;

import study.class_.etc.Book2;

public class Main2 {

// 정적필드(속성), 정적메소드 : 클래스명.필드, 클래스명.메소드명
// (동적)필드, (동적)메소드 : 클래스명 객체명 = new 클래스명();
// String name;
// if(name != null) {System.out.println(name);}

	public static void main(String[] args) {
			//	"꿀벌의 예언1",
			//	"베르나르베르베르",
			//	"인류의 미래를 둘러싸고 펼쳐지는 대모험");
	Book2 book = Book2.builder()
	.title("꿀벌의 예언1")
	.author("베르나르베르베르")
	.description("인류의 미래를 둘러싸고" + "펼쳐지는 대모험")
	.build();
	
	System.out.println(book);
	}

}
