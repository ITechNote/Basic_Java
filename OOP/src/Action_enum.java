//https://www.bookstack.cn/read/java-se6/docs-ch11.md
public enum Action_enum {
	TURN_LEFT, TURN_RIGHT, GO_STRAIGHT;
	
	public String getTurn() {
		switch(this.ordinal()){
			case 0:
				return "Car turns left";
			case 1:
				return "Car turns right";
			case 2:
				return "Car go straight";
			default:
				return null;
		}
	}
	
	
}
