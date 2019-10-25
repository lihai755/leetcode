package thread;

/**
 * 购票
 * @author camus
 *
 */
public class BuyTicketTask implements Runnable {
	private TicketMachine ticketMachine;
	private int times;

	public BuyTicketTask(TicketMachine ticketMachine, int times) {
		this.ticketMachine = ticketMachine;
		this.times = times;
	}

	public void run() {
		for (int i = 0; i < times; i++) {
			ticketMachine.sellTicket();
		}
	}

}
