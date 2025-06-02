public class SwitchCaseDemo {
    public static void main(String[] args) {
        // Example 1: Basic switch case with numbers
        int dayNumber = 3;
        System.out.println("Example 1 - Day of the week:");
        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
        }

        // Example 2: Switch case with char
        char grade = 'B';
        System.out.println("\nExample 2 - Grade description:");
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good job!");
                break;
            case 'C':
                System.out.println("You passed");
                break;
            case 'F':
                System.out.println("Please try again");
                break;
            default:
                System.out.println("Invalid grade");
        }

        // Example 3: Switch case with String
        String command = "start";
        System.out.println("\nExample 3 - Command processor:");
        switch (command.toLowerCase()) {
            case "start":
                System.out.println("Starting the program");
                break;
            case "stop":
                System.out.println("Stopping the program");
                break;
            case "restart":
                System.out.println("Restarting the program");
                break;
            case "help":
                System.out.println("Showing help menu");
                break;
            default:
                System.out.println("Unknown command");
        }

        // Example 4: Switch case without break (fall-through)
        int month = 3;
        System.out.println("\nExample 4 - Season finder:");
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Invalid month");
        }

        // Example 5: Switch case with return value
        int number = 2;
        System.out.println("\nExample 5 - Number in words:");
        String numberInWord;
        switch (number) {
            case 1:
                numberInWord = "One";
                break;
            case 2:
                numberInWord = "Two";
                break;
            case 3:
                numberInWord = "Three";
                break;
            case 4:
                numberInWord = "Four";
                break;
            case 5:
                numberInWord = "Five";
                break;
            default:
                numberInWord = "Unknown number";
        }
        System.out.println(numberInWord);
    }
} 