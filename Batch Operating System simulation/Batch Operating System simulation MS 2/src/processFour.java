
public class processFour extends process {

	public processFour(int id) {
		super(id);
	}
	public void run() {
		kernel.print("P4 : counting from 500 to 1000\n");

		for(int i = 500 ; i <= 1000;i-=-1)
		{
			kernel.print(i + (i%9 == 0? "\n" : " "));
		}
	}

}
