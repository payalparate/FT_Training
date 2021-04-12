package com.ft.training;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	private final BlockingQueue blockingQueue;

	public Consumer(BlockingQueue blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				System.out.println("Consumed: " + blockingQueue.take());
				Thread.sleep(200);
			} catch (InterruptedException ex) {
				System.out.println("Exception occured");
			}
		}
	}

}
