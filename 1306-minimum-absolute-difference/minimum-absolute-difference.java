class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ls=new ArrayList<>();
        Arrays.sort(arr);
        int min=Math.abs(arr[1]-arr[0]);
        for(int i=1;i<arr.length;i++){
            if(Math.abs(arr[i]-arr[i-1])<min){
                min=Math.abs(arr[i]-arr[i-1]);
                ls.clear();
                ls.add(Arrays.asList(arr[i-1],arr[i]));
            }
            else if (Math.abs(arr[i]-arr[i-1])==min){
                ls.add(Arrays.asList(arr[i-1],arr[i]));
            }

        }
        return ls;
    }
}