package trainReservation;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import trainReservation.Controller.ReservationController;
import trainReservation.Service.ReservationService;
import trainReservation.dto.GetTrainListDto;
import trainReservation.entity.Cost;
import trainReservation.entity.Seat;
import trainReservation.entity.StopStation;
import trainReservation.entity.Train;

public class MainApplication {
	
	private static ReservationController reservationController = 
			new ReservationController();

	public static void main(String[] args) {
		reservationController.reservation();
			}
		}
	
	

 