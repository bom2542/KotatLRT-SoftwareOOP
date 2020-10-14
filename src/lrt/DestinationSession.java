package lrt;

public class DestinationSession extends TicketPrice{
	protected String orig;
	protected String desc;
	
	public void getStationNameEN(String orig) {
		this.orig = orig;
	}
	
	public void getDesination(String desc) {
		this.desc = desc;
	}
	
	public String getOrig() {
		return orig;
	}
	
	public String getDesc() {
		return desc;
	}

}
