class AssOpert{
public static void main(String[]args){
	int a,b,c,d;
	a=b=c=d=20;
	System.out.println(a+=b-=c*=d/=2);
	byte ba=127;
	ba+=3;
	System.out.println(ba+Float.NaN);
	int x=10,y=15;
	if(++x<10&&++y>15){
		x++;
	}
	else{
		y++;
	}
	System.out.println(x+" "+y);
	String str="panu";
	int a1=10,b1=20,c1=30;
	System.out.println(a1+b1+c1+str);
	System.out.println(a1+str+b1+c1);
	System.out.println(a1+b1+str+c1);
	//str=a1+b1+c1;
	System.out.println(str);
	str=str+a1+b1;
	System.out.println(str);
	//a1=str+b1+c1;
	System.out.println(a1);
	a1=a1+b1+c1;
	System.out.println(a1);
	System.out.println(a1!=Float.NaN);
}
}