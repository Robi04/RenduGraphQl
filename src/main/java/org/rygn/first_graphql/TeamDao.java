package org.rygn.first_graphql;

import java.util.List;
import java.util.stream.Collectors;

public class TeamDao {

	private List<Team> teams;

    public TeamDao(List<Team> teams) {
        this.teams = teams;
    }

    public List<Team> getRecentTeams(int count, int offset) {
    	return this.teams.stream().skip(offset).limit(count).collect(Collectors.toList());
    }

	public Team getTeamByID(int id) {
		return this.teams.stream()
				.filter(team -> team.getId() == id)
				.findFirst()
				.orElse(null);
	}
	public Team saveTeam(Team team) {
		this.teams.add(team);
		return team;
	}
}