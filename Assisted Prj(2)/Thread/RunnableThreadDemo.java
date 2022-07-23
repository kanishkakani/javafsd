package Assisted2;

public class RunnableThreadDemo implements Runnable {
	 public static int myCount = 0;
	    public RunnableThreadDemo(){
	         
	    }
	    public void run() {
	        while(RunnableThreadDemo.myCount <= 10){
	            try{
	                System.out.println("Exp1 Thread: "+(++RunnableThreadDemo.myCount));
	                Thread.sleep(100);
	            } catch (InterruptedException iex) {
	                System.out.println("Exception in thread: "+iex.getMessage());
	            }
	        }
	    } 
	    public static void main(String a[]){
	        System.out.println("Starting Main Thread...");
	        RunnableThreadDemo mrt = new RunnableThreadDemo();
	        Thread t = new Thread(mrt);
	        t.start();
	        while(RunnableThreadDemo.myCount <= 10){
	            try{
	                System.out.println("Main Thread: "+(++RunnableThreadDemo.myCount));
	                Thread.sleep(100);
	            } catch (InterruptedException iex){
	                System.out.println("Exception in main thread: "+iex.getMessage());
	            }
	        }
	        System.out.println("End of Main Thread...");
	    }
}
