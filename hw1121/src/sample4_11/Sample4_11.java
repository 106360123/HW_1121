package sample4_11;
public class Sample4_11 {
	public static void main(String[]args) {
		Vechicle[] vc;
		vc=new Vechicle[2];
		vc[0]=new Car(1234,20.5);
		vc[1] =new Plane(232);
		for(int i=0;i<vc.length;i++) {
			if(vc[i] instanceof Car)
				System.out.println("第"+(i+1)+"個物件是Car類別");
			else
				System.out.println("第"+(i+1)+"個物件不是Car類別");
		}
	}
}
abstract class Vechicle{
	protected int speed;
	public void setSpeed(int s) {
		speed =s;
		System.out.println("將速度設為"+speed+"了");
	}
	abstract void show();
}
class Car extends Vechicle{
	protected int num;
	protected double gas;
	public Car(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"，汽油量設為"+gas);
	}
	public void show(){
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("速度是"+speed);
	}
}
class Plane extends Vechicle{
	private int flight;
	public Plane(int f) {
		flight=f;
		System.out.println("生產了"+flight+"班次的飛機");
	}
	public void show(){
		System.out.println("飛機的班次是"+flight);
		System.out.println("速度是"+speed);
	}
}