package com.addisonsnyder.torrent.simulator;

import lombok.Getter;

public abstract class AbstractSimulator {

	@Getter
	private long simulatedTime = 0;

	/**
	 * Moves time forward in the simulation by a constant amount, performing
	 * operations on all simulated entities
	 */
	public final void tick() {
		tickOperations();
		simulatedTime++;
	}

	/**
	 * All the operations on all simulated entities necessary for the simulation to
	 * move forward.
	 */
	protected abstract void tickOperations();
}
