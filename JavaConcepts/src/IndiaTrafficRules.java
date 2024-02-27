
public class IndiaTrafficRules implements CountryTrafficRules, ContinentalTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountryTrafficRules c = new IndiaTrafficRules();
		c.greeGo();
		c.RedStop();
		c.yellowWait();
		
		IndiaTrafficRules a = new IndiaTrafficRules();
		a.walkRules();
		
		ContinentalTraffic cont= new IndiaTrafficRules();
	cont.Train();
	}
	
@Override
	public void greeGo() {
		// TODO Auto-generated method stub
		System.out.println("Implement GreegGo");
		}
@Override
	public void RedStop() {
		// TODO Auto-generated method stub
		System.out.println("Implement RedStop");	
	}
@Override
	public void yellowWait() {
		// TODO Auto-generated method stub
		System.out.println("Implement YellowWait");
		
	}

public void walkRules() {
	
	System.out.println("These are walking rules");
}

@Override
public void Train() {
	// TODO Auto-generated method stub
	
}





}
