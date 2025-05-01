package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		
		Product product = new Product();
		System.out.println("Enter product data :");
		System.out.print("Enter name :");
		product.name = sc.nextLine();
		System.out.print("Enter price :");
		product.price = sc.nextDouble();
		System.out.print("Enter quantity :");
		product.quantity = sc.nextInt();
		
	
		
		System.out.println(product);
		System.out.print("Enter the number of products to be added in stock :");
		int quantity = sc.nextInt();
		product.AddProducts(quantity);
		System.out.println("Updated data: " + product);
		
		System.out.print("Enter the number of products to be removed from stock :");
		quantity = sc.nextInt();
		product.RemoveProducts(quantity);
		System.out.print("Updated data: " + product);
		
		
		sc.close();
		
	}

}
