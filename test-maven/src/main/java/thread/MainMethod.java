package thread;

public class MainMethod {

	public static void main(String[] args) {
		TicketMachine ticketMachine = new TicketMachine(10);
	    
	    Thread zhangsan = new Thread(new BuyTicketTask(ticketMachine, 2), "张三");
	    Thread lisi = new Thread(new BuyTicketTask(ticketMachine, 2), "李四");
	    zhangsan.start();
	    lisi.start();
	}

}
