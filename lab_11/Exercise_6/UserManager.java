package lab_11.Exercise_6;

public class UserManager {
    private String userName;
    public void createUser(String username) {
        if (userName == null) {
            userName = username;
            System.out.println("You successfully logged in!");
            return;
        }
        System.out.println("Sorry, wait when the active user exits");
        return;
    }
    public boolean checkUsersActivity() {
        return userName != null;
    }
    public void logoutUser() {
        userName = null;
    }
}
