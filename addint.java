public class addint {
    public static void main(String[] args) {
        int no=12345;
        int sum=0,rem=0;
        while(no>=1)
        {
            rem=rem*10+no%10;
            sum=sum+rem;
            rem=0;
            no=no/10;
        }
        System.out.println(sum);
    }
}
