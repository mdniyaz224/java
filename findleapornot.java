public class findleapornot {
    public static void main(String[] args) {
        int a=2021;
        if(a%4==0)
        {
            if(a%400==0 && a%100==0)
            {
                System.out.println("yes it is leap year");
            }
            else
            {
                System.out.println("no it is leap year");
            }
        }
    }
}
