/*Class: Setting
 * 
 * Enumerated type: Setting
 * 
 * Purpose and responsibilities:
 * The purpose of this class is to represent the setting that the burner is currently on. These settings are represented by the strings
 * in brackets next to the values. The setting is initialized with a string that becomes the local instance variable and acts as a translator to the 
 * enumerated type's value. The to string method returns the local instance variable of the enumerated type.
 * 
 * Authors: Mallorie M, Ben G
 * 
 * Date: 9/10/2023
 * */

public enum Setting{
	OFF("---"), LOW("--+"), MEDIUM("-++"), HIGH("+++");
	private String value="";
	Setting(String v){
		value=v;
	}
	public String toString() {
		return value;
	}

}