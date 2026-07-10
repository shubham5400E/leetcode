class Solution {
    public int countPrimes(int n) {
    boolean[] temp=new boolean[n];

    for(int i=2;i<n;i++){
        temp[i]=true;
    }
    for(int i=2;i*i<n;i++){
        if(temp[i]){
            for(int j=i*i;j<n;j+=i){
                temp[j]=false;
            }
        }
    } 
    int c=0;
    for(int i=2;i<n;i++){
        if(temp[i])c++;
    }   
    return c;
    }
}