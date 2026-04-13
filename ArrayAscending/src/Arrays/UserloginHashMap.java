package Arrays;

import java.util.HashMap;

public class UserloginHashMap {
    public static void main(String[] args) {
        HashMap<String, String> users = new HashMap<>();

        users.put("admin", "1234");
        users.put("user1", "pass1");

        String username = "admin";
        String password = "1234";

        if (users.containsKey(username) && users.get(username).equals(password)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Credentials");
        }
    }
}