package test_p45;
public class test_p45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ŧicar1");
		Car car1;
		car1 = new Car();
		car1.setCar(1234, 20.5);
		
		System.out.println("�ŧicar2");
		Car car2;
		car2 = new Car();
		
		System.out.println("�NCar1���w(���Ѧ�)��car2");
		car2 = car1;//car1�Bcar2 �ѦҦP�@����
		
		System.out.println("car1��");
		car1.show();
		
		System.out.println("car2��");
		car2.show();
		
		System.out.println("����car1���������");
		car1.setCar(2345, 30.5);
		
		System.out.println("car1��");
		car1.show();
		
		System.out.println("car2��");
		car2.show();
		
	}

}
class Car
{
	private int num;  
	private double gas;
	
	public Car()  //�غc�l
	{
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("�Ͳ��F����"+num+"�T�o�q��"+gas+"�����l");
	}
	
	public void show()
	{
		System.out.println("�����O:"+ this.num);
		System.out.println("�T���o�q:"+ this.gas);
	}
}