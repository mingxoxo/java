package kr.ac.sejong.Java1;

public class App {
	public static void main(String[] args) {
		Sphere s1 = new Sphere(3, 4, 5, 6);
		//Upcasting
		Circle c1 = (Circle) s1;
		System.out.println(c1.getArea());
		
		//Downcasting 원래 안됨
		Circle c2 = new Circle(3,4,5);
		//Sphere s2 = (Sphere)c2;
		//System.out.println(s2.getArea());
		
		//확인해주는 코드
		boolean c1InstanceOfSphere = c1 instanceof Sphere;
		if(c1InstanceOfSphere) {
			Sphere s2 = (Sphere)c1;
			System.out.println(s2.getVolume());
		}
	}
}
