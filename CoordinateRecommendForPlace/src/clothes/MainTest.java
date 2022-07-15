package clothes;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		
		ArrayList<Top> topList = new ArrayList<>();
		ArrayList<Bottom> bottomList  = new ArrayList<>();
		ArrayList<Shoses> shosesList = new ArrayList<>();
		ArrayList<Bag> bagList = new ArrayList<>();
		
		Top top0 = new Top("블라우스", "빨강색", "학원", "알바", "약속");
		Top top1 = new Top("박스티", "주황색", "학원", "알바", "여행");
		Top top2 = new Top("크롭티", "노랑색", "운동", "본가", "약속");
		Top top3 = new Top("티셔츠", "초록색", "본가", "알바", "행사");
		Top top4 = new Top("카라티", "파랑색", "학원", "운동", "술약속");
		Top top5 = new Top("셔츠", "남색", "학원", "알바", "공연");
		Top top6 = new Top("면티", "보라색", "학원", "공연", "술약속");
		Top top7 = new Top("브이넥", "하늘색", "술약속", "알바", "본가");
		Top top8 = new Top("터틀넥", "연청색", "학원", "여행", "공연");
		Top top9 = new Top("목티", "카키색", "학원", "운동", "본가");
		
		topList.add(top0);
		topList.add(top1);
		topList.add(top2);
		topList.add(top3);
		topList.add(top4);
		topList.add(top5);
		topList.add(top6);
		topList.add(top7);
		topList.add(top8);
		topList.add(top9);
		
		Bottom bottom0 = new Bottom("테니스스커트", "빨강색", "본가", "여행", "약속");
		Bottom bottom1 = new Bottom("슬랙스", "주황생", "학원", "알바", "운동");
		Bottom bottom2 = new Bottom("반바지", "노랑생", "학원", "본가", "술약속");
		Bottom bottom3 = new Bottom("연청바지", "초록색", "여행", "알바", "공연");
		Bottom bottom4 = new Bottom("청반바지", "파랑색", "학원", "행사", "약속");
		Bottom bottom5 = new Bottom("슬랙스", "남색", "학원", "행사", "술약속");
		Bottom bottom6 = new Bottom("테니스스커트", "보라색", "학원", "알바", "약속");
		Bottom bottom7 = new Bottom("진청바지", "하늘색", "공연", "알바", "약속");
		Bottom bottom8 = new Bottom("H라인스커트", "연청색", "여행", "행사", "약속");
		Bottom bottom9 = new Bottom("테니스스커트", "카키색", "술약속", "알바", "여행");
		
		bottomList.add(bottom0);
		bottomList.add(bottom1);
		bottomList.add(bottom2);
		bottomList.add(bottom3);
		bottomList.add(bottom4);
		bottomList.add(bottom5);
		bottomList.add(bottom6);
		bottomList.add(bottom7);
		bottomList.add(bottom8);
		bottomList.add(bottom9);
		
		Shoses shoses0 = new Shoses("하이힐", "빨강색", "알바", "여행", "본가");
		Shoses shoses1 = new Shoses("킬힐", "주황색", "학원", "알바", "약속");
		Shoses shoses2 = new Shoses("플랫슈즈", "노랑색", "알바", "술약속", "약속");
		Shoses shoses3 = new Shoses("운동화", "초록색", "학원", "여행", "술약속");
		Shoses shoses4 = new Shoses("러닝화", "파랑색", "행사", "공연", "약속");
		Shoses shoses5 = new Shoses("워커", "남색", "행사", "여행", "공연");
		Shoses shoses6 = new Shoses("어그부츠", "보라색", "학원", "알바", "약속");
		Shoses shoses7 = new Shoses("하이힐", "하늘색", "술약속", "여행", "약속");
		Shoses shoses8 = new Shoses("운동화", "연청색", "술약속", "여행", "약속");
		Shoses shoses9 = new Shoses("러닝화", "카키색", "행사", "여행", "약속");
		
		shosesList.add(shoses0);
		shosesList.add(shoses1);
		shosesList.add(shoses2);
		shosesList.add(shoses3);
		shosesList.add(shoses4);
		shosesList.add(shoses5);
		shosesList.add(shoses6);
		shosesList.add(shoses7);
		shosesList.add(shoses8);
		shosesList.add(shoses9);
		
		Bag bag0 = new Bag("구찌", "빨강색", "학원", "여행", "약속");
		Bag bag1 = new Bag("나이키", "주황색", "학원", "본가", "공연");
		Bag bag2 = new Bag("아디다스", "노랑색", "공연", "행사", "술약속");
		Bag bag3 = new Bag("샘소나이트", "파랑색", "알바", "여행", "약속");
		Bag bag4 = new Bag("백팩", "남색", "학원", "알바", "본가");
		Bag bag5 = new Bag("크로스백", "보라색", "행사", "여행", "약속");
		Bag bag6 = new Bag("핸드백", "카키색", "술약속", "행사", "약속");
		Bag bag7 = new Bag("클러치", "연청색", "학원", "여행", "약속");
		Bag bag8 = new Bag("구찌", "초록색", "술약속", "본가", "약속");
		Bag bag9 = new Bag("디올", "하늘색", "학원", "행사", "약속");
		
		bagList.add(bag0);
		bagList.add(bag1);
		bagList.add(bag2);
		bagList.add(bag3);
		bagList.add(bag4);
		bagList.add(bag5);
		bagList.add(bag6);
		bagList.add(bag7);
		bagList.add(bag8);
		bagList.add(bag9);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학원, 여행, 알바, 술약속, 본가, 행사, 공연");
		String place = sc.next();
		
		ArrayList<Top> pickTopList = new ArrayList<>();
		ArrayList<Bottom> pickBottomList  = new ArrayList<>();
		ArrayList<Shoses> pickShosesList = new ArrayList<>();
		ArrayList<Bag> pickBagList = new ArrayList<>();
		
		for(int i = 0; i < topList.size(); i++) {
			if(topList.get(i).rightForPlace1.equals(place) ||
				topList.get(i).rightForPlace2.equals(place) ||
				topList.get(i).rightForPlace3.equals(place)) {
					pickTopList.add(topList.get(i));
			}
		}
		
		for(int i = 0; i < bottomList.size(); i++) {
			if(bottomList.get(i).rightForPlace1.equals(place) ||
				bottomList.get(i).rightForPlace2.equals(place) ||
				bottomList.get(i).rightForPlace3.equals(place)) {
					pickBottomList.add(bottomList.get(i));
			}
		}
		
		for(int i = 0; i < shosesList.size(); i++) {
			if(shosesList.get(i).rightForPlace1.equals(place) ||
				shosesList.get(i).rightForPlace2.equals(place) ||
				shosesList.get(i).rightForPlace3.equals(place)) {
					pickShosesList.add(shosesList.get(i));
			}
		}
		
		for(int i = 0; i < bagList.size(); i++) {
			if(bagList.get(i).rightForPlace1.equals(place) ||
				bagList.get(i).rightForPlace2.equals(place) ||
				bagList.get(i).rightForPlace3.equals(place)) {
					pickBagList.add(bagList.get(i));
			}
		}
		
		boolean run = true;
		int count = 0;
		
		while(run) {
		int topNum = (int)(Math.random()*pickTopList.size());
		int bottomNum = (int)(Math.random()*pickBottomList.size());
		int shosesNum = (int)(Math.random()*pickShosesList.size());
		int bagNum = (int)(Math.random()*pickBagList.size());
		
		System.out.println(pickTopList.get(topNum).typeOfTop);
		System.out.println(pickBottomList.get(bottomNum).typeOfBottom);
		System.out.println(pickShosesList.get(shosesNum).typeOfShoses);
		System.out.println(pickBagList.get(bagNum).typeOfBag);
		
		count++;
		if(count == 3) {
			break;
		}
		
		System.out.println("다시 실행하려면 y를, 종료하려면 n을 입력");
		String choose = sc.next();
		if(choose.equals("n")) {
			break;
		}
		
		}
		
		
	
				
		
		
	}
}