public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade (int a) {
    if (a >= 90){
        return 'A';
    }
    else if (a >= 80 && a <= 89){
     return 'B';
    }
    else if (a >= 70 && a <= 79){
        return 'C';
    }
    else if (a >= 60 && a <= 69){
        return 'D';
    }
    else if (a >= 50 && a <= 59){
        return 'E';
    }
    else {
        return 'F';
    }
}
    // Question 2 - fizzBuzz
    public static String fizzBuzz (int b) {

        if (b % 3 == 0 && b % 5 == 0) {
            return ("fizzbuzz");
        }
        else if (b % 3 == 0 && b % 5 != 0) {
            return ("fizz");
        }
        else if (b % 3 != 0 && b % 5 == 0) {
            return ("buzz");
        }
        else {
            return ("unlucky");
        }
    }
    // Question 3 - frontBack
    public static String frontBack (String input){
        if (input.length() >= 2) {
            String front = (input.substring(0,2));
            return (front + input + front);
        }
        else {
            return (input);
        }
    }
    // Question 4 - twoAsOne
    public static boolean twoAsOne (int c, int d, int e){
        if (c + d == e){
            return true;
        }
        else if (d + e == c){
            return true;
        }
        else if (c + e == d){
            return true;
        }
        else {
            return false;
        }
    }
    // Question 5 - endUp
    public static String endUp (String input2){
        if (input2.length() >= 4){
            String cap = input2.substring(input2.length() -3, input2.length());
            return (input2.substring(0,input2.length() -3) + cap.toUpperCase());
        }
        else {
            return input2.toUpperCase();
        }
    }
}
