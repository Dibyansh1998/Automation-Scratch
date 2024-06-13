package Automation.RahulShettyUdemy;

public class Method_Demo {

	public static void main(String[] args) {
		
		String name="Dibyansh";
		String name2="Shubhansh";
		String name3="Bhumika";
		
		Method_Demo data= new Method_Demo();
		getData(name2);
		String var=data.getData1(name);
		System.out.println(var);
		Methods_Demo_2 d= new Methods_Demo_2();
		d.getUserData(name3);

	}
	
	//If you will use the Static keyword in Method then no need to create the Object of the class see the below example
	public static void getData(String name2) {
	
		System.out.println(name2);
		
	}
	public String getData1(String name) {
		
//		System.out.println(name);
		return name;
		
	}

}
