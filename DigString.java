//compute digit String from alphanumeric string
import java.util.regex.*;
class DigString{
	public static void main(String[]args){
		String str="This order was placed for QT3000! OK?";
		String pattern="(.*)(\\d+)(.*)";
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(str);
		if(m.matches()){
			for(int i=0;i<m.groupCount();i++){
			System.out.println("REGEX FOUND"+m.group(i)+"\t"+m.start()+"\t"+m.end());
			}
		}
		else{
			System.out.println("Error");
			
		}
	}
}