package test;

public class app {
	private static final String predefinedUsername = "Shreyas";
    private static final String predefinedPassword = "Shreyas@123";

    public static boolean validate(String inputUsername, String inputPassword) {
        return inputUsername.equals(predefinedUsername) && inputPassword.equals(predefinedPassword);
    }
}
