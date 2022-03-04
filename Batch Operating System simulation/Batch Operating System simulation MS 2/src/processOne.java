import java.io.IOException;

public class processOne extends process {

	public processOne(int id) {
		super(id);
	}

	public void run() {
		try {
			kernel.print("P1 : read and print the file\n");
			kernel.print("P1 : Enter file path:\n");
			kernel.print(kernel.readFile(kernel.takeInput()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
