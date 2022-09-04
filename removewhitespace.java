public class removewhitespace {
    public static void main(String[] args) {
        String str="i am md niyaz";
        char ch[]=new char[str.length()];
        for(int i=0; i<ch.length; i++)
        {
           ch[i]=str.charAt(i);
        }
        for(int i=0; i<ch.length; i++)
        {
            if(ch[i]!=' ')
            {
              System.out.print(ch[i]);
            }
        }
    }
}
