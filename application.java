package Program;

import java.util.Locale;
import java.util.Scanner;

public class application {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Enter rectangle width and  height: ");
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		
		System.out.printf("Area = %.2f%n", retangulo.Area());
		System.out.printf("PERIMETER = %.2f%n", retangulo.Perimenter());
		System.out.printf("PERIMETER = %.2f%n", retangulo.Diagonal());
		
		
		
		sc.close();
		
	}

}
