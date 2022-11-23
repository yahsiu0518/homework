package com.train;

import java.util.Scanner;

public class Tester {



    public static void main(String[] args) {
        System.out.println( "Please enter number of ticket" );
        Scanner scanner = new Scanner(System.in);
        int total_Tickets = scanner.nextInt();
        System.out.println( "How many round-trip tickets: " );
        int round_trip = scanner.nextInt();

        Tickets t = new Tickets(total_Tickets, round_trip);
        t.print();

    }



}
