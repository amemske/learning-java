import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
       
        //array
        double[] stockPricesArray = {100.5, 102.0, 98.3, 107.7, 112.2, 99.8, 105.5, 103.1, 97.6, 107.7};
        double targetPrice = 107.7;

        //array list
        ArrayList<Double>stockPricesArrayList = new ArrayList<>();
        stockPricesArrayList.addAll(Arrays.asList(80.5, 72.0, 98.3, 57.7, 22.2, 80.8, 75.5, 73.1, 67.6, 85.7));

        //calculate average price from array
        System.out.println("The Average Price from the array is " + calculateAveragePrice(stockPricesArray));

        //calculate average price from array list
         System.out.println("The Average Price from the ArrayList  is " + calculateAveragePrice(stockPricesArrayList));

        //calculate maximum price from array
        System.out.println("The Maximum Price from the array is " + findMaximumPrice(stockPricesArray));

        //calculate maximum price from array list
        System.out.println("The Maximum Price from the ArrayList  is " + findMaximumPrice(stockPricesArray));

        //get occurrence Count
        System.out.println("The count occurrence is " + countOccurrences(stockPricesArray, targetPrice));

        //Cumulative Sum
        System.out.println("The cumulative sum array is " + computeCumulativeSum(stockPricesArrayList));

    }


// Calculate the average stock price for an array  and array list
public static double calculateAveragePrice (double[] passedArray){
    double sum = 0;
    

    for(int i =0; i < passedArray.length; i++){
        sum += passedArray[i];
    }

double average = sum /  passedArray.length;
    return average;
}

public static double calculateAveragePrice (ArrayList<Double> passedArray){
    double sum = 0;
    

    for(double arrayItem : passedArray){
        sum += arrayItem;
    }
    double average = sum /  passedArray.size();
        return average;
}



// Find the maximum stock price of array and array list

public static double  findMaximumPrice(double[] passedArray){
    double max = 0;

    for(int i =0 ; i< passedArray.length; i++){
        if(passedArray[i] > max)
        max = passedArray[i];
    }
    return max;
}

public static double  findMaximumPrice(ArrayList<Double> passedArray){
    double max = 0;

    for(double arrayItem : passedArray){
        if(arrayItem > max)
        max = arrayItem;
    }
    return max;
}

// Determine the occurrence count of a specific price
public static int countOccurrences(double[] passedArray, double passedTargetPrice){

    int count = 0;

    for(int i=0; i<passedArray.length; i++){
        if(passedArray[i] == passedTargetPrice) {
            count++;
        }
    }
    return count;
}

// Compute the cumulative sum of stock prices and store in a new array
public static ArrayList<Double> computeCumulativeSum(ArrayList<Double> passedStockPricesArrayList){
    ArrayList<Double> cumulativeSumList = new ArrayList<>();
    double sum = 0.0;

     for(int i=0; i<passedStockPricesArrayList.size(); i++){
        sum += passedStockPricesArrayList.get(i);
        cumulativeSumList.add(sum);
    }
    return cumulativeSumList;
}

}
