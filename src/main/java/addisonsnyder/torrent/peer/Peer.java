package addisonsnyder.torrent.peer;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * One of the basic entities involved in torrenting - generally speaking, a Peer
 * owns a personal collection of torrents and has the capability to interact
 * with other Peers through Connections
 */
@NoArgsConstructor(access = AccessLevel.NONE)
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class Peer {

	@Getter
	final private long id;

	@Getter
	@Setter
	@NonNull
	private PeerStrategy peerStrategy;
}