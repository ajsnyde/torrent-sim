package com.addisonsnyder.p2p.peer;

public class PeerFactory {
	private long id = 0;

	public Peer getPeer() {
		return new Peer(id++, DefaultPeerStrategy.getInstance());
	}

}
