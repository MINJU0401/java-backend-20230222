package trainReservation.entity;

import java.util.List;

//	기차 정보 Entity class
public class Train {
	private String trainNumber;		//	열차번호
	private String departureStation;//	출발역
	private String departureTime;	//	출발시간
	private String arrivalStation;	//	도착역
	private String arrivalTime;		//	도착시간
	private int takeMinute;			//	소요시간
	private String Type;			//	열차종류(train type)
	private List<StopStation> stopStations;		//	정차역이 다수라 1:n, list로 만듦
	private List<Seat> seats;					//	잔여석은 다수라 1:n, list로 만듦

	public Train() {}

	public Train(String trainNumber, String departureStation, String departureTime, String arrivalStation,
			String arrivalTime, int takeMinute, String type, List<StopStation> stopStations, List<Seat> seats) {
		this.trainNumber = trainNumber;
		this.departureStation = departureStation;
		this.departureTime = departureTime;
		this.arrivalStation = arrivalStation;
		this.arrivalTime = arrivalTime;
		this.takeMinute = takeMinute;
		Type = type;
		this.stopStations = stopStations;
		this.seats = seats;
	}

	public String getTrainNumber() {
		return trainNumber;
	}

	public String getDepartureStation() {
		return departureStation;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public String getArrivalStation() {
		return arrivalStation;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public int getTakeMinute() {
		return takeMinute;
	}

	public String getType() {
		return Type;
	}

	public List<StopStation> getStopStations() {
		return stopStations;
	}

	public List<Seat> getSeats() {
		return seats;
	}

	@Override
	public String toString() {
		return "Train [trainNumber=" + trainNumber + ", departureStation=" + departureStation + ", departureTime="
				+ departureTime + ", arrivalStation=" + arrivalStation + ", arrivalTime=" + arrivalTime
				+ ", takeMinute=" + takeMinute + ", Type=" + Type + ", stopStations=" + stopStations + ", seats="
				+ seats + "]";
	}
	
}
