package Arrays;

public class buyAndSellStock {
    
        public int maxProfit(int[] prices) {
            
            // Got TLE
            // if(prices.length == 0) {
            //     return 0;
            // }
            
            // int sum = 0;
    
            // for (int i = 0; i < prices.length - 1; i++) {
            //     for(int j = i + 1; j < prices.length; j++) {
            //         if((prices[j] - prices[i]) > sum) {  // imp
            //             sum = prices[j] - prices[i];
            //         }
    
            //     }
                
            // }
    
            // return sum;
    
    
    
            if(prices.length == 0) {
                return 0;
            }
    
            int minPrices = prices[0];
            int profit = 0;
    
    
    // Start from 1 as we'll check element at 1 with minPrices which is at 0
    
    /*if (prices[i] < minPrice): This condition checks if the current price at index i is less than the previously recorded minimum price (minPrice). If this is the case, it means we have found a new potential minimum price. We update the minPrice to the current price, as this might be a better point to buy the stock. */
    
            for(int i = 1; i < prices.length; i++) { 
                if(minPrices > prices[i] ) {
                    minPrices = prices[i];
                }
    
                if((prices[i] - minPrices) > profit) {
                    profit = prices[i] - minPrices;
                }
            }
            return profit;
    
    
        }
    
}
