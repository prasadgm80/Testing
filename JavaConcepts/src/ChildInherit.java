
public class ChildInherit extends ParentInherit {
	
	public void Gear() {
		System.out.println("Gear overriding parent");  //overriding
	}
	
	public void Engine() {
		System.out.println("Engine in child class");
	}
	
	public void colour() {
		System.out.println(colour);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildInherit ci = new ChildInherit();
		ci.Brakes();
		ci.Gear();
		ci.Engine();
		ci.colour();
		
		}
	}


/* class A{
	int i = 10;
}	
	class B extends A{
		int i = 20
	}
	public class mainclass{
		
		public static void main (String{} arg s) {
			
			A a new B()
			System.out.println(a.i);
		}
		}
	
	*/
