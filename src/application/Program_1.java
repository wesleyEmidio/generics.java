package application;

import java.util.Scanner;

import services.PrintService_1;

public class Program_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
		PrintService_1<Integer> ps = new PrintService_1<>();
		
		System.out.print("Quantos valores ?");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		Integer x = (Integer) ps.first();
		System.out.println("");
		System.out.println("First: " + x);
		
		sc.close();
	}

}
