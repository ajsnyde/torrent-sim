package addisonsnyder.torrent.peer;

public class PeerFactory {
	private long Id = 0;

	public Peer getPeer() {
		return new Peer(Id++);
	}

}
