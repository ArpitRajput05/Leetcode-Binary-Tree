class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer>set=new HashSet<>();
        // for(int num:digits){
        //    if(num%2==0) set.add(digits);
        // }
        int count=0;
        for(int i=0;i<digits.length;i++){
            for(int j=0;j<digits.length;j++){
                for(int k=0;k<digits.length;k++){
                    if(i==j||j==k||k==i) continue;
                    int num=100*digits[i]+10*digits[j]+digits[k];
                    if(digits[i]!=0 && num%2==0) set.add(num); 
                }
            }
            
        }
        return set.size();
    }
}