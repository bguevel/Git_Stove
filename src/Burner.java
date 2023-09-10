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
		/*
		if(mySetting == Setting.HIGH && myTemperature == Temperature.BLAZING && timer==0) {
			return;
		}else if(mySetting == Setting.HIGH && myTemperature == Temperature.HOT && timer==0) {
			timer = TIME_DURATION;
			myTemperature = Temperature.BLAZING;
		}else if(mySetting == Setting.HIGH && myTemperature == Temperature.WARM && timer==0) {
			timer = TIME_DURATION;
			myTemperature = Temperature.HOT;
			
		}else if(mySetting == Setting.HIGH && myTemperature == Temperature.COLD && timer==0) {
			timer = TIME_DURATION;
			myTemperature = Temperature.WARM;
		}else if(mySetting == Setting.MEDIUM && myTemperature == Temperature.HOT && timer==0) {
			return;
		}else if(mySetting == Setting.MEDIUM && myTemperature == Temperature.WARM && timer==0) {
			timer = TIME_DURATION;
			myTemperature = Temperature.HOT;
		}else if(mySetting == Setting.MEDIUM && myTemperature == Temperature.COLD && timer==0) {
			timer = TIME_DURATION;
			myTemperature = Temperature.WARM;
		}else if(mySetting == Setting.LOW && myTemperature == Temperature.WARM && timer==0) {
			return;
		}else if(mySetting == Setting.LOW && myTemperature == Temperature.COLD && timer==0) {
			timer = TIME_DURATION;
			myTemperature = Temperature.WARM;
		}else if(mySetting == Setting.OFF && myTemperature == Temperature.WARM && timer==0) {
			timer = TIME_DURATION;
			myTemperature = Temperature.COLD;
		}*/
		
		timer--;
}
}