package Automation.RahulShettyUdemy;

public class Method_Demo {

	public static void main(String[] args) {
		
		Method_Demo data= new Method_Demo();
		getData();
		String var=data.getData1();
		System.out.println(var);
		Methods_Demo_2 d= new Methods_Demo_2();
		d.getUserData();

	}
	
	//If you will use the Static keyword in Method then no need to create the Object of the class see the below example
	public static void getData() {
	
		System.out.println("Dibyansh Verma");
		
	}
	public String getData1() {
		
		System.out.println("Shubhansh Verma");
		return "Ishu Verma";
		
	}

}
