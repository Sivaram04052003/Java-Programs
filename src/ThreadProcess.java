
public class ThreadProcess implements Runnable {
  private String name;
  ThreadProcess(String name){
	  this.name=name;
  }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			System.out.println("Thread is running");
		try {
			Thread.sleep(10000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
	public static void main(String[] args) {
		Runnable r=new ThreadProcess("Siva");
		Thread th=new Thread(r);
		th.start();
		String str=th.getName();
		System.out.println(str);
		int p=th.getPriority();
		System.out.println(p);
	}

}
