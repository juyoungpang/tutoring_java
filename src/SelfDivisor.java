public class SelfDivisor
{

    /** @param number the number to be tested
     *         Precondition: number > 0
     *  @return true if every decimal digit of
     *          number is a divisor of number;
     *          false otherwise
     */
    public static boolean isSelfDivisor(int number)
    {
        int divisor = number;
        while(divisor>0){
            if(divisor%10==0) return false;
            else if(number%(divisor%10)!=0) return false;
            divisor/=10;
        }
        return true;
    }

    /**
     * @param start starting point for values to be checked
     * Precondition: start > 0
     * @param num the size of the array to be returned
     * Precondition: num > 0
     * @return an array containing the first num
     * integers >= start that are self-divisors
     */
    public static int[] firstNumSelfDivisors(int start, int num)
    {
        int array1[] = new int[num];
        int count = 0;

        while(count<num){
            if(isSelfDivisor(start)){
                array1[count] = start;
                count++;
            }
            start++;
        }

        return array1;
    }

    public static void main (String[] args)
    {
        System.out.println("Self divisors for firstNumSelfDivisors(10, 3):");
        for (int n : firstNumSelfDivisors(10, 3))
            System.out.print(n + " ");
        System.out.println();

        System.out.println("Self divisors for firstNumSelfDivisors(22, 5)");
        for (int n : firstNumSelfDivisors(22, 5))
            System.out.print(n + " ");
        System.out.println();
    }
}


