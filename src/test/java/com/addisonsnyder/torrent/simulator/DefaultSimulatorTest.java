package com.addisonsnyder.torrent.simulator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.addisonsnyder.p2p.simulator.AbstractSimulator;
import com.addisonsnyder.p2p.simulator.DefaultSimulator;

class DefaultSimulatorTest {

	AbstractSimulator simulator;

	@BeforeEach
	void setUp() throws Exception {
		simulator = new DefaultSimulator();
	}

	@Test
	@DisplayName("Ensure that every tick bumps up simulation time")
	void testTick() {
		assertThat(simulator.getSimulatedTime(), is(0L));
		simulator.tick();
		simulator.tick();
		simulator.tick();
		assertThat(simulator.getSimulatedTime(), is(3L));
	}

}
