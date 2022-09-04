public class nopalindrom {
    public static void main(String[] args) {
        int no=121;
        int temp=no,rev=0;
        while(no>=1)
        {
            rev=rev*10+no%10;
            no=no/10;
        }
        if(temp==rev)
        {
            System.out.println("yes it is ");
        }
        else
        {
            System.out.print("no it is not ");
        }
    }
}
