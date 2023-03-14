package trainReservation;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import trainReservation.dto.GetTrainListDto;
import trainReservation.entity.Cost;
import trainReservation.entity.Seat;
import trainReservation.entity.StopStation;
import trainReservation.entity.Train;

public class MainApplication {
	
	private static List<Train> trains = new ArrayList<Train>();
	private static List<Cost> costs = new ArrayList<Cost>();
	
	private static DateTimeFormatter timeformatter = DateTimeFormatter.ofPattern("HH:mm");

	public static void main(String[] args) {
		initData();
	
		while (true) {			
			GetTrainListDto dto = new GetTrainListDto();		//	변수명에 get같은 동사형태가 오면 안됨	
			
			LocalTime departureTime = null;
			
//			System.out.print("출발역 : ");			
//			dto.setDepartureStation(scanner.nextLine());
//			System.out.print("도착역 : ");
//			dto.setArrivalStation(scanner.nextLine());
//			System.out.print("출발 시간 : ");
//			dto.setDepartureTime(scanner.nextLine());
//			System.out.print("인원 : ");
//			dto.setNumberOfPeople(scanner.nextInt());		//	Dto 클래스에 넣어놓음//		
			
			//	입력 검증
			
			if (dto.isEmpty()) {
				System.out.println("모두 입력하세요.");
				continue;
			}	
			
			try {
				departureTime = LocalTime.parse(dto.getDepartureTime(), timeformatter);
			} 	catch (Exception exception) {
				System.out.println("잘못된 시간입니다.");
				continue;
			}
			
			if (dto.getNumberOfPeople() <= 0) {
				System.out.println("잘못된 인원입니다.");
				continue;
			}
			
			if (dto.isEqualStation()) {
				System.out.println("출발역과 도착역이 같습니다.");
				continue;
			}
			
			//	결과반환을 위한 변수 선언 및 리터럴 생성
			
			List<Train> possibleTrains = new ArrayList<>();
			
			for (Train train: trains) {
				
				List<StopStation> stopStations = train.getStopStations();
				int sameStationIndex = -1;
				
				for (int stopStationIndex = 0; stopStationIndex < stopStations.size(); stopStationIndex++) {					
					String stopStationName = stopStations.get(stopStationIndex).getStationName();
					
					if (!dto.isEqualDepartureStation(stopStationName)) {
						continue;
					}		
					
					LocalTime stationDepartureTime = LocalTime.parse(dto.getDepartureTime(), timeformatter);
					
					if (stationDepartureTime.isBefore(departureTime)) {
						break;
					}
					
					sameStationIndex = stopStationIndex;
					break;					
				}			
				
				if (sameStationIndex == -1) {
					continue;
				}
				
				for (int stopStationIndex = 0; stopStationIndex < stopStations.size(); stopStationIndex++) {
					
					String stationName = stopStations.get(stopStationIndex).getStationName();
					
					if (!dto.isEqualArrivalStation(stationName)) {
						continue;
					}
					if (stopStationIndex <= sameStationIndex) {
						break;
					}
					
					possibleTrains.add(train);
					break;
				}
				
			}		
			
			System.out.println(possibleTrains.toString());
		}				
	}
	
	private static void initData() {
		
		costs.add(new Cost("부산역", "서울역", 30000));
		costs.add(new Cost("부산역", "대전역", 20000));
		costs.add(new Cost("부산역", "대구역", 10000));
		costs.add(new Cost("대구역", "서울역", 20000));
		costs.add(new Cost("대구역", "대전역", 10000));
		costs.add(new Cost("대전역", "서울역", 10000));
		
		costs.add(new Cost("서울역", "부산역", 30000));
		costs.add(new Cost("서울역", "대구역", 20000));
		costs.add(new Cost("서울역", "대전역", 10000));
		costs.add(new Cost("대전역", "부산역", 20000));
		costs.add(new Cost("대전역", "대구역", 10000));
		costs.add(new Cost("대구역", "부산역", 10000));

		Train train;
		List<Seat> seats = new ArrayList<>();
		List<StopStation> stopStations = new ArrayList<>();
		
		seats.add(new Seat(1, "A1", false));		
		seats.add(new Seat(1, "B1", false));	
		seats.add(new Seat(1, "A2", false));	
		seats.add(new Seat(1, "B2", false));	
		seats.add(new Seat(2, "A1", false));	
		seats.add(new Seat(2, "B1", false));	
		seats.add(new Seat(2, "A2", false));	
		seats.add(new Seat(2, "B2", false));	
		seats.add(new Seat(3, "A1", false));	
		seats.add(new Seat(3, "B1", false));	
		seats.add(new Seat(3, "A2", false));	
		seats.add(new Seat(3, "B2", false));	
		
		stopStations.add(new StopStation("서울역", "", "06:00"));
		stopStations.add(new StopStation("대전역", "06:45", "07:00"));
		stopStations.add(new StopStation("대구역", "07:45", "08:00"));
		stopStations.add(new StopStation("부산역", "09:00", ""));
		
		train = new Train("KTX001", "서울역", "06:00", "부산역", "09:00", 180, "KTX", stopStations, seats);
		trains.add(train);
		
		seats = new ArrayList<>();
		stopStations = new ArrayList<>();
		
		seats.add(new Seat(1, "A1", false));		
		seats.add(new Seat(1, "B1", false));	
		seats.add(new Seat(1, "A2", false));	
		seats.add(new Seat(1, "B2", false));	
		seats.add(new Seat(2, "A1", false));	
		seats.add(new Seat(2, "B1", false));	
		seats.add(new Seat(2, "A2", false));	
		seats.add(new Seat(2, "B2", false));	
		seats.add(new Seat(3, "A1", false));	
		seats.add(new Seat(3, "B1", false));	
		seats.add(new Seat(3, "A2", false));	
		seats.add(new Seat(3, "B2", false));	
		
		stopStations.add(new StopStation("부산역", "", "09:00"));
		stopStations.add(new StopStation("대구역", "09:45", "10:00"));
		stopStations.add(new StopStation("대전역", "10:45", "11:00"));
		stopStations.add(new StopStation("서울역", "12:00", ""));
		
		train = new Train("KTX002", "부산역", "09:00", "서울역", "12:00", 180, "KTX", stopStations, seats);
		trains.add(train);

	}

}
 