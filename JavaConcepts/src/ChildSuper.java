
public class ChildSuper extends ParentSuper{

	String name = "Mankeshwarkar";
	
	public ChildSuper() {
		super();
		System.out.println("I am child constructor");
	}
	
	public void getData() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
public void commonMthod( ) {
		super.commonMthod();
		System.out.println("I am representing child");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildSuper cs = new ChildSuper();
		cs.getData();
		cs.commonMthod();

	}

}
