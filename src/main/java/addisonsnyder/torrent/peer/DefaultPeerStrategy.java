package addisonsnyder.torrent.peer;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Default strategy. Because this won't be too complicated, this is a singleton
 * and must remain completely stateless
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DefaultPeerStrategy implements PeerStrategy {

	static private DefaultPeerStrategy strategy;

	public static DefaultPeerStrategy getInstance() {
		if (strategy == null)
			return new DefaultPeerStrategy();
		return strategy;
	}

	@Override
	public void tick(Peer peer) {
		// TODO Auto-generated method stub
	}

}
