public class NestedIf {
    public static void main(String[] args) {
        
        int number = 0;

        // checks if number is greater than 0
        if (number > 0) {
            System.out.println("The number is positive.");
        }
        else if (number < 0) {
            System.out.println("The number is negative.");
        }
        else {
            System.out.println("The number is 0.");
        }
        System.out.println("Statament after nested if");
    }
}
