public class ProblemSet {
    public static void main(String[] args) {
        // Question 1 - wrong one is D
        // Question 2 - correct answer is B (19.5)
        double register = 10.0;
        register = register + 5 - 2.5 + 10 - 3;
        System.out.println(register);
        // Question 3 - 650
        int bankBalance = 500;
        bankBalance = bankBalance + 250 - 100;
        System.out.println(bankBalance);
        // Question 4 - 4.0
        System.out.println(2.0 * ( 5 / 2 )); // due to 5 / 2 returns only Int (2), ignoring the remainder (0.5)
        // Question 5 -
        int day = 20;
        String month = "January";
        // Question 6
        String firstName = "Bill";
        String lastName = "Herrington";
        String fullName = firstName + " " + lastName;
        System.out.println("Hello, my name is " + fullName + "." );
        int letters = firstName.length() + lastName.length();
        System.out.println("There are " + letters + " letters in my name.");
        // firstly I miss part with the space between names
        // System.out.println("There are " + fullName.length() + " letters in my name.");
        // Question 7
        double fahrenheit = 70.0;
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(celsius);


    }
}
