public class countvowel {
    public static void main(String[] args) {
        String str="niyaz";
        int count=0;
        char ch[]=new char[str.length()];
        for(int i=0; i<str.length(); i++)
        {
           ch[i]=str.charAt(i);
        }
        for(int i=0; i<ch.length; i++)
        {
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
            {
              count++;
            }
        }
        System.out.println("vowel in the string is "+ count);
    }
}
