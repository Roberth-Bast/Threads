package ejemplo1_Thread;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Process prcss1 = new Process("Process 1");
		Process prcss2 = new Process("Process 2");
		Process prcss3 = new Process("Process 3");
		
		prcss1.start();
		prcss2.start();
		prcss3.start();
	}

}
