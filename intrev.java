public class intrev {
    public static void main(String[] args) {
        int no=1234;
        int rev=0;
    while(no>=1)
    {
        rev=rev*10+no%10;
        System.out.print(rev);
        rev=0;
        no=no/10;
    }
    }
}
