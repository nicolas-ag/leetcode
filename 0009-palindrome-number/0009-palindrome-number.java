class Solution {
    public boolean isPalindrome(int x) {
        
        String firsthalf = "";
        String secondhalf = "";        
        String nbStr = String.valueOf(x);
        
        StringBuilder input1 = new StringBuilder();
        
        int halfSize = nbStr.length()/2;
        firsthalf = nbStr.substring(0, halfSize);
        input1.append(firsthalf);
        
        if(nbStr.length()%2 == 0){
            secondhalf = nbStr.substring(halfSize, nbStr.length());
        }
        else{
            secondhalf = nbStr.substring(halfSize+1, nbStr.length());
        }
        
        System.out.println(firsthalf);
        System.out.println(secondhalf);
        
        if((input1.reverse().toString()).equals(secondhalf)){
            return true;
        }else{
            return false;
        }
    }
}