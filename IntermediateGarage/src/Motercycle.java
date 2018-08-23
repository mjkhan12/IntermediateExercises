
public class Motercycle extends Vehicle{
	
	private int wheels;
	private String colour;

	
	public Motercycle(int id, String type, int bill, String colour, int wheels) {
		super(id, type, bill);
		// TODO Auto-generated constructor stub
		this.wheels = wheels;
		this.colour = colour;
		
	}


	public int getWheels() {
		return wheels;
	}


	public void setWheels(int wheels) {
		this.wheels = wheels;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}

}
