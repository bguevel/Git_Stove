public class Burner{
	public enum Temperature{
		BLAZING, HOT, WARM, COLD;
	}
	public static final int TIME_DURATION=2;
	private Setting mySetting;
	private Temperature myTemperature;
	private int timer;
	public Temperature getMyTemperature() {
		return myTemperature;
	}
	public Burner(){
		myTemperature = Temperature.COLD;
		mySetting = Setting.OFF;
		timer=0;
	}
	public void plusButton() {
		switch(mySetting) {
		case HIGH :
			// should there also be return in this one
			break;
		case MEDIUM :
			mySetting = Setting.HIGH;
			break;
		case LOW :
			mySetting = Setting.MEDIUM;
			break;
		case OFF:
			mySetting = Setting.LOW;
			break;

		}
		timer = TIME_DURATION;
	}
	public void minusButton() {
		switch(mySetting) {
		case HIGH:
			mySetting = Setting.MEDIUM;
			break;
		case MEDIUM:
			mySetting = Setting.LOW;
			break;
		case LOW:
			mySetting = Setting.OFF;
			break;
		case OFF:
			// should there also be return in this one
			break;
		}
		timer = TIME_DURATION;
	}
	public void display() {
		System.out.print("["+mySetting.toString()+"].....");
		if(myTemperature == Temperature.COLD) {
			System.out.println("cooool");
		}else if(myTemperature == Temperature.WARM) {
			System.out.println("warm");
		}else if(myTemperature == Temperature.HOT) {
			System.out.println("CAREFUL");
		}else if(myTemperature == Temperature.BLAZING) {
			System.out.println("VERY HOT! DON'T TOUCH");
	}
	}
	public void updateTemperature(){
		if(timer!=0) timer--;
		//check timer
		if(timer == 0) {
			//organize by setting, and within do individual rules
			if(mySetting == Setting.HIGH) {
				//adjust based on temp
				switch(myTemperature) {
				case COLD:
					myTemperature = Temperature.WARM;
					timer = TIME_DURATION;
					break;
				case WARM:
					myTemperature = Temperature.HOT;
					timer = TIME_DURATION;
					break;
				case HOT:
					myTemperature = Temperature.BLAZING;
					timer = 0;
					break;
				case BLAZING:
					//timer = 0;
					break;
				}
			}else if(mySetting == Setting.MEDIUM) {
				//adjust based on temp
				switch(myTemperature) {
				case COLD:
					myTemperature = Temperature.WARM;
					timer = TIME_DURATION;
					break;
				case WARM:
					myTemperature = Temperature.HOT;
					timer = 0;
					break;
				case HOT:
					//timer = 0;
				case BLAZING:
					myTemperature = Temperature.HOT;
					timer = TIME_DURATION;
					break;
				}
				
			}else if(mySetting == Setting.LOW) {
				//adjust based on temp
				switch(myTemperature) {
				case COLD:
					myTemperature = Temperature.WARM;
					timer = 0;
					break;
				case WARM:
					//timer = 0;
					break;
				case HOT:
					myTemperature = Temperature.WARM;
					timer = TIME_DURATION;
					break;
				case BLAZING:
					myTemperature = Temperature.HOT;
					timer = TIME_DURATION;
					break;
				}
			}else if(mySetting == Setting.OFF) {
				//adjust based on temp
				switch(myTemperature) {
				case COLD:
					//timer = 0;
					break;
				case WARM:
					myTemperature = Temperature.COLD;
					timer = 0;
					break;
				case HOT:
					myTemperature = Temperature.WARM;
					timer = TIME_DURATION;
					break;
				case BLAZING:
					myTemperature = Temperature.HOT;
					timer = TIME_DURATION;
					break;
				}
			}
		}
}
}