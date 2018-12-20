package com.manny;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));
        // The code above is way to tedious, but there's a way to get around this
        // The "for" statement is used to loop code (aka the "for loop")
        // It's going to allow us to execute code a certain number of times by repeatedly looping something
        // until a condition is satisfied
        // Looping code is something that is very commonly needed in programming
        // for(init; termination; increment){
        // }
        // "init" means the code that is going to be initialized once at the start of the loop
        // "termination" is used for telling the for loop how we want to exit (i.e. at what point do we exit?)
        // Once termination evaluates to "false" the loop will exit and start processing the next line
        // "increment" is an expression that is invoked after each iteration of the loop goes around
        // A common thing would be to put a number in there that is incremented each time (sort of like a count)

        for(int i=0; i<5; i++){
            System.out.println("Loop " + i + " Hello!");
        }
        // It is more typical for "init" to start at 0 (good habit), but you can start them at any value
        //
        //Challenge!
        // Using the for statement, call the calculateInterest method with the amount of 10000 with an interest
        // rate of 2, 3, 4, 5, 6, 7, and 8
        // Print the results to the console window

        for(int i=2; i<9; i++){
                System.out.println("10,000 at " + i + "% interest = " + String.format("%2f", calculateInterest(10000.0, i)));
            // String.format parses the value that got returned from our calculateInterest method
            // What that does is the "%.2f" in this case means, "Convert the number and output it with only two decimal points"
        }

        // How do you modify the for loop above to do the same thing as shown, but to start
        // from 8% and work back to 2%?
        for(int i=8; i>=2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%2f", calculateInterest(10000.0, i)));
        }

        int count = 0;
        for(int i = 10; i<50; i++){
            if(isPrime(i)){
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 10){
                    System.out.println("exiting the loop!");
                    break;
                }
            }
        }
    }
    // A prime number can be divided evenly and leave a 1 all by itself
    // (i.e. divides evenly by itself and leaves a remainder of 1 every time)
    // Has to be a whole number greater than 1
    //
    //Challenge!
    //
    // Create a for statement using any range of numbers
    // Determine if the number is a prime number using the isPrime method
    //If it is a prime number, print it out and increment a count of the
    // number of prime numbers found
    // If that count is 3 exit the for loop
    // hint: Use the break statement to exit

    public static boolean isPrime(int n){

        if(n == 1){
            return false;
        }
        for(int i=2; i<= (long) Math.sqrt(n); i++){
            System.out.println("Looping " + i);
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate){
        // This is going to calculate the amount of interest based on the amount of money passed on as a parameter
        return (amount * (interestRate / 100));
    }
}
