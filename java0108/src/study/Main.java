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
		
		//게시판 작업을 수행할 인스턴스를 생성
		BoardService boardService = new BoardService();
		
		while(true) {
			System.out.println(
				"1.전체보기 2.상세보기 3.삽입하기 4.수정하기 5.삭제하기 6.종료");
			System.out.print("메뉴 입력:");
			int menu = sc.nextInt();
			
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
				//글번호를 입력받아서 상세보기 메소드를 호출
				//상세보기는 글번호에 해당하는 데이터가 있으면 데이터가 리턴되고 없으면 null 
				
				//글번호 입력
				System.out.print("상세보기 할 글번호:");
				int num = sc.nextInt();
				
				Board board1 = boardService.getBoard(num);
				if(board1 == null) {
					System.out.println("글번호에 해당하는 데이터가 없습니다.");
				}else {
					System.out.println(board1);
				}
				
				break;
			case 삽입하기:
				//삽입하기는 BoardService 클래스의 insertBoard가 처리
				//인스턴스 메소드이고 매개변수는 Board 이고 리턴 타입은 boolean 입니다.
				Board board = new Board();
				
				System.out.print("제목 입력:");
				//이전에 정수 입력을 받고 엔터가 남아 있어서 이 라인이 엔터를 입력받고 넘어갑니다.
				sc.nextLine();
				String temp = sc.nextLine();
				board.setTitle(temp);
				
				System.out.print("내용 입력:");
				temp = sc.nextLine();
				board.setContent(temp);
				
				boolean r = boardService.insertBoard(board);

				break;
			case 수정하기:
				//수정할 글번호를 입력받기
				System.out.print("수정할 글번호:");
				int n = sc.nextInt();
				//글번호가 n인 데이터 찾기
				Board b = boardService.getBoard(n);
				if(b == null) {
					System.out.println("글 번호에 해당하는 데이터가 없습니다.");
					continue;
				}else {
					System.out.print("수정할 제목:");
					sc.nextLine();
					b.setTitle(sc.nextLine());
					System.out.print("수정할 내용:");
					b.setContent(sc.nextLine());
					
					boardService.updateBoard(b);
				}
				
				break;
			case 삭제하기:
				//삭제할 글번호를 입력받고
				//해당하는 데이터가 있는지 확인하고
				//정말로 삭제할 것인지 묻고 삭제
				
				System.out.print("삭제할 글번호:");
				int x = sc.nextInt();
				
				Board y = boardService.getBoard(x);
				if(y == null) {
					System.out.println("글번호에 해당하는 글이 없습니다.");
					continue;
				}else {
					System.out.print("정말로 삭제(삭제는: 1 그이외는 삭제안됨):");
					int del = sc.nextInt();
					if(del == 1) {
						boardService.deleteBoard(x);
					}
				}
				
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
