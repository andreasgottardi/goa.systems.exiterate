/*
 * This source file was generated by the Gradle 'init' task
 */
package goa.systems;

import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class AltklausurTest {

	private static final Logger logger = LoggerFactory.getLogger(AltklausurTest.class);

	@Test
	void someLibraryMethodReturnsTrue() {

		BoundQueue bq = new BoundQueue(1);
		assertDoesNotThrow(() -> {
			bq.addJob(new Job("1"));
		});
		QueueFullException ex = assertThrows(QueueFullException.class, () -> {
			bq.addJob(new Job("2"));
		});
                Assertions.assertNotNull(ex);
	}

	@Test
	void testThreeElements() {

		BoundQueue bq = new BoundQueue(3);
		assertDoesNotThrow(() -> {
			bq.addJob(new Job("1"));
			bq.addJob(new Job("2"));
			bq.addJob(new Job("3"));
			Job j = bq.removeJob();
			assertEquals("1", j.getName());
		});
	}

	@Test
	void testIterator() {

		BoundQueue bq = new BoundQueue(3);
		assertDoesNotThrow(() -> {
			bq.addJob(new Job("1"));
			bq.addJob(new Job("2"));
			bq.addJob(new Job("3"));
			for (Job job : bq) {
				job.getName();
				logger.info("{}", job.getName());
			}
		});
	}
}
