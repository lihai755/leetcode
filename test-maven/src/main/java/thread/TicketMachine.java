package thread;

/**
 * 售票
 * @author camus
 *
 */
public class TicketMachine {
	private int ticketQuantity;

	public TicketMachine(int ticketQuantity) {
		this.ticketQuantity = ticketQuantity;
	}
	//当有多个线程竞争共享资源时，并且对资源的访问顺序敏感，则可能造成数据不一致。
	//为了保证共享资源不被多个线程同时访问，则需要将竞争共享资源的代码置于临界区，
	//临界区保证在同一时间内最多只能有一个线程执行该代码段。
	public synchronized void sellTicket() {
		String name = Thread.currentThread().getName();
		System.out.printf("【%s】：正在为您检查是否还有余票…\n", name);
		if (ticketQuantity > 0) {
			System.out.printf("【%s】：当前仍有余票 %d 张。\n", name, ticketQuantity);
			try {
				System.out.printf("【%s】：正在为您出票，请等待。\n", name);
				Thread.sleep(100L);
				ticketQuantity--;
				System.out.printf("【%s】：完成出票。\n", name);
				if (ticketQuantity >= 0) {
					System.out.printf("【%s】：当前余票为 %d 张。\n", name, ticketQuantity);
				} else {
					throw new RuntimeException(String.format("系统异常：当前余票为 %d 张。", ticketQuantity));
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			System.out.printf("【%s】：票券已售完，停止售票。\n", name);
		}
	}
	/**
	 * synchronized 修饰对象的作用与修饰普通方法类似，差别在于：当修饰方法时，整个方法都是临界区；当修饰对象时，
	 * 只有 { } 内的代码段是临界区。使用 synchronized 关键字在一定程度上会影响性能，因为在同一时间内最多只能有
	 * 一个线程执行临界区的代码，不能发挥并行的优点。因此，可以根据实际情况，使用 synchronized 修饰对象的引用
	 * 而非方法，调整临界区的大小，只同步访问修改共享资源的代码，其他竞争共享资源而又耗时的代码段不进行同步。修饰 this 
	 * 与修饰其他对象的引用本质也是相同的，它们都是对象锁，只是锁的对象不同。修饰 this 关键字，锁定的是当前对象。
	 * 当一个线程获得一个锁时，其他线程如果要访问该锁作用的临界区时，则挂起等待直至锁被释放。
	 */
}
