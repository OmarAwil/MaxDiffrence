public class MaxDifference
{
    public static void main (String[] args)
    {
        int [] numbs = {2,3,1,7,9,5,11,3,5};
        int min = numbs[0];
        int maxDifference = 0;

        for (int i = 1; i < numbs.length; i++){
        if (numbs [i] > min){
            maxDifference = Math.max(maxDifference, numbs[i] - min);
        } else {
            min = numbs[i];
        }
    }
        System.out.println("The maximum difference between two elements is " + maxDifference);
    }
}
