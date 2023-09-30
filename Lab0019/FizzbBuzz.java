package Lab0019;

public class FizzbBuzz {
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            //for loop to iterate from 1 to 100
            for(int i = 1; i <= 100; i++) {
                if(i%3 == 0 && i%5 == 0) //checks i is divisible by 5 and 3
                {
                    System.out.println("FizzBuzz");
                }else if(i%5 == 0) //checks i is divisible by 5
                {
                    System.out.println("Fizz");
                }else if(i%3 == 0) //checks i is divisible by 3
                {
                    System.out.println("Buzz");
                }else {
                    System.out.println(i); //prints number if its not divisible by 5 or 3
                }
            }
        }

    }


