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
		case LOW :
			mySetting = Setting.MEDIUM;
		case OFF:
			mySetting = Setting.LOW;
		
		}
		timer = TIME_DURATION;
	}
	public void minusButton() {
		switch(mySetting) {
		case HIGH:
			mySetting = Setting.MEDIUM;
		case MEDIUM:
			mySetting = Setting.LOW;
		case LOW:
			mySetting = Setting.OFF;
		case OFF:
			// should there also be return in this one
			break;
		}
		timer = TIME_DURATION;
	}
	public void display() {
		if(myTemperature == Temperature.BLAZING) {
			System.out.println(mySetting.toString()+"....."+"VERY HOT! DON'T TOUCH");
		}
	}
	public void updateTemperature(){
		
		
		
		
		
		
		
		/*
		if(mySetting == Setting.HIGH && myTemperature == Temperature.BLAZING && timer==0) {
			return;
		}
		if(mySetting == Setting.HIGH && myTemperature == Temperature.HOT && timer==0) {
			timer = TIME_DURATION;
			myTemperature = Temperature.BLAZING;
		}
		if(mySetting == Setting.HIGH && myTemperature == Temperature.WARM && timer==0) {
			timer = TIME_DURATION;
			myTemperature = Temperature.HOT;
			
		}
		if(mySetting == Setting.HIGH && myTemperature == Temperature.COLD && timer==0) {
			timer = TIME_DURATION;
			myTemperature = Temperature.WARM;
		}
		if(mySetting == Setting.MEDIUM && myTemperature == Temperature.HOT && timer==0) {
			return;
		}
		if(mySetting == Setting.MEDIUM && myTemperature == Temperature.WARM && timer==0) {
			timer = TIME_DURATION;
			myTemperature = Temperature.HOT;
		}
		if(mySetting == Setting.MEDIUM && myTemperature == Temperature.COLD && timer==0) {
			timer = TIME_DURATION;
			myTemperature = Temperature.WARM;
		}
		if(mySetting == Setting.LOW && myTemperature == Temperature.WARM && timer==0) {
			return;
		}
		if(mySetting == Setting.LOW && myTemperature == Temperature.COLD && timer==0) {
			timer = TIME_DURATION;
			myTemperature = Temperature.WARM;
		} 
		 * */

}
}