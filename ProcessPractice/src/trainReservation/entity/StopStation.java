package trainReservation.entity;

//	정차역 Entity class
public class StopStation {
	private String stationName;
	private String departureTime;
	private String arrivalTime;

	public StopStation() {}

	public StopStation(String stationName, String arrivalTime, String departureTime) {
		this.stationName = stationName;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
	}

	public String getStationName() {
		return stationName;			//	직접 작성할 시에는 this.를 붙여주는게 좋음
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	@Override
	public String toString() {
		return "StopStation [stationName=" + stationName + ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime + "]";
	}
	
	
}
