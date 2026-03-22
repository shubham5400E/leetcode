class Solution {
    public int addDigits(int num) {
        while(!(num>=0&& num<10)){
            int temp=num;
            System.out.println(num);
            num=0;
            while(temp>0){
                int digit=temp%10;
                num=num+digit;
                temp=temp/10;
            }
        }
        return num;
    }
}