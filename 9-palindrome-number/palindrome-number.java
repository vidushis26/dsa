class Solution {
    public boolean isPalindrome(int x) {
        int reversed =0;
       int temp=x;

        for(;temp>0;temp=temp/10){
        
         reversed=(reversed*10)+(temp%10);
           
        }
        if(x==reversed){
            return true;
        }
        else{
           return false;
        }
        }

        
    }
