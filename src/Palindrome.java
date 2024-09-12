import java.util.LinkedList;

public class Palindrome
{
    public static void main(String[] args)
    {
        LinkedList<Character> ll=new LinkedList<>();
        ll.add('m');
        ll.add('a');
        ll.add('m');

        String s="";
        for(char c : ll)
        {
            s=s+c;
        }

        boolean rs=isPalindrome(s);
        if(rs)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }

    public static boolean isPalindrome(String st)
    {
        int l=0,h=st.length()-1;
        while(l<h)
        {
            if(st.charAt(l)!=st.charAt(h))
                return false;
            l++;
            h--;
        }
        return true;
    }

}
