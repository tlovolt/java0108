package method;

public class Student {
	//인스턴스 변수 선언
	private int num;
	private String name;
	private String major;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		//this 가 붙으면 메소드 내부에서는 찾지 않고 
		//메소드 외부에서 먼저 찾습니다.
		//this.num 은 메소드 외부에 있는 인스턴스 변수 num 이고
		//num은 메소드의 매개변수 num이 됩니다.
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
}
