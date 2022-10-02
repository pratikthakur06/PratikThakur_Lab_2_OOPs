package gl.oops.lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	public static int menu(Scanner sc) {
		System.out.println("***Welcome to Italiano de Cafe***");
		System.out.println("Select any item to order:-");
		System.out.println("1. Pizza");
		System.out.println("2. Pasta");
		int choice;
		do {
			System.out.println("Enter your choice:-");
			choice = sc.nextInt();
		} while (choice < 1 || choice > 2);

		return choice;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = menu(sc);
		if (choice == 1) {
			ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
			System.out.println("Select the size of the Pizza(Small/Medium/Large):");
			String pizzaSize = sc.next();
			System.out.println("Select the type of crust(Thin/Thick):");
			String crustType = sc.next();
			System.out.println("Select the type of Pizza(Vegetarian/Non-Veg/Vegan):");
			String pizzaType = sc.next();
			System.out.println("Select the topping(Cheese/Mushroom/Tomato/Jalapeno/Spinach):");
			String topping = sc.next();
			Pizza pizza = new Pizza(pizzaSize, crustType, pizzaType, topping);
			pizzas.add(pizza);
			System.out.println("Total price of Pizza: " + pizza.getPrice(pizzaSize, pizzaType, topping)+" USD.");
			int opt;
			do {
			System.out.println("Enter 0 to exit the menu or 1 to return to menu:");
			opt = sc.nextInt();
			if(opt==0) {
				System.out.println("Thank you for ordering from us. Hope to see you soon! 😉");
				System.exit(0);
			}
			else if(opt==1) {
				menu(sc);
			}
			} while(opt<0 || opt>1);
		} else if (choice == 2) {
			ArrayList<Pasta> pastas = new ArrayList<Pasta>();
			System.out.println("Select the type of sauce for Pasta(Red/White):");
			String sauce = sc.next();
			System.out.println("Select the type of Pasta(Penne/Ditalini):");
			String pastaType = sc.next();
			Pasta pasta = new Pasta(sauce, pastaType);
			pastas.add(pasta);
			System.out.println("Total price of Pasta: " + pasta.getPrice(pasta.getSauce())+" USD.");
			int opt;
			do {
			System.out.println("Enter 0 to exit the menu or 1 to return to menu:");
			opt = sc.nextInt();
			if(opt==0) {
				System.out.println("Thank you for ordering from us. Hope to see you soon! 😉");
				System.exit(0);
			}
			else if(opt==1) {
				menu(sc);
			}
			} while(opt<0 || opt>1);
		}
	}
}
