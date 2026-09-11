class Solution {
    public int[] findEvenNumbers(int[] digits) {
         HashSet<Integer>set=new HashSet<>();
        // int count=0;
        for(int i=0;i<digits.length;i++){
            for(int j=0;j<digits.length;j++){
                for(int k=0;k<digits.length;k++){
                   if(i==j||j==k||k==i) continue;
                    int num=100*digits[i]+10*digits[j]+digits[k];
                    if(digits[i]!=0 && num%2==0) set.add(num); 
                }
            }
            
        }
        int []arr=new int[set.size()];
        int idx=0;
        for(int num:set){
          arr[idx]=num;
          idx++;
        }
        Arrays.sort(arr);
        return arr;
    }
}