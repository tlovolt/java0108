package study;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final int 전체보기 = 1;
		final int 상세보기 = 2;
		final int 삽입하기 = 3;
		final int 수정하기 = 4;
		final int 삭제하기 = 5;
		final int 종료 = 6;
		
		//키보드로 부터 입력받기 위한 객체 생성
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println(
				"1.전체보기 2.상세보기 3.삽입하기 4.수정하기 5.삭제하기 6.종료");
			System.out.print("메뉴 입력:");
			int menu = sc.nextInt();
			
			//게시판 작업을 수행할 인스턴스를 생성
			BoardService boardService = new BoardService();
			
			//menu에 따른 분기
			switch(menu) {
			case 전체보기:
				//BoardService 클래스의 getList 메소드가 처리할 수 있습니다.
				//static이 아닌 메소드를 사용하기 위해서 인스턴스를 생성
				//BoardService는 클래스 이름
				//new 다음에 나오는 BoardService는 생성자 이름
				Board [] boards = boardService.getList();
				//배열의 데이터 출력
				for(Board board : boards) {
					if(board != null) {
						System.out.println(board);
					}
				}
				break;
			case 상세보기:
				System.out.println("상세보기 선택");
				break;
			case 삽입하기:
				//삽입하기는 BoardService 클래스의 insertBoard가 처리
				//인스턴스 메소드이고 매개변수는 Board 이고 리턴 타입은 boolean 입니다.
				Board board = new Board();
				
				boolean r = boardService.insertBoard(board);
				
				System.out.println("삽입하기 선택");
				break;
			case 수정하기:
				System.out.println("수정하기 선택");
				break;
			case 삭제하기:
				System.out.println("삭제하기 선택");
				break;
			case 종료:
				sc.close();
				System.out.println("프로그램 종료");
				System.exit(0);//프로그램 종료
				break;
			default:
				System.out.println("메뉴 확인좀 !!!!!");
				break;
			}
		
		}
		

	}

}
