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
		System.out.println("--- ���� ���� �ý���    ----");
		System.out.println("--1. �߰�                   ----");
		System.out.println("--2. ����                   ----");
		System.out.println("--3. ����                   ----");
		System.out.println("--4. ��ü ���            ----");
		System.out.println("--5. ����                   ----");
		System.out.println("--------------------");
		choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.println("�̸��� �Է����ּ��� : ");
			
		}
	}
}
