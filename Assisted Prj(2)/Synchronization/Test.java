package Synchronization;

public class Test {
	public static void main(String[] args) {

		Sender sender = new Sender();
		User t1 = new User("Mahesh ", "Hello Good morning....!", sender);

		User t2 = new User("Vini ", "Hii!! how  are you?", sender);

		t1.start();

		t2.start();

	}

}
