package mainone;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Registration {
    private String registeredUser;
    private String registeredPassword;
    private String registeredPhone;

    ArrayList<String> disregardMessage = new ArrayList<String>();
    ArrayList<String> storedMessage = new ArrayList<String>();
    ArrayList<String> sentMessage = new ArrayList<String>();
    HashSet<String> uniqueMessageID = new HashSet<String>();  // Fixed incorrect type

    public boolean userNameCheck(String username) {
        if (username.contains("$") && username.length() >= 3) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Error: Your username should contain '$' and be longer than 3 characters.");
            return false;
        }
    }

    public boolean passwordCheck(String password) {
        if (password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^*+\\-])(?=\\S+$).{5,}$")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Error: Password is weak.");
            return false;
        }
    }

    public boolean cellNumberCheck(String cellphone) {
        if (cellphone.matches("^(\\+27|0)[6-8][0-9]{8}$")) {
            JOptionPane.showMessageDialog(null, "Cellphone number added correctly.");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Error: Cellphone number incorrectly formatted.");
            return false;
        }
    }

    public void signUp() {
        String userName = JOptionPane.showInputDialog("Enter your username");
        String userPassword = JOptionPane.showInputDialog("Enter your password");
        String userCellNumber = JOptionPane.showInputDialog("Enter your cell number");

        if (userNameCheck(userName) && passwordCheck(userPassword) && cellNumberCheck(userCellNumber)) {
            registeredUser = userName;
            registeredPassword = userPassword;
            registeredPhone = userCellNumber;
            JOptionPane.showMessageDialog(null, "Sign up successful!");
        } else {
            JOptionPane.showMessageDialog(null, "Sign up failed.");
        }
    }

    public void signIn() {
        if (registeredUser == null || registeredPassword == null) {
            JOptionPane.showMessageDialog(null, "You need to sign up before you can sign in.");
            return;
        }

        String userName = JOptionPane.showInputDialog("Enter your username to login");
        String userPassword = JOptionPane.showInputDialog("Enter your password to login");

        if (userName.equals(registeredUser) && userPassword.equals(registeredPassword)) {
            String[] options = {"Send message", "Coming soon", "Exit"};
            int choices = JOptionPane.showOptionDialog(null, "Welcome to chatbot", "Options",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choices) {
                case 0 -> sendMessage();
                case 1 -> JOptionPane.showMessageDialog(null, "Coming soon");
                case 2 -> System.exit(0);
            }

            JOptionPane.showMessageDialog(null, "Login successful!");
        } else {
            JOptionPane.showMessageDialog(null, "Invalid login credentials.");
        }
    }

    public void sendMessage() {
        String recipientNumber;
        do {
            recipientNumber = JOptionPane.showInputDialog(null, "Enter recipient number");
            if (recipientNumber == null) return;

            if (!cellNumberCheck(recipientNumber)) {
                JOptionPane.showMessageDialog(null, "Invalid recipient number");
            }
        } while (!cellNumberCheck(recipientNumber));

        String messageNumber = JOptionPane.showInputDialog("How many messages do you want to send?");
        if (messageNumber == null) return;

        try {
            int messageCount = Integer.parseInt(messageNumber);
            for (int i = 0; i < messageCount; i++) {
                String message = JOptionPane.showInputDialog(null, "Enter message " + (i + 1));
                if (message == null) continue;

                String[] actions = {"Send", "Store", "Disregard"};
                int actionChoice = JOptionPane.showOptionDialog(null,
                        "What do you want to do with this message?",
                        "Message Action",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        actions,
                        actions[0]);

                String id = checkMessageId(); 

                switch (actionChoice) {
                    case 0 -> {
                        sentMessage.add(message);
                        uniqueMessageID.add(id);
                    }
                    case 1 -> {
                        storedMessage.add(message);
                        JOptionPane.showMessageDialog(null, "Message stored successfully");
                    }
                    case 2 -> {
                        disregardMessage.add(message);
                        JOptionPane.showMessageDialog(null, "Message disregarded");
                    }
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String checkMessageId() {
        String id;
        Random random = new Random();

        do {
            int firstNum = 1 + random.nextInt(9);
            int remainingNum = random.nextInt(1000000000);
            id = firstNum + String.format("%09d", remainingNum);
        } while (uniqueMessageID.contains(id));

        return id;
    }

    public String createMessageHash(String messageId, int messageNum) {
        return messageId.substring(0, 2) + ":" + messageNum;
    }
}
