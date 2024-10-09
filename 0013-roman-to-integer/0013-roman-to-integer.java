class Solution {
    public int romanToInt(String s) {
        
        HashMap<String, Integer> symbolValue = new HashMap<String, Integer>();
        symbolValue.put("I", 1);
        symbolValue.put("V", 5);
        symbolValue.put("X", 10);
        symbolValue.put("L", 50);
        symbolValue.put("C", 100);
        symbolValue.put("D", 500);
        symbolValue.put("M", 1000);
        
        int sum = 0;
        
        for(int i = 0; i < s.length(); i++){            
            String c = Character.toString(s.charAt(i));
            int value = symbolValue.get(c);
            
            
            if(i <  s.length()-1){
                String nextC = Character.toString(s.charAt(i+1));
                if((c.equals("I")) && (nextC.equals("V"))){
                    sum+=4;
                    i++;
                }
                else if((c.equals("I")) && (nextC.equals("X"))){
                    sum+=9;
                    i++;
                }
                else if((c.equals("X")) && (nextC.equals("L"))){
                    sum+=40;
                    i++;
                }
                else if((c.equals("X")) && (nextC.equals("C"))){
                    sum+=90;
                    i++;
                }
                else if((c.equals("C")) && (nextC.equals("D"))){
                    sum+=400;
                    i++;
                }
                else if((c.equals("C")) && (nextC.equals("M"))){
                    sum+=900;
                    i++;
                }
                else{
                    sum += value;    
                }
            }
            else{
                sum += value;    
            }
            
            
            System.out.println(sum);
        }
        
        return sum;
        
    }
}