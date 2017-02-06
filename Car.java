
public class Car {
	int gear = 1;
	int location;
	int speed;
	int destination = 250;
	
	void reverseGear(){
		gear = (-1);
	}
	void gearUp(){
		gear = gear + 1;
		if (gear == 6){System.out.println("The gear cannot be increased anymore");}
		if (gear <0){gear = 1;}
		
		
	}
	void gearDown(){
		gear = gear - 1;
		if (gear ==1){System.out.println("The gear cannot be decreased anymore");}
		if (gear < 0){System.out.println("The gear cannot be decreased anymore becasue it is in reverse");}
		
	}

	int reportGear(){
		return gear;
	}
	int reportLocation(){
		return location;
	}
	int reportRemaining(){
		return (destination - location);
	}
	
	void moveByTime(int time){
		// Check if the value of time is positive; if time is not positive then it prints an error message stating that the time should be positive; 
		if (time <= 0){System.out.println("Time Should be positive");
		}
		// but if the time is positive then it does the following:
		else {
			// it first changes the speed to speed = gear * 20;
			speed = gear *20;
			// then it calculates a variable called delta as delta = speed * time;
			int delta = speed * time;
			// then it adds delta to location (i.e. location = location + delta).
			location = location + delta;
			// this method does not return anything (void).
		}
		
	}
	
	
	boolean isArrived(){
		if (location == destination || location > destination){
			return  true;	
		}
		else {
			return false;
		}
	}

	
	
	
}
