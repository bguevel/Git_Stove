/*Class: Burner
 * 
 * Purpose and responsibilities:
 * The purpose of this class is to represent a burner on a stove. The burner has a few instance variables a setting object mySetting
 * , a temperature object called myTemperature, an int timer, and a constant int TIME_DURATION. Burner's constructor creates a burner object
 * and sets the temperature to cold, the setting to off, and the timer to zero. The plusButton method increases the setting of the burner
 * only if it isn't the highest setting. The minusButton method decreases the setting only if the setting isn't off. Both of these methods set timer 
 * to TIME_DURATION. Display method displays the setting of the burner and the temperature. updateTemperature changes the temp of the burner if 
 * the timer has reached zero and the next temperature is within that setting's threshold.
 * 
 * Authors: Mallorie M, Ben G
 * 
 * Date: 9/10/2023
 * */


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
					timer = 0;
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
					timer = 0;
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
			}else if(mySetting == Setting.OFF) {
				//adjust based on temp
				switch(myTemperature) {
				case COLD:
					timer = 0;
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