package example.Exchange;

import java.util.Scanner;

//	환전기 어플리케이션
//	Input : 금액, 넣을 화폐, 바꿀 화폐
//	Output : 금액, 바뀐 화폐

public class ExchangeApplication {
//	환전가능 화폐 설정하기 : 원화, 엔화, 달러
	
	private static String[] managedCurrencies = {
		"KRW", "USD", "JPY"
	};
	
	private static ExchangeRate[] exchangeRates = {
			//	원화 -> 달러
			new ExchangeRate("KRW", "USD", 1/1318.80), 
			//	원화 -> 엔
			new ExchangeRate("KRW", "JPY", 1000/0.96035), 				
			//	달러 -> 원화
			new ExchangeRate("USD", "KRW", 1318.80/1), 					
			//	달러 -> 엔
			new ExchangeRate("USD", "JPY", 1318.80/0.96035),				
			//	엔 -> 원화
			new ExchangeRate("JPY", "KRW", 0.96035/1000),					
			//	엔 -> 달러	
			new ExchangeRate("JPY", "USD", 0.96035/1318.80)
		};

	public static void main(String[] args) {	
		
		//	입력
		Scanner scanner = new Scanner(System.in);
		
		String exchangingCurrency = null;
		String exchangedCurrency = null;
		int amount = 0;
		
		try {
			System.out.println("넣을 화폐 : ");
			exchangingCurrency = scanner.nextLine();
			System.out.println("바꿀 화폐 : ");
			exchangedCurrency = scanner.nextLine();
			System.out.println("금액 : ");
			amount = scanner.nextInt();
		}
			catch (Exception exception) {
//				e.printStackTrace();    
				System.out.println("입력값이 맞지 않습니다.");
				return;
			}
		
		
				
		System.out.println(exchangingCurrency + " " + exchangedCurrency + " " + amount);
		
		//	입력 검증
		//	비정상1. 모든 값을 입력했는지 검증
		if (exchangingCurrency.isBlank() || exchangedCurrency.isBlank()) {
			System.out.println("모두 입력해주세요.");
			return;
		}
		//	입력한 화폐가 동일할 경우
		if (exchangingCurrency.equals(exchangedCurrency)) {
			System.out.println("동일한 화폐로 환전할 수 없습니다.");
		}
		//	비정상2. 유효한 금액이 아닐때(금액이 음수이거나 0인 경우)
		if (amount <= 0) {
			System.out.println("유효한 금액이 아닙니다.");
			return;
		}
		//	비정상3. 관리하고 있는 화폐단위가 아닐 경우(원,달러,엔 그 이외의 화폐)
		boolean hasExchanging = false;
		boolean hasExchanged = false;
		//	관리하는 단위는 휘발성 메모리로 상단에 생성해놓음
		for (String managedCurrencies: managedCurrencies) {
			if (exchangingCurrency.equals(managedCurrencies)) {
				hasExchanging = true;
				
				if (exchangedCurrency.equals(managedCurrencies)) {
					hasExchanged = true;
				}
			}			
		}	
		if (!(hasExchanging || hasExchanged)) {
			System.out.println("유효하지 않은 화폐단위입니다.");
			return;
		}
		
		//	정상 프로세스
		double resultAmount = amount;
		
		//	단지 읽는 용도로 사용하는 경우는 일반 for문 보다 for each문이 적합
		for (ExchangeRate exchangeRate: exchangeRates) {
			
			boolean isSame = exchangingCurrency.equals(exchangeRate.getExchangingCurrency())
					&& exchangedCurrency.equals(exchangeRate.getExchangedCurrency());
			
			if (isSame)
					{ resultAmount *= exchangeRate.getExchangeRate();	
					break;
				}		}
		
		//	정상 출력
		System.out.println(exchangedCurrency + ": " + resultAmount);
	}

}
