package mainone;

import javax.swing.JOptionPane;

public class Mainone {

    public static void main(String[] args) {
        
        Registration obj = new Registration();
        messagehelper mh = new messagehelper();  
        
        String[] options = {"Sign Up", "Sign In", "Search Messages", "Exit"};
        
        while (true) {
            int choice = JOptionPane.showOptionDialog(
                    null, 
                    "Choose an action", 
                    "Main Menu",
                    JOptionPane.DEFAULT_OPTION, 
                    JOptionPane.INFORMATION_MESSAGE,
                    null, 
                    options, 
                    options[0]
            );

            switch (choice) {
                case 0 -> obj.signUp();
                case 1 -> obj.signIn();
                case 2 -> mh.askUserToSearch();  // <-- FIXED
                case 3, JOptionPane.CLOSED_OPTION -> {
                    JOptionPane.showMessageDialog(null, "Goodbye!");
                    System.exit(0);
                }
                default -> JOptionPane.showMessageDialog(null, "Invalid choice.");
            }
        }
    }
}
