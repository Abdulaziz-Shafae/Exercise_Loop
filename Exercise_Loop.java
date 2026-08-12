import java.util.Scanner;

public class Exercise_Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Write a program that prints the numbers from 1 to 100 such that:
        //      If the number is a multiple of 3, you need to print "Fizz" instead of that number.

        // If the number is a multiple of 5, you need to print "Buzz" instead of that number.

        // If the number is a multiple of both 3 and 5, you need to print "FizzBuzz" instead of that number.

        System.out.println("Answer 1");

        for( int i=1 ; i<101 ; i++){

            if ( i % 3 == 0 && i % 5 == 0 ) System.out.print("FizzBuzz, ");
            else if (i % 3 == 0) System.out.print("Fizz, ");
            else if ( i % 5 == 0 ) System.out.print("Buzz, ");
            else System.out.print(i + ", ");

            // to make 10 numbers per line
            if ( i % 10 == 0 ) System.out.println();

        }


        // 2.Write a Java program to reverse a string.
        //Test Data: Input a string: The quick brown fox
        // Expected Output: Reverse string: xof nworb kciuq ehT

        System.out.println("\n.....................................................");
        System.out.println("Answer 2");

        System.out.print("Input a string to reverse it: ");
        String revString = input.nextLine();

        String reversed = new StringBuilder(revString).reverse().toString();

        System.out.println("Reverse string: " + reversed);


        // 3.Write a program to find the factorial value of any number entered through the keyboard.

        System.out.println("\n.....................................................");
        System.out.println("Answer 3");

        System.out.print("Input a number to find the factorial value of it: ");
        int  numF= input.nextInt();
        int factorial=1;
        for ( int i =1 ; i <= numF ; i++ ){

            factorial*=i;

        }

        System.out.println("the factorial value of " + numF + " is: " + factorial );


        // 4.Two numbers are entered through the keyboard.
        //      Write a program to find the value of one number raised to the power of another.
        //      (Do not use Java built-in method)

        System.out.println("\n.....................................................");
        System.out.println("Answer 4");

        System.out.print("Enter the 1st number: ");
        int numP=input.nextInt();

        System.out.print("Enter the power number: ");
        int numPower=input.nextInt();

        int powerResult=1;

            for (int i = 1; i <= numPower; i++) {
                powerResult = powerResult * numP;
            }
            System.out.println( numP + "^" + numPower + " = " + powerResult);


        // 5.Write a program that reads a set of integers,
        //      and then prints the sum of the even and odd integers.

        System.out.println("\n.....................................................");
        System.out.println("Answer 5");

        int evens=0;
        int odds=0;
        int nums;

        do{

            System.out.print("Enter a number: (0 for exit): ");
            nums=input.nextInt();

            if(nums % 2 == 0 ) evens+= nums;
            else odds+= nums;

        } while (nums != 0);

        System.out.println("The sum of the even numbers is : " + evens);

        System.out.println("The sum of the odd numbers is : " + odds);


        // 6.Write a program that prompts the user to input a positive integer.
        //      It should then output a message indicating whether the number
        //      is a prime number.

        System.out.println("\n.....................................................");
        System.out.println("Answer 6");


            System.out.print("Enter a number to know if it prime: ");
            int numPs=input.nextInt();

            boolean prime= true;
            if(numPs <= 1){
                System.out.println(numPs + " it is not prime");
                prime= false;

            }else{
                for(int i = 2 ; i<= Math.sqrt(numPs); i++ ){

                    if (numPs % i == 0){
                        System.out.println(numPs + " it is not prime");
                        prime= false;
                        break;

                    }
                }
            }

            if (prime) System.out.println(numPs + " it is prime");



        // 7.Use a for loop to print headings for four weeks (Weeks 1 - 4).
        //      Then use another for loop to print the days (Days 1 -7) for each week.

        System.out.println("\n.....................................................");
        System.out.println("Answer 7");

        for ( int w=1 ; w<=4 ; w++) {
            System.out.println("\nWeek " + w);
            for (int d =1 ; d<=7 ; d++){
                System.out.print("Day" + d + " ");
                if(d==7) System.out.println();
            }
        }


        // 8.Write a program thats check if the word is a palindrome or not.
        //      hint: A string is said to be a palindrome
        //      if it is the same if we start reading it from left to right or right to left.

        System.out.println("\n.....................................................");
        System.out.println("Answer 8");

        input.nextLine();


            System.out.print("enter a word to check if it a palindrome:");
            String palindrome=input.nextLine();

            String reversedCheck = new StringBuilder(palindrome).reverse().toString();

            if (palindrome.equals(reversedCheck))
                System.out.println(palindrome + " is a palindrome\n");
            else
                System.out.println(palindrome + " is not a palindrome\n");

    }
}
