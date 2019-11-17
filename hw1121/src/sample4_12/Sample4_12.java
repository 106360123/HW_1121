package sample4_12;
public class Sample4_12 {
	public static void main(String[]args) {
		iVechicle[] ivc;
		ivc=new iVechicle[2];
		ivc[0]=new Car(1234,20.5);
		ivc[1] =new Plane(232);
		for(int i=0;i<ivc.length;i++) {
			ivc[i].show();
		}
	}
}
interface iVechicle{
	int weight=1000;
	void show();
}
class Car implements iVechicle{
	protected int num;
	protected double gas;
	public Car(int n,double g) {
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+"�A�T�o�q�]��"+gas);
	}
	public void show(){
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}
class Plane implements iVechicle{
	private int flight;
	public Plane(int f) {
		flight=f;
		System.out.println("�Ͳ��F"+flight+"�Z��������");
	}
	public void show(){
		System.out.println("�������Z���O"+flight);
	}
}