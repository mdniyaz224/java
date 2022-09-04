public class stringrev {
    public static void main(String[] args) {
        String str="hello";
        //String newstr="";
        int len=str.length();
        char ch[]=new char[len];
        for(int i=0; i<len; i++)
        {
            ch[i]=str.charAt(i);
        }
        for(int i=len-1; i>=0; i--)
        {
            System.out.print(ch[i]);
        }
    }
}
