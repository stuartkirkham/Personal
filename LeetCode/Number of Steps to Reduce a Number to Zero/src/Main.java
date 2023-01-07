public class Main {
    // original solution to count number of steps from num to zero.
    class Solution {
        public int numberOfSteps(int num) {
            int counter=0;
            while(num!=0){

                System.out.println("Input: num = " + num);
                //if odd
                if(num%2!=0){
                    num=num-1;
                    counter++;
                }
                else{
                    num=num/2;
                    counter++;
                }
            }
            return counter;
        }
    }
    // Optimal solution:
    class Solution2 {
        public int numberOfSteps(int num) {
            if(num==0)
                return 0;
            else if(num%2==0)
                return 1+numberOfSteps((int)(num/2));
            else
                return 1+numberOfSteps(num-1);

        }
    }
}