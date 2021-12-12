package use.pkgcase.csc3380;

import java.util.Scanner;

//Names: Nathan Vedros, Stephen Hoorman, Janusz Wojcik, Devonte Whitley
public class UseCaseCSC3380 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //*Log into QuickEats App*
        System.out.print("Please Log in: ");
        String name = in.nextLine();
        System.out.print("Enter Password: ");
        String password = in.nextLine();
        //*Welcome screen and choose a restaurant*
        System.out.printf("Welcome to QuickEats, " + name + "!\nPlease choose a Restaurant: ");
        String restaurant = in.nextLine();
        System.out.printf("Thank you for choosing " + restaurant + "!\nWhat would you like to order?\nPlease choose the corresponding number.\n");
        //*Menu Display*
        System.out.println("                     Menu                        ");
        System.out.println("-------------------------------------------------");
        System.out.println("(1)  Appetizer 1                            $9.99");
        System.out.println("(2)  Appetizer 2                           $11.59");
        System.out.println("(3)  Appetizer 3                            $8.50");
        System.out.println("-------------------------------------------------");
        System.out.println("(4)  Entree 1                              $12.99");
        System.out.println("(5)  Entree 2                              $10.69");
        System.out.println("(6)  Entree 3                              $14.20");
        System.out.println("(7)  Entree 4                              $15.99");
        System.out.println("(8)  Entree 5                              $19.99");
        System.out.println("-------------------------------------------------");
        System.out.println("(9)  Dessert 1                              $3.99");
        System.out.println("(10) Dessert 2                              $5.09");
        System.out.println("(11) Dessert 3                              $6.99");
        System.out.println("-------------------------------------------------");
        System.out.println("    Please choose 0 if you are done ordering.    ");
        int foodOrder = in.nextInt();
        String foodType = "";
        double price = 0.00;
        //*While loop and switch statement to pick items off menu*
        while (foodOrder != 0) {
            switch (foodOrder) {
                case 1:
                    foodType += "Appetizer 1 ";
                    double appetizer1 = 9.99;
                    price += appetizer1;
                    System.out.println("Would you like to order more items?");
                    break;
                case 2:
                    foodType += "Appetizer 2 ";
                    double appetizer2 = 11.59;
                    price += appetizer2;
                    System.out.println("Would you like to order more items?");
                    break;
                case 3:
                    foodType += "Appetizer 3 ";
                    double appetizer3 = 8.50;
                    price += appetizer3;
                    System.out.println("Would you like to order more items?");
                    break;
                case 4:
                    foodType += "Entree 1 ";
                    double entree1 = 12.99;
                    price += entree1;
                    System.out.println("Would you like to order more items?");
                    break;
                case 5:
                    foodType += "Entree 2 ";
                    double entree2 = 10.69;
                    price += entree2;
                    System.out.println("Would you like to order more items?");
                    break;
                case 6:
                    foodType += "Entree 3 ";
                    double entree3 = 14.20;
                    price += entree3;
                    System.out.println("Would you like to order more items?");
                    break;
                case 7:
                    foodType += "Entree 4 ";
                    double entree4 = 15.99;
                    price += entree4;
                    System.out.println("Would you like to order more items?");
                    break;
                case 8:
                    foodType += "Entree 5 ";
                    double entree5 = 19.99;
                    price += entree5;
                    System.out.println("Would you like to order more items?");
                    break;
                case 9:
                    foodType += "Dessert 1 ";
                    double dessert1 = 3.99;
                    price += dessert1;
                    System.out.println("Would you like to order more items?");
                    break;
                case 10:
                    foodType += "Dessert 2 ";
                    double dessert2 = 5.09;
                    price += dessert2;
                    System.out.println("Would you like to order more items?");
                    break;
                case 11:
                    foodType += "Dessert 3 ";
                    double dessert3 = 6.99;
                    price += dessert3;
                    System.out.println("Would you like to order more items?");
                    break;
                default:
                    System.out.println("Invalid order number.");
                    System.out.println("Would you like to order more items?");
                    break;
            }
            foodOrder = in.nextInt();
        }

            //*Shows total price and ends the order.
            System.out.printf("Your total is: " + price + ".");
            System.out.println("\nThank you for ordering! We will contact you when it is ready!");
            in.close();
        }
    }

