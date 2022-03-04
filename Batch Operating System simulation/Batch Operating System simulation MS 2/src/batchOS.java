public class batchOS {

	kernel ker;
	public batchOS()
	{
		ker = new kernel();
	}

	public void simulate()
	{
		process pro1 = new processOne(1);
		process pro2 = new processTwo(2);
		process pro3 = new processThree(3);
		process pro4 = new processFour(4);
		process pro5 = new processFive(5);
		pro1.setProcessState(process_state.READY);
		pro2.setProcessState(process_state.READY);
		pro3.setProcessState(process_state.READY);
		pro4.setProcessState(process_state.READY);
		pro5.setProcessState(process_state.READY);

		pro1.start();
		pro2.start();
		pro3.start();	
		pro4.start();		
		pro5.start();		
	}
}
