public class arrrev {
    public static void main(String[] args) {
        int arr[]=new int []{1,2,3,4,5,6};
        int sum=0;
        for(int i=arr.length-1; i>=0; i--)
        {
            
            sum +=arr[i];
        }
        System.out.print(sum);
    }
}
