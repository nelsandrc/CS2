public class GapDriver {
    public static void main(String[] args){
        int[] maxIsOne = new int[]{1,2,3,4,5};
        int[] sameNumbers = new int[]{8,8,8,8,8,8};
        int[] shortBoy = new int[]{7};
        int[] maxIsFive = new int[]{1,3,6,7,12};
        int[] maxIsTen = new int[]{-5,5,2};

        System.out.println("Max should be 1 and is calculated as " + maxGap(maxIsOne));
        System.out.println("Max should be 0 and is calculated as " + maxGap(sameNumbers));
        System.out.println("Max should be 0 and is calculated as " + maxGap(shortBoy));
        System.out.println("Max should be 5 and is calculated as " + maxGap(maxIsFive));
        System.out.println("Max should be 10 and is calculated as " + maxGap(maxIsTen));



    }

    public static int maxGap(int[] numberArray){
        if(numberArray.length < 2)
            return 0;
        else
        {
            int tempMax = 0;
            int currentGap;

            for(int i = 0; i < numberArray.length - 1; ++i){
                currentGap = numberArray[i+1] - numberArray[i];
                if(currentGap > tempMax)
                    tempMax = currentGap;
            }
            return tempMax;
        }
    }
}
