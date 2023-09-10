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