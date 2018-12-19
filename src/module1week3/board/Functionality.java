package module1week3.board;

import java.util.ArrayList;
import java.util.List;

public class Functionality {
    private List <UserRegister> userRegister = new ArrayList<>();
    private List <String> userMessage = new ArrayList<>();
    private List <String> userMessageDescription = new ArrayList<>();


    public void addUser (String userName, String userMail) {
        userRegister.add(new UserRegister(userName, userMail));
        System.out.print("Account successfully created");
        System.out.println(" ");
    }

    public void postMessage (String userMessage, String userMessageDescription) {
        this.userMessage.add(userMessage);
        this.userMessageDescription.add(userMessageDescription);
    }

    public void showBoard () {
        if(!userRegister.isEmpty()) {
            for (int i = 0; i < userRegister.size(); i++) {
                System.out.println("User " + userRegister.get(i).getName() + " posted: " + userMessage.get(i));
                System.out.println("Message description: " + userMessageDescription.get(i));
                System.out.println("User contact: " + userRegister.get(i).getEmail());
                System.out.println(" ");
            }
        } else if (userRegister.isEmpty()) {
            System.out.println("No messages posted");
        }
    }
}