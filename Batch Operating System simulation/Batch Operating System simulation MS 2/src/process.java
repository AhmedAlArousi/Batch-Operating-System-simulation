
public class process extends Thread  {
	private  int id;
    private process_state state;
	public process (int id)
	{
		this.id = id;
		state=process_state.NEW;
	}
	public long getId() {
		return this.id;
	}
	
	public process_state getProcessState() {
		return state;
	}
	public void setProcessState(process_state state) {
		this.state = state;
	}
	public  void setId(int id) {
		this.id = id;
	}
}
