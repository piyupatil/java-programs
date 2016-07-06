import java.util.regex.*;
class Matchermethods{
	  private static final String REGEX = "foo";
	  private static String INPUT = "foo12345666887945fooothisisfooo";
	  private static Pattern pattern;
	  private static Matcher matcher;
 
	 public static void main( String args[] ){
	 pattern = Pattern.compile(REGEX);
	 matcher = pattern.matcher(INPUT);
       System.out.println("Current REGEX is: "+REGEX);
       System.out.println("Current INPUT is: "+INPUT);
	   System.out.println("matches(): "+matcher.matches());
       System.out.println("lookingAt(): "+matcher.lookingAt());
       System.out.println("matches(): "+matcher.matches());
	   INPUT=matcher.replaceFirst("Danga");
	   System.out.println("Current INPUT is: "+INPUT);
	   
	   }
}