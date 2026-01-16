class Solution {
    public int maxProfit(int[] prices) {
     int n=prices.length,max=0,min=Integer.MAX_VALUE;
     for (int price:prices){
        if (price<min){
            min=price;
        }else{
            max=Math.max(max,price-min);
        }
     }
     return max;   
    }
}