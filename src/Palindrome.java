import java.util.LinkedList;

public class Palindrome
{
    public static void main(String[] args)
    {
        LinkedList<Character> ll=new LinkedList<>();
        ll.add('9');
        ll.add('8');
        ll.add('7');
        ll.add('6');
        ll.add('5');
        ll.add('6');
        ll.add('7');
        ll.add('8');
        ll.add('9');

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
