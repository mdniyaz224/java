public class morethan2time {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,2,1,5,1,2,3,5,5,3,4,4,4};
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                for(int k=j+1; k<arr.length; k++)
                {
                     if(arr[i]==arr[j]&&arr[i]==arr[k])
                     {
                        System.out.println(arr[k]);
                     }
                }
            }
        }
    }
}
