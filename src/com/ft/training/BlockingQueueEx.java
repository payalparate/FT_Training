package com.ft.training;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueEx {

	public static void main(String[] args) {

		BlockingQueue blockingQueue = new LinkedBlockingQueue();

		Thread producerThread = new Thread(new Producer(blockingQueue));
		Thread consumerThread = new Thread(new Consumer(blockingQueue));

		producerThread.start();
		consumerThread.start();

	}

}
