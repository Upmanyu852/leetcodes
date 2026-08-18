class Solution {
    public int kthDigit(long k) {
        if(k<=9)
            return(int)k;
            k-=9;
            long start=1;
            for(int d=1;;d++){
                long blocks=9*start;
                long size=10L*(d+1);
                long total=blocks*size;
                if(k>total){
                    k-=total;
                    start*=10;
                    continue;
                }
                long b=start+(k-1)/size;
                long pos=(k-1)%size;

                long num;
                if(b%2==0)
                    num=10*b+pos/(d+1);
                else
                    num=10*b+9-pos/(d+1);
                String str=String.valueOf(num);
                return str.charAt((int)(pos%(d+1)))-'0';
            }
        }
    }
