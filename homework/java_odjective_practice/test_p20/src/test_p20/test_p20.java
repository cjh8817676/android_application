package test_p20;

public class test_p20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1;
		car1 = new Car();
		
		car1.num = 1234;
		car1.gas = -10;   ///指定錯誤的油量
							///要避免錯誤，應避免被外部忖取修改
		
		car1.show();
	}

}
class Car
{
	//Car 類別
	int num;
	double gas;
	void show()
	{
		System.out.println("車號是:"+ this.num);
		System.out.println("汽車油量:"+ this.gas);
	}
	
}