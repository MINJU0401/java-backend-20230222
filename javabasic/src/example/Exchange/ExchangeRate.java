package example.Exchange;

//	화폐 : 화폐 = 환율

public class ExchangeRate {
	
	//	넣을 화폐 : (ex. 원화, 달러, 엔화, 위안 ...)
	private String exchangingCurrency;
	//	바꿀 화폐 : (ex. 원화, 달러, 엔화, 위안 ...)
	private String exchangedCurrency;
	//	환율 ( 1,000원 / 1,316.30$ )
	private double exchangeRate;
	
	//	다른 클래스에서 사용할 수 없도록 private 접근제어자로 선언
	// (생성자 자동생성) 우클릭 > source > genertate contructor using field
	
	public ExchangeRate(String exchangingCurrency, String exchangedCurrency, double exchangeRate) {
		super();
		this.exchangingCurrency = exchangingCurrency;
		this.exchangedCurrency = exchangedCurrency;
		this.exchangeRate = exchangeRate;
	}

//	Get 메서드와 Set method
//	Get 메서드 : 인스턴스가 가지고 있는 특정 인스턴스 변수의 값을 반환해주기 위한 메서드. getter라고 함.
//	Get method의 매개변수(파라미터) : 이미 갖고있는 값을 반환하는 것이기 때문에 필요한 매개변수는 없음.	
//	작성 : get인스턴스변수명

//	Set 메서드 : 인스턴스가 가지고 있는 특정 인스턴스 변수를 변경할 때 사용하는 메서드. setter라고 함. 
//	Set method의 매개변수(파라미터) : 바꾸고자 하는 값을 적으면 됨.
	
// (getter setter 자동생성) 우클릭 > source > genertate contructor getters and setters
	
	public String getExchangingCurrency() {
		return exchangingCurrency;
	}

	public void setExchangingCurrency(String exchangingCurrency) {
		this.exchangingCurrency = exchangingCurrency;
	}

	public String getExchangedCurrency() {
		return exchangedCurrency;
	}

	public void setExchangedCurrency(String exchangedCurrency) {
		this.exchangedCurrency = exchangedCurrency;
	}

	public double getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

//	(to string 메서드 자동생성) 
	@Override
	public String toString() {
		return "ExchangeRate [exchangingCurrency=" + exchangingCurrency + ", exchangedCurrency=" + exchangedCurrency
				+ ", exchangeRate=" + exchangeRate + "]";
	}

//	후일에 롬복(?)이라는 라이브러리를 쓰게되면 이런 자동생성도 안쓰게 될것임
}
