import java.util.ArrayList;

public class PaintWizard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Paint paint1 = new Paint ("CheapoMax", 20, 19.99, 10 );
		Paint paint2 = new Paint ("AverageJoes", 15, 17.99, 11 );
		Paint paint3 = new Paint ("Duluxurous", 10, 25.00, 20 );

		ArrayList<Paint> paints = new ArrayList<Paint>();
		paints.add(paint1);
		paints.add(paint2);
		paints.add(paint3);
		
		Rooms room = new Rooms(4, 200);
		PaintWizard p = new PaintWizard(); 
		
		String answer = p.getCheapest(paints, room);
		
		System.out.println(answer);
	}
	
	public String getCheapest(ArrayList<Paint> paints, Rooms m )
	{
		int totalRoom = m.getMeter() * m.getMeter();
		double [] priceOfPaints = new double[paints.size()];
		for (int i = 0; i < paints.size(); i++){
			
			double temp = totalRoom/paints.get(i).getM();
			int temp2 = 0;
			while (temp>0) {
				temp2 = temp2 + 1;
				temp = temp - (double) paints.get(i).getLiters();
			}
			
			priceOfPaints[i] = (double) (((paints.get(i).getPrice() *100) * temp2) /100); 
		}
		double min = 1000;
		int index = 0; 
		for (int i = 0; i < priceOfPaints.length; i++) {
			if (priceOfPaints[i] < min) {
				min = priceOfPaints[i]; 
				index = i;
			}
		
	
		}
		return paints.get(index).getName(); 
	}
	
	

}
