public class TestingDriver {
    public static void main(String[] args) {

        // How to use smart input
        SInput input = new SInput(); // Create a new SmartInput

        // You can use .inputString(PROMPT) and prompt the user for an input.
        String username = input.inputString("Please enter a username: ");
        System.out.println(username);

        // You can do it with integers
        int age = input.inputInteger("What is your age? ");
        System.out.println(age);

        // You can have an error be displayed as well.
        // Second Parameter is for display errors. This is FALSE by default
        int weight = input.inputInteger("What is your weight? ", true);
        System.out.println(weight);

        // Did someone way double? Sure!
        // Same as int except for doubles. You can also display errors too. FALSE by default
        double money = input.doubleInput("Enter a cash value: $", true);
        System.out.println(money);

    }
}
