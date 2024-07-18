package samplecode;

public class FindMaximumValueInArray {
    public static void main(String[] args) {

        int[] numbers = {5, 2, 8, 77, 98,99};
        //Assume first number is the largest number
        int temp=numbers[0];

        /*Iterate through second element and start comparing each element of the array
        with temp element till the largest number is found*/

        for(int i=1;i<=numbers.length-1;i++)
        {
            if(numbers[i]>temp)
                temp = numbers[i];
        }
        System.out.println("Largest number is -> "+temp);
    }
}
