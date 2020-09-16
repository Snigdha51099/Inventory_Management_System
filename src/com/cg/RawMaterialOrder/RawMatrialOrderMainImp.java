package com.cg.RawMaterialOrder;

import java.util.Scanner;

import com.cg.RawMaterialOrderDao.RawMaterialOrderServiceImpl;
import com.cg.empl.clearconsole;

public class RawMatrialOrderMainImp {

	public void function() {
		clearconsole.clearConsole();
		System.out.println(" choose \n 1- Place Raw Material Order. \n 2-Display Raw Material Order. \n 3- Update Raw Material Order. \n 4- Track Raw Material Order. \n 5- Update Raw Material Stock. \n 6- Display Supplier Details \n");
		RawMaterialOrderServiceImpl rawImplement = new RawMaterialOrderServiceImpl();
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		
	}
}
