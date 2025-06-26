package goa.systems;

import java.util.Iterator;

public class BoundQueue implements Iterable<Job> {

	private final Job[] jobs;
	private int end;
	private final int capacity;

	public BoundQueue(int capacity) {
		this.capacity = capacity;
		this.jobs = new Job[this.capacity];
		end = 0;
	}

	public boolean isempty() {
		return end == 0;
	}

	public void addJob(Job job) throws QueueFullException {
		if (end >= this.capacity) {
			throw new QueueFullException("Queue is full");
		}
		this.jobs[end] = job;
		end++;
	}

	public Job removeJob() throws QueueEmptyException {

		if (end == 0) {
			throw new QueueEmptyException("Queue is empty");
		}

		Job job = this.jobs[0];
		end--;
		int i = 0;
		while (i < end) {
			this.jobs[i] = this.jobs[i + 1];
			i++;
		}
		this.jobs[end] = null;
		return job;
	}

	public boolean hasNext(int currentindex) {
		return currentindex + 1 <= end;
	}

	public Job next(int currentindex) {
		return this.jobs[currentindex];
	}

	@Override
	public Iterator<Job> iterator() {
		return new BoundQueueIterator<Job>(this);
	}
}
