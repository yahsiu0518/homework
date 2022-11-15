package com.train;

import java.util.Scanner;

public class Tester {



    public static void main(String[] args) {
        System.out.println( "Please enter number of ticket" );
        Scanner scanner = new Scanner(System.in);
        int total_tickets = scanner.nextInt();
        System.out.println( "Please enter number of round trip ticket" );
        int round_trip = scanner.nextInt();

        tickets t = new tickets(total_tickets, round_trip);
        t.print();

    }



}
