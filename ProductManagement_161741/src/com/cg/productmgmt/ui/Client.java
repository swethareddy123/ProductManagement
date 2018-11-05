package com.cg.productmgmt.ui;

import java.util.Scanner;

import com.cg.productmgmt.exception.ProductException;
import com.cg.productmgmt.service.ProductService;

class Client {
	static ProductService proSer = new ProductService();
	public static void main(String[] args){
		//Taking input from User
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("Enter your choice\n"+"1. Update Product Price\n"+"2. Exit");
			int choice = sc.nextInt();
			switch(choice){
			case 1: updateProducts();
			break;
			case 2: System.exit(0);
			break;
			default : System.exit(0);
			}
		}

	}

	private static void updateProducts() {
		// TODO Auto-generated method stub
		//Taling User Input To Update The price
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Product Category : ");
		String proCat = sc.next();
		System.out.println("Enter hike Rate :");
		int hrate = sc.nextInt();
		//Validating the Hike
		if(hrate > 0){
			try {
				proSer.updateProducts(proCat, hrate);
			} catch (ProductException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			System.out.println("Invalid Hike Rate"+"Hike Rate should be Greater Than 0");
		}
	}
}
