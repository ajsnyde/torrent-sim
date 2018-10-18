package com.addisonsnyder.torrent.peer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import addisonsnyder.torrent.peer.PeerFactory;

class PeerFactoryTest {

	PeerFactory peerFactory;

	@BeforeEach
	void setUp() throws Exception {
		peerFactory = new PeerFactory();
	}

	@Test
	@DisplayName("Ensure that peerId is incremented from 0 by default")
	void testGetPeer() {
		assertThat(peerFactory.getPeer().getId(), is(0L));
		assertThat(peerFactory.getPeer().getId(), is(1L));
		assertThat(peerFactory.getPeer().getId(), is(2L));
	}

}
