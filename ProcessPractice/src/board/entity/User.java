package board.entity;
//	회원 
//	이메일 주소(데이터를 구분짓는 요소) (문자열) / 비밀번호(문자열) / 비밀번호 확인(문자열) /
//	닉네임(문자열) / 핸드폰번호(문자열) / 주소(문자열) / 상세 주소(문자열) / 프로필 사진(문자열) 

//	User 클래스는 보관, 관리용도로 지속적으로 사용할 요소가 모인 클래스
//	다만, 패스워드 체크는 검증만 하는 일회성이므로, User 클래스에 포함될 필요가 없다.
public class User {
	private String email;
	private String password;
	private String nickname;
	private String phoneNumber;
	private String address;
	private String addressDetail;
	private String profileImageUrl;

	public User() {}

	public User(String email, String password, String nickname, String phoneNumber, String address,
			String addressDetail, String profileImageUrl) {
		this.email = email;
		this.password = password;
		this.nickname = nickname;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.addressDetail = addressDetail;
		this.profileImageUrl = profileImageUrl;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getNickname() {
		return nickname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public String getAddressDetail() {
		return addressDetail;
	}

	public String getProfileImageUrl() {
		return profileImageUrl;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}

	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", nickname=" + nickname + ", phoneNumber="
				+ phoneNumber + ", address=" + address + ", addressDetail=" + addressDetail + ", profileImageUrl="
				+ profileImageUrl + "]";
	}
	
}
