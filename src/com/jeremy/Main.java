package com.jeremy;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(result + " - 1 = " + previousResult);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 1 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result %3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alient!");

        int topScore = 100;
        if (topScore == 100)
            System.out.println("You got the high score!");

        topScore = 80;
        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Geater than second score and less then 100");
        if((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of this tests is true");

        int newValue = 50;
        if(newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if (isCar == true)
            System.out.println("This is not supposed to happen");
        boolean wasCar = isCar ? true : false; //
        if (isCar)
            System.out.println("wasCar is true");

        // 1. Create a double variable with the value 20
        // 2. Create a second variable of type double with the value 80
        // 3. Add both numbers up and multiply by 25
        // 4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        // 5. Write an "if" statement that displays a message "Total was over limit"
        //    if the remaining total (#4) is equal to 20 or less.

        // Section 4 session 22
        // 15:32

        double firstOne = 20;
        double secondOne = 80;
        double addMultiply = (firstOne + secondOne) * 25;
        addMultiply = addMultiply / 40;
        if (addMultiply <= 20)
            System.out.println("Total was over limit" + addMultiply);
        System.out.println(addMultiply);

    }
}
