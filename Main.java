public class Main
{
  public static void main(String[] args)
  {
    // write your code here
    String word1;
    String word2;
    int num;

    // Scanner skibidi = new Scanner(System.in); 
    // System.out.println("give me a word:"); 
    // word1 = skibidi.nextLine();
    // System.out.println("give me another word");
    // word2 = skibidi.nextLine();
    // System.out.println("give me a number");
    // num = skibidi.nextLine();
    lastFirstN("skibidi", "toilet", 3);
    stringManip("skibidi", "toilet");
  }

  /** Precondition: s1 and s2 are not null
  * Precondition: 0 <= n <= min(s1.length(), s2.length()
  */
  public static void lastFirstN(String s1, String s2, int n)
  {
    String output;
    String firstN;
    String lastN;
    int uwu = s1.length() - n;

    lastN = s1.substring(uwu);
    firstN = s2.substring(0, n);

    output = lastN + firstN;
    System.out.println(output);
  }

  /** Precondition: s1 and s2 are not null
  */
  public static void stringManip(String s1, String s2)
  {
    s1 = s1.toUpperCase();
    String firstPart = s2.substring(0,1);
    String lastPart = s2.substring(1, s2.length());
    firstPart = firstPart.toUpperCase();
    s2 = firstPart += lastPart;
    System.out.println(s1 + " " + s2);


  }

  /** Precondition: s1 and s2 are not null
  * Precondition: s2 is a substring of s1 and can be found at least one time in s1
  */
  public static String removeStr(String s1, String s2)
  {
    String output = null;
    return output;
  }
}
