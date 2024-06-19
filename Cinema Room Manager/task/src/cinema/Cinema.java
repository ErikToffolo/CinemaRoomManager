package cinema;

import java.util.Scanner;

public class Cinema {

    private static int ticketsPurchased = 0;
    private static int totalSeats = 0;
    private static int currentIncome = 0;
    private static int maxIncome = 0;

    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);

        // Read number of rows
        System.out.println("Enter the number of rows:");
        System.out.print("> ");
        int rows = scanner.nextInt();

        // Read number of seats per row
        System.out.println("Enter the number of seats in each row:");
        System.out.print("> ");
        int seatsPerRow = scanner.nextInt();

        // Create seating array, totalSeats and maxIncome
        int[][] cinema = new int[rows][seatsPerRow];
        totalSeats = rows * seatsPerRow;

        if (totalSeats > 60) {
            if (rows % 2 == 0) {
                maxIncome = totalSeats * 9;
            } else {
                maxIncome = ((rows / 2) * seatsPerRow * 10) + (rows - rows / 2) * seatsPerRow * 8;
            }
        } else {
            maxIncome = totalSeats * 10;
        }


        menu(cinema);
        // end of program
    }

    private static void menu(int[][] cinema) {
        // print menu
        System.out.println();
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");
        System.out.print("> ");

        // receive input
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                displaySeats(cinema);
                break;
            case 2:
                buyTicket(cinema);
                break;
            case 3:
                showStatistics(cinema);
                break;
            case 0:
                break;
        }
    }

    private static void showStatistics(int[][] cinema) {
        float percentageSold =  (float) ticketsPurchased * 100 / totalSeats;

        System.out.printf("%nNumber of purchased tickets: %d", ticketsPurchased);
        System.out.printf("%nPercentage: %.2f%%", percentageSold);
        System.out.printf("%nCurrent income: $%d", currentIncome);
        System.out.printf("%nTotal income: $%d%n", maxIncome);

        menu(cinema);
    }

    private static void displaySeats(int[][] cinema) {
        System.out.println();
        System.out.println("Cinema:");
        for (int i = 0; i < cinema.length + 1; i++) {
            for (int j = 0; j < cinema[0].length + 1; j++) {
                if (i == 0 && j == 0) {
                    System.out.print("  ");
                } else if (i == 0 && j > 0) {
                    System.out.print(j + " ");
                } else if (i > 0 && j == 0) {
                    System.out.print(i + " ");
                } else if (i > 0 && j > 0 && cinema[i - 1][j - 1] == 0) {
                    System.out.print("S ");
                } else {
                    System.out.print("B ");
                }
            }
            System.out.println();
        }
        menu(cinema);
    }

    private static void buyTicket(int[][] cinema) {
        Scanner scanner = new Scanner(System.in);

        boolean selectedValidSeat = false;
        int chosenRowNumber;
        int chosenSeatNumber;

        do {
            // read input row
            System.out.println();
            System.out.println("Enter a row number:");
            System.out.print("> ");
            chosenRowNumber = scanner.nextInt();

            // read input seat number
            System.out.println("Enter a seat number in that row:");
            System.out.print("> ");
            chosenSeatNumber = scanner.nextInt();
            System.out.println();

            // check if selected seat if valid
            if (chosenRowNumber > cinema.length || chosenSeatNumber > cinema[0].length) {
                System.out.printf("Wrong input!%n");
            } else if (cinema[chosenRowNumber - 1][chosenSeatNumber - 1] == -1) {
                System.out.printf("That ticket has already been purchased!%n");
            } else {
                selectedValidSeat = true;
            }

        } while (selectedValidSeat == false);




        // print ticket price and increase currentIncome
        int ticketPrice = 10;
        if (cinema.length * cinema[0].length > 60 && chosenRowNumber > cinema.length / 2) {
            ticketPrice = 8;
        }
        System.out.println("Ticket price: $" + ticketPrice);
        currentIncome += ticketPrice;

        // store chosen seat in array and increase ticketsPurchased
        cinema[chosenRowNumber - 1][chosenSeatNumber - 1] = -1;
        ticketsPurchased++;
        menu(cinema);
    }

}