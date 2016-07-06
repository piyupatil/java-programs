import java.util.*;
class sysproperty{
	public static void main(String[]args){
		Properties pr=System.getProperties();
		pr.list(System.out);
		String course=System.getProperty("Course");
		if(course.equals("SCJP")){
			System.out.println("SCJP courses");
		}
		else{
			System.out.println("other courses");
		}
	}
}