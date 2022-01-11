package com.softserveinc;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        System.out.println("Please enter # of task you would like to verify (1,2,3 values are possible)");
        Scanner sc = new Scanner(System.in);
        Task01 firstTask = new Task01();
        Task02 secondTask = new Task02();
        Task03 thirdTask = new Task03();
        int cups = -1;
        int water = -1;
        int milk = -1;
        int beans = -1;
        int maxCups;
        if (sc.hasNextInt()) {
            int taskNumber = sc.nextInt();
            switch (taskNumber) {
                case 1:
                    System.out.print(firstTask.MakeCoffee());
                    break;
                case 2:
                    System.out.print("Write how many cups of coffee you will need:\n>>>");
                    if (sc.hasNextInt()) {
                        cups = sc.nextInt();
                        System.out.print("For " + cups + " cup(s) of coffee you will need:\n" +
                                secondTask.CalcWater(cups) + " ml of water\n" +
                                secondTask.CalcMilk(cups) + " ml of milk\n" +
                                secondTask.CalcBeans(cups) + " g of coffee beans");
                    } else {
                        System.out.println("You have entered invalid data");
                        break;
                    }
                    break;
                case 3:
                    System.out.print("Write how many ml of water the coffee machine has:\n>>> ");
                    if (sc.hasNextInt()) {
                        water = sc.nextInt();
                    } else {
                        System.out.println("You have entered invalid data");
                        break;
                    }
                    System.out.print("Write how many ml of milk the coffee machine has:\n>>> ");
                    if (sc.hasNextInt()) {
                        milk = sc.nextInt();
                    } else {
                        System.out.println("You have entered invalid data");
                        break;
                    }
                    System.out.print("Write how many grams of coffee beans the coffee machine has:\n>>> ");
                    if (sc.hasNextInt()) {
                        beans = sc.nextInt();
                    } else {
                        System.out.println("You have entered invalid data");
                        break;
                    }
                    System.out.print("Write how many cups of coffee you will need:\n>>> ");
                    if (sc.hasNextInt()) {
                        cups = sc.nextInt();
                    } else {
                        System.out.println("You have entered invalid data");
                        break;
                    }
                    maxCups = thirdTask.MaxCups(water,milk,beans);
                    if (maxCups>cups) {
                        System.out.println("Yes, I can make that amount of coffee (and even "+(maxCups-cups)+" more than that)");
                    }
                    if (maxCups==cups) {
                        System.out.println("Yes, I can make that amount of coffee");
                    }
                    if (maxCups<cups) {
                        System.out.println("No, I can make only "+maxCups+" cup(s) of coffee");
                    }
                    break;
                default:
                    System.out.println("Task # should be 1, 2 or 3");
                    break;
            }
        } else {
            System.out.println("You have entered invalid data");
        }
    }
}
