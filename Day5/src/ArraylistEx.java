import java.util.*;

public class ArraylistEx {
	List<Dataclass> li;

	ArraylistEx() {
		new ArrayList<Dataclass>();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArraylistEx ar = new ArraylistEx();
		int choice;

		System.out.println("--------------------");
		System.out.println("--- 종합 정보 시스템    ----");
		System.out.println("--1. 추가                   ----");
		System.out.println("--2. 수정                   ----");
		System.out.println("--3. 삭제                   ----");
		System.out.println("--4. 전체 출력            ----");
		System.out.println("--5. 종료                   ----");
		System.out.println("--------------------");
		choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.println("이름을 입력해주세요 : ");
			
		}
	}
}
