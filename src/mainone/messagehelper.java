package mainone;

import java.util.Scanner;

public class messagehelper {

    private String[] messages = {
        // the user is supposed to add their own messages
        "Did you get the cake?",
        "Where are you?",
        "I am outside.",
        "It is dinner time!"
    };

    // method to return stored messages
    private String[] getmessage() {
        return messages;
    }

   
    public void askUserToSearch() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter keyword to search: ");
        String userInput = sc.nextLine();
        searchMessage(userInput);   // uses your existing search method
    }

    // method to search for a keyword
    private void searchMessage(String keywords) {
        boolean found = false;
        keywords = keywords.toLowerCase(); // Converts to lowercase

        System.out.println("\nSearch Results:");

        for (String msg : messages) {
            if (msg.toLowerCase().contains(keywords)) {
                System.out.println("- " + msg);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching messages found.");
        }
    }

    public void displayLong() {
        if (messages == null || messages.length == 0) {
            System.out.println("No messages available");
            return;
        }

        String longest = messages[0];

        for (int i = 0; i < messages.length; i++) {
            if (messages[i].length() > longest.length()) {
                longest = messages[i];
            }
        }

        System.out.println("Longest message: " + longest);
    }
}
