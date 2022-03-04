
public class processThree extends process {

	public processThree(int id) {
		super(id);
	}
	public void run() {
		kernel.print("P3 : counting from 0 to 300\n");

		for(int i = 0 ; i <= 300;i++)
		{
			kernel.print(i + (i%9 == 0? "\n" : " "));
		}
	}

}
