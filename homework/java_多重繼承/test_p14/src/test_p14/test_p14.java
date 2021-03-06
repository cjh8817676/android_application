package test_p14;



public class test_p14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1; //從父類別的變數操作子類別的物件
		car1 = new RacingCar();
		//沒有辦法呼叫RacingCar類別自己新增的方法
		//因為我們是以Car類別的變數存取
		//所以只能對Car類別所有的方法存取!!!!!
		
		car1.setCar(1234, 20.5);
		
		car1.show();//可得知是這個show是子類別的方法
		//與類別本身變數無關，與new的物件有關。
	}

}
class Car
{
	protected int num;
	protected double gas;
	
	public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}

	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+",汽油量設為"+gas);
	}
	
	public void show()
	{
		System.out.println("車號為"+num);
		System.out.println("汽油量為"+gas);
	}
}
class RacingCar extends Car
{
	private int course;
	
	public RacingCar()
	{
		course = 0;
		System.out.println("生產了賽車");
	}
	public void setCourse(int c)
	{
		course = c;
		System.out.println("將賽車編號設為"+course);
	}
	public void show()
	{
		System.out.println("賽車的編號為"+course);
		System.out.println("車號為"+num);    //子類別可以存取父類別的protected
		System.out.println("汽油量為"+gas);
	}
}