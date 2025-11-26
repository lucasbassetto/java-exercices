package org.example.ForWhile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PartyList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> partyList = new ArrayList<>();

        while(true) {
            System.out.print("Enter the name of a guest (or type 'see list' to view the party list, 'exit' to finish): ");
            String input = scanner.nextLine();

            if(input.isBlank()) {
                System.out.println("Name cannot be empty. Please enter a valid name.");
                continue;
            }

            if(input.equalsIgnoreCase("exit")) {
                break;
            }

            if(input.equalsIgnoreCase("see list")) {
                System.out.println("Party List: " + partyList);
                continue;
            }

            if(partyList.contains(input)) {
                System.out.println("This guest is already on the list.");
            } else {
                partyList.add(input);
                System.out.println(input + " has been added to the party list.");
            }

        }


    }
}
