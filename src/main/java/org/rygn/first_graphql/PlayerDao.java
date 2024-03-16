package org.rygn.first_graphql;

import java.util.List;
import java.util.stream.Collectors;

public class PlayerDao {

	private List<Player> players;

    public PlayerDao(List<Player> players) {
        this.players = players;
    }

    public List<Player> getRecentPlayers(int count, int offset) {
    	return this.players.stream().skip(offset).limit(count).collect(Collectors.toList());
    }

	public Player getPlayerByID(int id) {
		return this.players.stream()
				.filter(player -> player.getId() == id)
				.findFirst()
				.orElse(null);
	}
	public Player savePlayer(Player player) {
		this.players.add(player);
		return player;
	}
}

