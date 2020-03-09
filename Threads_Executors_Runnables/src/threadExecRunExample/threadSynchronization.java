import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

//package threadExecRunExample;

public class threadSynchronization {

	public static void main(String[] args) {

		Stream<String> flow = Stream.of("tarea1", "tarea2", "tarea3");

		ExecutorService service = Executors.newCachedThreadPool();

		flow.map(t->new Task(t)).forEach(service::execute);

	}

}

class Task implements Runnable {

	public Task(String name) {
		this.name = name;
	}

	private String name;


	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println(name + " - it: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}