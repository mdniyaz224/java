public class prime {
    public static void main(String[] args) {
        int no=7;
        int count=0;
        for(int i=2; i<=no; i++)
        {
            if(no%i==0)
            {
               count++;

            }
        }
        if(count>=2)
        {
            System.out.println("this is not prime"+count);
        }
        else{
            System.out.println("this is prime"+count);
        }
    }
}
