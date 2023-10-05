import java.util.*;
import java.math.*;

public class Stocks {
    public static void Stocks(int myarr[]){
        int buy = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0;i<myarr.length;i++){
            if(buy>myarr[i]){
                int profit = buy-myarr[i];
                maxProfit = Math.max(profit,maxProfit);
            } else{
                buy = myarr[i];
            }
        }
    }

    public static void main(String[]args){

    }
}
