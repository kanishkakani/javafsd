package Assisted2;

public class ThreadDemo extends Thread {
	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
  		ThreadDemo t = new  ThreadDemo();
  		t.start();
 	}
}


