package Easy.GroupB;

public class BestTimetoBuyandSellStock {

    public int maxProfit(int[] prices) {
//        // SOlution 2
//        int largerstDifference = 0;
//        int minSoFar = Integer.MAX_VALUE;
//
//        for(int  i = 0;  i < prices.length; i++){
//            if (prices[i] < minSoFar){
//
//                minSoFar = prices[i];
//            }
//            else{
//                largerstDifference = Math.max(largerstDifference, prices[i]- minSoFar);
//            }
//        }
//        return largerstDifference;
//    }





    ////////// SOLUTION 1 /////////////////
         int largerstDifference = 0;

         for(int buyDay = 0; buyDay < prices.length; buyDay++){
             for(int sellDay = buyDay + 1; sellDay < prices.length; sellDay++){
               int currentDifference = prices[sellDay] - prices[buyDay];


               if(currentDifference > largerstDifference){
                   largerstDifference = currentDifference;
               }

             }
         }
         return largerstDifference;
     }


}
