import BasicMath.palindrome;

public class stringpalindrome {
    public boolean palindrome(int i,String s)
    {
        if(i>=s.length()/2)
        {
            return true;
        }
        if(s.charAt(i)!=s.charAt(s.length()-i-1))
        {
            return false;
        }
         return palindrome(i + 1, s);
    }
    public static void main(String[]args)
    {
        stringpalindrome sp = new stringpalindrome();
        String s="madam";
        boolean result = sp.palindrome(0, s);
        if(result)
        {
            System.out.print("palindrome");
        }
        else{
            System.out.print("Not a palindrome");
        }
    }
    
}
