package campus.list;

import java.util.Scanner;

class LinkedNodeScore {
	static LinkedNodeSub head;
	static LinkedNodeSub cur;

	public static void main(String[] args) {
		head = cur = new LinkedNodeSub();
		head.nexts = null;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("------------------------");
			System.out.println("|   ★성적 관리 시스템입니다★    |");
			System.out.println("-------------------------");
			System.out.println("원하는 작업을 선택하세요:");
			System.out.println("1. 학생 성적 입력");
			System.out.println("2. 학생 성적 삭제");
			System.out.println("3. 학생 성적 조회");
			System.out.println("4. 종료");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				input();
				break;
			case 2:
				del();
				break;
			case 3:
				con();
				break;
			case 4:
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("잘못된 번호입니다.");
				break;
			}
		}
	}

	public static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 명의 성적을 입력할까요?");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.print("학생 이름을 넣어주세요.");
			String name = sc.next();
			System.out.print("영어 성적을 넣어주세요.");
			int eng = sc.nextInt();
			System.out.print("국어 성적을 넣어주세요.");
			int kor = sc.nextInt();
			System.out.print("수학 성적을 넣어주세요.");
			int mat = sc.nextInt();
			System.out.println("========================");

			LinkedNodeSub sub = new LinkedNodeSub();
			sub.setName(name);
			sub.setKor(kor);
			sub.setEng(eng);
			sub.setMat(mat);
			sub.nexts = head;
			head = sub;
		}
	}

	public static void del() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 번째 학생 데이터를 삭제할까요? "); // 데이터 삭제
		int del = sc.nextInt();

		cur = head;
		if (del == 1) {
			head = head.nexts;
		} else {
			cur.nexts = cur.nexts.nexts;
		}
		cur = head;

		System.out.println("-------------------삭제 완료된 데이터 입니다.-------------------");
		System.out.println("|  이름  |  영어점수  |  국어점수  |  수학점수  |   총점   |   평균   |");
		System.out.println("-------------------------------------------------------");
		while (cur.getName() != null) {
			System.out.print("| " + cur.getName() + "  |");
			System.out.print("    " + cur.getEng() + "   |");
			System.out.print("    " + cur.getKor() + "   |");
			System.out.print("   " + cur.getMat() + "   |");
			System.out.print("   "+ (cur.getEng()+cur.getKor()+cur.getMat())+"  |");
            System.out.println("   "+ ((cur.getEng()+cur.getKor()+cur.getMat())/3.f)+"  |");
			cur = cur.nexts;
		}
		System.out.println("-------------------------------------------------------");
	}

	public static void con() {
		cur = head;
		System.out.println("--------------------------------------------------------");
		System.out.println("|  이름  |  영어점수  |  국어점수  |  수학점수  |   총점   |   평균   |");
		System.out.println("--------------------------------------------------------");
		while (cur.getName() != null) {
			System.out.print("| " + cur.getName() + "  |");
			System.out.print("    " + cur.getEng() + "   |");
			System.out.print("    " + cur.getKor() + "   |");
			System.out.print("   " + cur.getMat() + "   |");
			System.out.print("   "+ (cur.getEng()+cur.getKor()+cur.getMat())+"  |");
            System.out.println("   "+ ((cur.getEng()+cur.getKor()+cur.getMat())/3.f)+"  |");
			cur = cur.nexts;
		}
		System.out.println("--------------------------------------------------------");
	}
}
