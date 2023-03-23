package managementSystem;

import java.text.SimpleDateFormat;
import java.util.UUID;

public class CustomerInfo {
	
	private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy. MM. dd.");
	
	private String customerNumber;
	private String name;
	private String gender;
	private String date;
	private String address;
	private String telNumber;
	private boolean marketing;
	private boolean personalInfo;
	
	
	public CustomerInfo() {}

	public CustomerInfo(String customerNumber, String name, String gender, String date, String address,
			String telNumber, boolean marketing, boolean personalInfo) {
		this.customerNumber =  UUID.randomUUID().toString();
		this.name = name;
		this.gender = gender;
		this.date = simpleDateFormat.format(null);
		this.address = address;
		this.telNumber = telNumber;
		this.marketing = marketing;
		this.personalInfo = personalInfo;
		
		
	}

	public static SimpleDateFormat getSimpleDateFormat() {
		return simpleDateFormat;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getDate() {
		return date;
	}

	public String getAddress() {
		return address;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public boolean isMarketing() {
		return marketing;
	}

	public boolean isPersonalInfo() {
		return personalInfo;
	}

	public static void setSimpleDateFormat(SimpleDateFormat simpleDateFormat) {
		CustomerInfo.simpleDateFormat = simpleDateFormat;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	public void setMarketing(boolean marketing) {
		this.marketing = marketing;
	}

	public void setPersonalInfo(boolean personalInfo) {
		this.personalInfo = personalInfo;
	}

	@Override
	public String toString() {
		return "CustomerInfo [customerNumber=" + customerNumber + ", name=" + name + ", gender=" + gender + ", date="
				+ date + ", address=" + address + ", telNumber=" + telNumber + ", marketing=" + marketing
				+ ", personalInfo=" + personalInfo + "]";
	}
}
