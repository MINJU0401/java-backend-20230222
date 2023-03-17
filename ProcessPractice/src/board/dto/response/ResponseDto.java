package board.dto.response;

//	사용자에게 동일한 형태로 값을 반환해주는 포맷

public class ResponseDto<D> {
	
	private boolean status;
	private String message;
	private D data;
	
	public ResponseDto() {}

	public ResponseDto(boolean status, String message, D data) {
		this.status = status;
		this.message = message;
		this.data = data;
	}

	public boolean isStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}

	public D getData() {
		return data;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setData(D data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ResponseDto [status=" + status + ", message=" + message + ", data=" + data + "]";
	}
	

}
