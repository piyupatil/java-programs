class Myrunnable implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("This is "+i+"th child thread");
		}
	}
}
class ThreadDemo{
	public static void main(String[]args){
	Myrunnable r=new Myrunnable();
	Thread t=new Thread(r);
	t.start();
	for(int i=0;i<10;i++){
		System.out.println("Main "+i+"thread");
	}
	}
}