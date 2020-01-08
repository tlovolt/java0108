package study;

public class Board {
	//저장할 항목을 private 변수로 생성
	//글번호, 제목, 내용
	private int num;
	private String title;
	private String content;
	
	//일련번호 생성을 위한 static 변수를 1개 생성
	private static int sequence;
	//생성자
	public Board() {
		sequence = sequence + 1;
		num = sequence;
	}
	
	//인스턴스 변수 사용을 위한 접근자 메소드
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	//디버깅을 위한 메소드
	//출력하는 메소드에 인스턴스를 대입했을 때 호출되는 메소드
	//자바는 인스턴스를 출력하는 메소드에 대입하면 toString 이라는 메소드가 호출됩니다.
	//인스턴스 변수의 값을 전부 확인하고자 할 때  일일이 get 메소드를 부르는 것은 코드의 낭비
	//이런 경우에는 toString()을 호출해서 한번에 확인
	@Override
	public String toString() {
		return "Board [num=" + num + ", title=" + title + ", content=" + content + "]";
	}
}




