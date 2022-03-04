import java.io.File;
import java.io.IOException;

public class processFive extends process {

	public processFive(int id) {
		super(id);
	}

	public void run() {
		try {
			kernel.print("P5 : counting from min to max and print in a file\n");

			kernel.print("P2 : Enter lower bound:\n");
			int x = Integer.parseInt(kernel.takeInput());

			kernel.print("P2 : Enter upper bound:\n");
			int y = Integer.parseInt(kernel.takeInput());

			for (int i = Math.min(x, y); i <= Math.max(x, y); i -= -1) {
		          kernel.writeFile("output.txt", i+" ");
			}

		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	
	}
}
