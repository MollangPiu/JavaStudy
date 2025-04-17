package campus.db;

//클래스 내에는
//필드, 메소드, (생성자)

// vo를 만들었는데, 나중에 테이블 설계서가 바꼇네? 그 순간에만 보시면 된다.
// 정말 단순하게, 테이블 컬럼대로 만들면 된다.
// 정확하게는, 내가 원하는 데이터만 필요에 의해서 작성
// vo는 보통 입력, 출력 용도가 모두 별도로 존재. ( 기능 별로 )
// 입력용 vo, 출력용 vo. (회원가입용 )
// 출력용 vo , [검색 조건이 있을 경우] 입력용 vo 추가 ( 학생 조회 )
// 입력, 출력 vo ( 학생 수정용 )
public class StudentVO {

	private int idx;
	private String name;
	private int korScore;
	private int engScore;
	private int mathScore;
	
	//접근제어자 반환데이터타입 메소드명( 매게변수 )
	public void setName(String name) {
		this.name = name;
	}
	
	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getName() {
		return this.name;
	}

	public int getKorScore() {
		return korScore;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	
	@Override
	public String toString() {
		return "StudentVO [name=" + name + ", korScore=" + korScore + ", engScore=" + engScore + ", mathScore="
				+ mathScore + "]";
	}
}
