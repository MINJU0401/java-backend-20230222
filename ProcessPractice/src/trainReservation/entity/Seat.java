package trainReservation.entity;

//	잔여 좌서 Entity class
public class Seat {
	private int roomNumber;
	private String seatNumber;
	private boolean seatStatus;

	public Seat() {}

	public Seat(int roomNumber, String seatNumber, boolean seatStatus) {
		this.roomNumber = roomNumber;
		this.seatNumber = seatNumber;
		this.seatStatus = seatStatus;		
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public boolean isSeatStatus() {		//	boolean 형태라 get이 is로 바뀜
		return seatStatus;
	}
	
	public void setSeatStatus(boolean seatStatus) {
		this.seatStatus = seatStatus;
	}

	@Override
	public String toString() {
		return "Seat [roomNumber=" + roomNumber + ", seatNumber=" + seatNumber + ", seatStatus=" + seatStatus + "]";
	}
	
	
}
