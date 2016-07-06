class Mythread extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("This is "+i+"th child thread");
		}
	}
}
class ThreadDemo1{
	public static void main(String[]args){
	Mythread r=new Mythread();
	//Thread t=new Thread();
	r.start();
	for(int i=0;i<10;i++){
		System.out.println("Main "+i+"thread");
	}
	}
}