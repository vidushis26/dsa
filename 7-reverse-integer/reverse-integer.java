class Solution {
    public int reverse(int x) {
        int temp=x;
        long reversed=0;
        for(;temp!=0;temp=temp/10){
            reversed=(reversed*10)+(temp%10);
            
        }
        if(reversed>Integer.MAX_VALUE||reversed<Integer.MIN_VALUE){
            return 0;
        }
      
            
      return (int) reversed;  
    }
    }
