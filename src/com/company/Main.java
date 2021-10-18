package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    Random rn = new Random();

        System.out.println("How many chickens do you have?");
    int numChickens = input.nextInt();
    int numEggs = 0;
    for (int i = 0; i < 12; i++){
        for (int j = 0; j < numChickens; j++){
            numEggs += rn.nextInt(5)+26;
        }
    }
        System.out.println("the chickens produce "+numEggs+" eggs a year.");
    }
}
