
abstract class  Vehicle {
	private int id;
	private String type;
	private int bill;	
	public Vehicle(int id, String type, int bill) {
		this.bill = bill;
		this.id = id;
		this.type = type;
	}
	
	public int getBill() {
		return bill; 
	}
	public int getid() {
		return id; 
	}
	public String getType() {
		return type; 
	}
	
	public void setBill(int n) {
		bill = n; 
	}
	public void setid(int i) {
		id =i; 
	}
	public void setType(String t) {
		type = t; 
	}
	
	
}
