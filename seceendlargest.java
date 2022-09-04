public class seceendlargest {
    public static void main(String[] args) {
        int arr[]=new int []{1,2,3,5,2,6,7};
        int max=arr[0];
        int secmax=arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                secmax=max;
                max=arr[i];
            }
            if(arr[i]<max && arr[i]>secmax)
            {
                secmax=arr[i];
              
            }
        }
        System.out.println(secmax);
    }
}
