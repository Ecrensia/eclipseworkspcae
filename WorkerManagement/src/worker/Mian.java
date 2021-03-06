package worker;

import java.util.Scanner;

public class Mian {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Company company = new Company();
		
		boolean run = true;
		
		while(run) {
			System.out.println("주메뉴> 1.목록, 2.추가, 3.수정, 4.삭제, 0.종료");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 0:
				run = false;
				System.out.println("프로그램이 종료됩니다.");
				break;
				
			case 1:
				System.out.println("ID \t Name \t JoinDate");
				company.printWorkerList();
				break;
				
			case 2:
				System.out.println("사원에게 할당할 ID를 입력하세요.");
				int id1 = sc.nextInt();
				System.out.println("사원의 이름을 입력하세요.");
				String name1 = sc.next();
				System.out.println("사원의 입사일을 입력하세요.");
				String joinDate1 = sc.next();
				if(company.addWorker(id1, name1, joinDate1)) System.out.println("새로운 사원이 추가되었습니다.");
				else System.out.println("입력하신 ID는 이미 사용되고 있습니다. 다시 시도해 주십시오.");
				break;
				
			case 3:
				System.out.println("수정하고자 하는 사원의 ID를 입력하십시오.");
				int id_find = sc.nextInt();
				if(company.findOverlappingWorker(id_find) != null) {
					System.out.println("수정하고자 하는 사원의 ID를 다시 한 번 입력하십시오.");
					int id_find2 = sc.nextInt();
					System.out.println("새로 할당할 ID를 입력하십시오.");
					int id2 = sc.nextInt();
					System.out.println("새로 할당할 이름을 입력하십시오.");
					String name2 = sc.next();
					System.out.println("새로 할당할 입사일을 입력하십시오.");
					String joinDate2 = sc.next();
					if(company.updateWorker(id_find2, id2, name2, joinDate2)) System.out.println("수정에 성공하였습니다.");
					else System.out.println("입력하신 ID는 이미 사용되고 있습니다. 다시 시도해 주십시오.");
				}
				break;
				
			case 4:
				System.out.println("삭제할 사원의 ID를 입력해 주십시오.");
				int id3 = sc.nextInt();
				if(company.deleteWorker(id3)) System.out.println("삭제에 성공하였습니다.");
				else System.out.println("존재하지 않는 ID입니다. 다시 시도해 주십시오.");
				break;
			}
		}
		sc.close();
	}
}