package constructor;

public class Main {

	public static void main(String[] args) {
		//Member 클래스의 인스턴스를 생성
		//자바 개발자의 대부분은 인스턴스를 1개만 만드는 경우 클래스 이름의 첫글자만
		//소문자로 변환해서 이름을 생성을 합니다.
		//자바 개발을 할 때는 인스턴스를 자동으로 생성해주는 스프링 프레임워크를 많이 사용하는데
		//스프링이 이름을 만들 때 이 규칙을 적용
		Member mem1 = new Member();
		//mem1.setId("root");
		//mem1.setPw("1234");
		System.out.println("mem1.id:" + mem1.getId() + 
				" mem1.pw:" + mem1.getPw());
		
		Member mem2 = new Member();
		//mem2.setId("root");
		//mem2.setPw("1234");	
		System.out.println("mem2.id:" + mem2.getId() + 
				" mem2.pw:" + mem2.getPw());
		
		//생성자에 2개의 데이터를 대입해서 인스턴스를 생성
		Member mem3 = new Member("admin", "1000");
		System.out.println("mem3.id:" + mem3.getId() + 
				" mem3.pw:" + mem3.getPw());
		
		
		//Member 클래스의 인스턴스 배열을 생성
		//Member 인스턴스의 참조를 저장할 수 있는 공간 2개를 생성
		Member [] ar = new Member[2];
		
		//공간에 인스턴스를 생성해서 대입
		//이 구문을 생략하면 모두 null
		ar[0] = new Member();
		ar[1] = new Member();
		
		for(Member imsi : ar) {
			System.out.println(imsi);
		}
		
		//하나의 인스턴스를 생성하고 내부 데이터 설정
		Member origin = new Member();
		origin.setId("ggangpae1");
		origin.setPw("100100100");
		
		//참조형 사이의 대입
		//origin이 가리키고 있는 인스턴스를 weak도 가리킵니다.
		Member weak = origin;
		
		//weak가 id를 변경했는데 origin 것도 변경
		weak.setId("itggangpae");
		System.out.println(weak.getId());
		System.out.println(origin.getId());
		
		System.out.println("============================");
		//origin을 복제해서 대입
		Member deep = origin.clone();
		//현재는 내용이 같습니다.
		System.out.println(deep.getId());
		System.out.println(origin.getId());
		
		//복제를 해서 deep 에 대입해주었기 때문에 변경하기 전에는 같은 내용을 같지만
		//한쪽에서 내용을 변경해도 다른쪽에는 영향이 없기 때문에 deep의 내용을 변경해도 origin은 그대로
		System.out.println("============================");
		deep.setId("choongang");
		System.out.println(deep.getId());
		System.out.println(origin.getId());

	}

}












