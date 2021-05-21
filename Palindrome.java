class Palindrome 
{
    public static void main(String[] args)
    {
        for(int i = 0; i < args.length; i++)
        {
            String s = args[i];
            if(isPalindrome(s))
                System.out.println(s + " palindrom!");
        }
    }

    public static boolean isPalindrome(String s)
    {
        return s.equals(reverseString(s)); // => in C++: s == reverseString(s)
    }

    public static String reverseString(String s)
    {
        String reversed = "";
        for(int i = s.length() - 1; i > -1; i--)
            reversed += s.charAt(i); // => in C++: s[i]
        return reversed;
    }
}
