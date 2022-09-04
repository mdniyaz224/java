public class avgorarr {
    public static void main(String[] args) {
        int arr[]=new int[]{23,24,25,26,27};
        int avg=0;
        int sum=0;
        for(int i=0; i<arr.length; i++)
        {
           sum=sum+arr[i];
        }
        avg=sum/arr.length;
        System.out.println(avg);
    }
}
