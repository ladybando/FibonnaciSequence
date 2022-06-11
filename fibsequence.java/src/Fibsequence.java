

public class Fibsequence {
    //sets max number of fibonnaci sequence to 10
    static int maxNum = 10;
    static int[] fibArr;

        public static void main(String[] args) {
            //creates a new instance of Fibsequence() class
            Fibsequence fibonnaci = new Fibsequence();

            //calls createArray() function and outputs the integers in fibArr
            fibonnaci.createArray();
            for (int number = 0; number <= maxNum; number++) {
                System.out.println(number + " " + fibArr[number]);
            }
            System.out.println("Your number is " + fibonnaci.getNthFibonnaci(7));
            System.out.println(fibonnaci.fizzbuzz(maxNum));

        }

    public void createArray(){
        fibArr = new int[maxNum + 1];
        getNthFibonnaci(maxNum);
    }
    public int getNthFibonnaci(int nextNumber) {
        int firstNumber;
        //if number passed to function is less than two then set it equal to variable firstNumber
        if (nextNumber < 2) {
            firstNumber = nextNumber;
        //if number passed to function from the array doesn't equal 0 return it
        } else if (fibArr[nextNumber] != 0)
            return fibArr[nextNumber];
        //process fibonnaci addition on two integers and store them in the fibArr variable then return that number
        else
            firstNumber = getNthFibonnaci(nextNumber - 1) + getNthFibonnaci(nextNumber - 2);
        fibArr[nextNumber] = firstNumber;
        return firstNumber;
    }

    /* function that takes integers stored in fibArr and prints a phrase
     * based on whether number is divisible by 3 or 5, or 3 and 5.
     */
        public int fizzbuzz(int nums ) {
            int divideThree;
            int divideFive;

            for (int i : fibArr) {
                divideThree = (i % 3);
                divideFive = (i % 5);
                if (divideThree == 0 && divideFive == 0) {
                    System.out.println("fizzbuzz");
                }
                if (divideThree == 0) {
                    System.out.println("fizz");
                }
                if (divideFive == 0) {
                    System.out.println("buzz");
                }
            }
            return nums;
        }

    }
