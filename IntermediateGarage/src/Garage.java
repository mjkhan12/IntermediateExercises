import java.util.ArrayList;

public class Garage {
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car Vehilcle1 = new Car(1, "Karun" , 0, "pink", 4);
		Truck Vehilcle2 = new Truck(2, "Noor" , 0, "red", 8);
		Motercycle Vehilcle3 = new Motercycle(3, "Melvin" , 0, "yellow", 2);
		Boat Vehilcle4 = new Boat(4, "Lucy" , 0, "orange", 0);
		ArrayList<Vehicle> allVehicles = new ArrayList<Vehicle>();
		
		
		Garage g = new Garage();
		g.addVehicle(Vehilcle1, allVehicles);
		g.addVehicle(Vehilcle2, allVehicles);
		g.addVehicle(Vehilcle3, allVehicles);
		g.addVehicle(Vehilcle4, allVehicles);
		
		
		g.calculateBill(allVehicles);
		
		for (Vehicle v: allVehicles) {
				 System.out.println(v.getBill() + " "+ v.getType());
			 
		}
		
		g.removeVehicle(allVehicles, 2, "Noor");
		for (Vehicle v: allVehicles) {
			 System.out.println(v.getBill() + " "+ v.getType() + "2");
		 
		}
		
		
		g.emptyGarage(allVehicles);
		
		for (Vehicle v: allVehicles) {
			 System.out.println(v.getBill() + " "+ v.getType() + "3");
		 
			}
	}

	public void addVehicle(Vehicle v, ArrayList<Vehicle> av) {
		av.add(v);
	}
	
	public void emptyGarage(ArrayList<Vehicle> av) {
		av.removeAll(av);
	}
	
	public void removeVehicle(ArrayList<Vehicle> av , int id, String Type) {
		int a = -1; 
		for (Vehicle v: av) {
			if(v.getid() == id && v.getType().equals(Type)){
				a = av.indexOf(v);
				av.remove(a);
				break; 
			}
		}
	}
	
	
	public void calculateBill(ArrayList<Vehicle> garage) {
		int finalBill = 0; 
		for (Vehicle v: garage) {
			if (v instanceof Car) {
				v.setBill(1*30);
			}
			else if (v instanceof Truck) {
				v.setBill(1*50);
			}
			else if (v instanceof Boat) {
				v.setBill(1*20);
			}
			else if (v instanceof Motercycle) {
				v.setBill(1*10);
			} else {
				v.setBill(1*2);
			}
			
		}
		
	}

}
