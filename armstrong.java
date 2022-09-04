public class armstrong {
    public static void main(String[] args) {
        int no=153;
        int temp=no;
        int sum=0,rem=0,q=0;
        while(no>=1)
        {
            rem=rem*10+no%10;
            q=rem*rem*rem;
            sum=sum+q;
            rem=0;
            q=0;
            no=no/10;
        }
        if(temp==sum)
        {
            System.out.println("yes it is "+sum);
        }
        else
        {
            System.out.println("no it is not "+sum);
        }
    }
}
