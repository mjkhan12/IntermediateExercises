
public class Car extends Vehicle{
	
	private String colour;
	private int wheels;

	public Car(int id, String type, int bill , String colour, int wheels) {
		super(id, type, bill);
		// TODO Auto-generated constructor stub

		this.colour =colour;
		this.wheels = wheels;

	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

}
