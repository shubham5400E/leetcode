class Solution {
    public List<Integer> getRow(int rowIndex) {
        long val =1;
        List<Integer> ls=new ArrayList<>();
        for (int i=0;i<=rowIndex;i++){
            ls.add((int)val);
            val=val*(rowIndex-i)/(i+1);
        }
        return ls;
    }
}