class Solution {
    public int minSumOfLengths(int[] arr, int target) {

        int n = arr.length;
       
        HashMap<Integer,Integer>map=new HashMap<>();
        int i = 0;
        int j = 0;
        int sum = 0;

        int min = Integer.MAX_VALUE;
      
        int count=0;
        int ansmin=0;

        while (j < n) {

            sum += arr[j];

            while (sum > target) {
                sum -= arr[i];
                i++;
            }

            if (sum == target) {

                int len = j-i + 1;

                

                min = Math.min(min, len);
                map.put(len,map.getOrDefault(len,0)+1);
                
            }


            j++;
        }
       int smallest = Integer.MAX_VALUE;
       int secondSmallest = Integer.MAX_VALUE;

      for (int key : map.keySet()) {

                if (key < smallest) {
                    secondSmallest = smallest;
                    smallest = key;
                 }
               else if (key < secondSmallest && key != smallest) {
                        secondSmallest = key;
                }
        }
            int res=0;
            for(int val:map.values()){
               ansmin=map.get(smallest);
                
                if(ansmin==2) return ansmin;
                else if(val==secondSmallest){
                     res=ansmin+val;
                     return res;
                }
            }
            
        


        return -1;
    }
}
