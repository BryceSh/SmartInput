public class TestingDriver {
    public static void main(String[] args) {

        // How to use smart input
        SInput input = new SInput();
        String username = input.inputString("Please enter a username: ");
        System.out.println(username);


    }
}
