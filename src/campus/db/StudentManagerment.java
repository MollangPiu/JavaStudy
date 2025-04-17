package campus.db;

import java.util.*;


//동적바인딩을 시키면, 확장성이 매우 뛰어납니다.
class StudentManagerment {
	
	//제네릭안에는 무조건 객체!!!
	//기본형 데이터타입은 불가능 ( int => Integer )
	private List<StudentVO> lists;
	private StudentDAO studentDao; // DB연결 class
	
	private Scanner sc;
	
	//메모리가 할당될 때, 인스턴스 변수들에게 값을 정의
	//초기 값 선언은 반드시 생성자 내에서 할 것.!
	public StudentManagerment() {
		
		this.lists = new ArrayList<StudentVO>();
		
	}
	
	
	public void main(Scanner sc) {
		this.sc = sc;
		
		// this.input();
		
		this.getPrint();
		
	}
	
	//입력
	public void input() {
		StudentVO studentVO = new StudentVO();

		System.out.println("학생의 이름을 입력해주세요.");
		String name = sc.next();
		studentVO.setName(name);
		
		System.out.println("국어 점수를 입력해주세요.");
		studentVO.setKorScore(sc.nextInt());
		
		System.out.println("영어 점수를 입력해주세요.");
		studentVO.setEngScore(sc.nextInt());
		
		System.out.println("수학 점수를 입력해주세요.");
		studentVO.setMathScore(sc.nextInt());
		
		studentDao = new StudentDAO();
		studentDao.registStatment(studentVO);
	}
	
	//출력
	public void getPrint() {
		
		//총 3가지.
		// 1. Iterator.
		// Iterator<StudentVO> it = lists.iterator();
		
		//2가지
		// hasNext => return타입 true, false
		// next
		// while();
//		while(it.hasNext()) {
//			StudentVO stu = it.next();
//			System.out.println(stu.toString());
//		}
		
		//for( 초기값; 조건값; 증감값 ) 
//		for(int i = 0; i < this.lists.size(); i++) {
//			StudentVO student = lists.get(i); // get(i)는 리스트의 데이터 타입
//			System.out.println(student.toString());
//			System.out.println("합계: "+ (student.getEngScore()+student.getKorScore()+student.getMathScore()));
//		}
		
		//3번 forEach ( 배열을 출력 할 때만 사용 가능 )
		// index (숫자)가 필요할 때는, 그냥 위에꺼 사용 하세요.
		//for('배열의 데이터타입]  for문안에서 사용할 변수명(주소) : 배열ref )
		
		studentDao = new StudentDAO();
		studentDao.printStatment();
		
		for(StudentVO  li:   this.lists) {
			System.out.println(li.toString());
		}
	}

}
