package addisonsnyder.torrent.peer;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.NONE)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class Peer {
	@Getter
	private long Id;
}
