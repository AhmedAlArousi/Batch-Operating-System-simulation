import java.io.IOException;

public class processTwo extends process {

	public processTwo(int id) {
		super(id);
	}
	public void run() {
		
		try {
			kernel.print("P2 : write in a file\n");

			kernel.print("P2 : Enter file path:\n");
			String path = kernel.takeInput();
			kernel.print("P2 : Enter data:\n");
			String data = kernel.takeInput();

			kernel.writeFile(path, data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
