package goa.systems;

import java.util.Iterator;

public class BoundQueueIterator<T> implements Iterator<Job> {

	private BoundQueue boundqueue;
	private int currentindex;

	public BoundQueueIterator(BoundQueue boundqueue) {
		this.currentindex = 0;
		this.boundqueue = boundqueue;
	}

	@Override
	public boolean hasNext() {
		return this.boundqueue.hasNext(currentindex);
	}

	@Override
	public Job next() {
		Job j = this.boundqueue.next(currentindex);
		currentindex++;
		return j;
	}

}
