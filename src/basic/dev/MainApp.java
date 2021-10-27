package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a");
		int a = sc.nextInt();
		System.out.println("Nhap b");
		int b = sc.nextInt();
		
		
		int tong = a + b; 
		System.out.println("Tong: " + tong);
		int hieu = a - b;
		System.out.println("Hieu: " + hieu);
		int nhan = a * b;
		System.out.println("Nhan: " + nhan);
		int chia = a / b; 
		System.out.println("Chia: " +chia);
		
		//Gan c
		boolean c = a > b;
		System.out.println("So sanh c bang a lon hon b: " + c);
		c = a < b;
		System.out.println("So sanh c bang a nho hon b: " + c);
		c = a <= b;
		System.out.println("So sanh c bang a nho hon bang b: " + c);
		c = b <= a;
		System.out.println("So sanh c bang a lon hon bang b: " + c);

		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
	}

}
