package trainReservation.Controller;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import trainReservation.Service.ReservationService;
import trainReservation.dto.GetTrainListDto;
import trainReservation.entity.Cost;
import trainReservation.entity.Train;

//	Controller class (계층)
//	사용자로부터 입력받는 기능 / 입력받은 데이터를 검증 기능 / 비즈니스 로직의 결과를 반환

public class ReservationController {
	
	private DateTimeFormatter timeformatter = DateTimeFormatter.ofPattern("HH:mm");
	
	private ReservationService reservationService;
	
	public ReservationController() {
		this.reservationService = new ReservationService();
	}
	
	public void reservation() {
		while (true) {			
			GetTrainListDto dto = new GetTrainListDto();		//	변수명에 get같은 동사형태가 오면 안됨	
			
			LocalTime departureTime = null;
			
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
			
			List<Train> possibleTrains = reservationService.getPossibleTrainList(dto,departureTime);
		
			System.out.println(possibleTrains.toString());
		}
	}

}
