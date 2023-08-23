package study.class_.etc;

public class Book2 {
	//필드(속성) 영역 - 데이터 은닉(Data Encryption)
	private String title;
	private String author;
	private String description;
	private String bb;
	
	//생성자 영역
	public Book2() {}
	public Book2(String title, String auther, String description) {
		this.title = title;
		this.author = author;
		this.description = description;
	}
	
	// Getters/Setter 메소드 영역 - 생략
	
	// 메소드
	// 동적 메소드 - 오버라이드 메소드	
	@Override
	public String toString() {
		return String.format("Book(title=%s, author=%s, " + "description=%s )", 
		this.title, this.author, this.description);
		
	}

	// 내부 클래스(inner class)
	public static 
	class BookBuilder{
		// 필드 영역
		private String title;
		private String author;
		private String description;
		
		// 생성자
		public BookBuilder() {}
		// 메소드 영역
		public BookBuilder title(String title) {
			this.title = title;
			return this;		
		}
		public BookBuilder author(String title) {
			this.author = author;
			return this;		
		}
		public BookBuilder description(String title) {
			this.description = description;
			return this;
		}
		public Book2 build() {
			return new Book2(
					this.title, this.author, this.description);
		}
	}
	public static BookBuilder builder() {
		return new BookBuilder();
	}
}
