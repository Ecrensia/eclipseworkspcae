package lotto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lotto {
	int num1;
	int num2;
	int num3;
	int num4;
	int num5;
	int num6;
	
	public Lotto(int num1, int num2, int num3, int num4, int num5, int num6) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
		this.num5 = num5;
		this.num6 = num6;
	}

	public static void main(String[] args) throws IOException{
		List<Lotto> lotto = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean methodSelect = true;
		int line_Num;
		char line = 'A';
		
		System.out.println("Lotto 구매 프로그램입니다.");
		System.out.println("방식을 선택해주세요.(자동/수동)");
		
		while(true) {
			String purchaseMethod = br.readLine();
			
			if(purchaseMethod.equals("자동")) break;
			else if(purchaseMethod.equals("수동")) {
				methodSelect = false;
				break;
			}
			else System.out.println("구매 방식을 '자동' 또는 '수동'으로 입력해 주시기 바랍니다.");
		}
		
		System.out.println("구매 개수를 입력해주세요.(1~5)");
		
		Loop1:
		while(true) {
			String number_check = null;
			line_Num = Integer.parseInt(br.readLine());
			
			if(line_Num > 0 && line_Num < 6) {
				while(true){
					System.out.println("구매수량이 " + line_Num + "개가 맞습니까? 예/아니오로 입력해 주십시오");
					number_check = br.readLine();
					if(number_check.equals("예")) break Loop1;
					else if(number_check.equals("아니오")) {
						System.out.println("구매 개수를 다시 입력해 주십시오.");
						continue Loop1;
					}
					else System.out.println("잘못 입력하셨습니다.");
				}
			}
			else System.out.println("구매가능 개수는 1~5개입니다. 다시 입력해 주십시오.");
		}
		
		if(methodSelect) {
			for(int i = 0; i < line_Num; i++) {
				boolean[] random_Check = new boolean[45];
				int[] ran_Temp = new int[6];
				
				for(int j = 0; j < 6; j++) {
					int random = (int)((Math.random()*45)+1);
					if(random_Check[random-1]) {
						j--;
						continue;
					}
					else {
						random_Check[random-1] = true;
						ran_Temp[j] = random;
					}
				}
				Arrays.sort(ran_Temp);
				Lotto lottoLine = new Lotto(ran_Temp[0], ran_Temp[1], ran_Temp[2], ran_Temp[3], ran_Temp[4], ran_Temp[5]);
				lotto.add(lottoLine);
			}
		}
		else {
			for(int i = 0; i < line_Num; i++) {
				boolean[] select_Check = new boolean[45];
				int[] lot_Temp = new int[6];
				System.out.println((char)(line+i) + "열 번호를 선택해 주십시오.(1~45)");
				
				for(int j = 0; j < lot_Temp.length; j++) {
					int select_Num = Integer.parseInt(br.readLine());
					if(select_Num < 1 || select_Num > 45) {
						System.out.println("해당 번호는 존재하지 않습니다. 1~45 사이의 번호를 입력해 주십시오.");
						j--;
						continue;
					}
					
					if(select_Check[select_Num-1]) {
						for(int k = 0; k < j; k++) {
							if(k == j-1) bw.append(Integer.toString(lot_Temp[k]));
							else bw.append((Integer.toString(lot_Temp[k])) + ",");
						}
						bw.flush();
						System.out.println("번은 이미 선택하신 번호입니다. 다른 번호를 선택해 주십시오.");
						j--;
						continue;
					}
					else {
						select_Check[select_Num-1] = true;
						lot_Temp[j] = select_Num;
					}
				}
				Arrays.sort(lot_Temp);
				Lotto lottoLine = new Lotto(lot_Temp[0], lot_Temp[1], lot_Temp[2], lot_Temp[3], lot_Temp[4], lot_Temp[5]);
				lotto.add(lottoLine);
			}
		}
		br.close();
		
		System.out.println(line_Num + "개를 구매하셨습니다. 구매하신 로또를 출력합니다.");
		
		for(Lotto lot : lotto) {
			System.out.println(lot.num1 + "\t" + lot.num2 + "\t" + lot.num3 + "\t" + lot.num4 + "\t" + lot.num5 + "\t" + lot.num6);
		}
		
		System.out.println("당첨을 기원합니다. 다음에 또 이용바랍니다.");
		bw.close();
	}
}