public class FizzBuzz {
    /**
     * fizzBuzz: A boring method which prints the numbers from 1 to 100. 
     *           But for multiples of 3 print “Fizz” instead of the number 
     *           and for the multiples of 5 print “Buzz”. 
     *           For numbers which are multiples of both 3 and 5 print “FizzBuzz”
     *
     * For Koding internship application only.     
     * @author Deqin Wang
     */
    public void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
                continue;
            }
            if (i % 3 == 0) {
                System.out.println("Fizz");
                continue;
            }
            if (i % 5 == 0) {
                System.out.println("Buzz");
                continue;
            }
            System.out.println(i);
        } 
    }
}
