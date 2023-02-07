/*Design a class to overload a function Joystring( ) as follows:

(1)void Joystring(String s, char ch1, char ch2) with one string argument and two character arguments that replaces 
the character argument ch1 with the character argument ch2 in the given String s and prints the new string.
Example:
Input value of s = "TECHNALAGY"
ch1 = 'A'
ch2 = 'O'
Output: "TECHNOLOGY"

(2)void Joystring(String s) with one string argument that prints the position of the first space and the last space of the given String s.
Example:
Input value of s = "Cloud computing means Internet based computing"
Output:
First index: 5
Last Index: 36

(3)void Joystring(String s1, String s2) with two string arguments that combines the two strings with a space between them and prints the resultant string.
Example:
Input value of s1 = "COMMON WEALTH"
Input value of s2 = "GAMES"
Output: COMMON WEALTH GAMES
(Use library functions)*/
package Class10.anonymous;
public class PracticePaper_Q7
{
    void Joystring(String s,char ch1,char ch2)
    {
        String newString=s.replace(ch1, ch2);
        System.out.println(newString);
    }
    void Joystring(String s)
    {
        int f=s.indexOf(' ');
        int l=s.lastIndexOf(' ');
        System.out.println("First index:"+ f);
        System.out.println("Last index:"+ l);
    }
    void Joystring(String s1,String s2)
    {
        String newString=s1.concat(" ").concat(s2);
        System.out.println(newString);
    }
    public static void main(String []args)
    {
        PracticePaper_Q7 obj=new PracticePaper_Q7();
        obj.Joystring("TECHNALAGY", 'A', 'O');
        obj.Joystring("Cloud computing means Internet based computing");
        obj.Joystring("COMMON WEALTH","GAMES");
    }//end of main()
}//end of class
