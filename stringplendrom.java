public class stringplendrom {
    public static void main(String[] args) {
        String str="mada";
        int len=str.length();
        int mid=len/2;
        int falg=0;
        char ch[]=new char[len];
        for(int i=0; i<len; i++)
        {
            ch[i]=str.charAt(i);
        }
        for(int i=0; i<mid; i++)
        {
            if(ch[i]!=ch[len-i-1])
            {
                falg++;
            }
           
        }
        if(falg>=1)
        {
            System.out.println("no it is not a palendrom");
        }
        else{
            System.out.println("yes it is a palendrom");
        }
    }
}
