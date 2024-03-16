package org.rygn.first_graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class TeamController {

  @Autowired
  private TeamDao teamDao;

  @QueryMapping
  public List<Team> recentTeams(@Argument int count, @Argument int offset) {
    return this.teamDao.getRecentTeams(count, offset);
  }

  @QueryMapping
  public Team teamByID(@Argument int id){
    return this.teamDao.getTeamByID(id);
  }

  @MutationMapping
  public Team writeTeam(@Argument int id, @Argument String city, @Argument String color, @Argument String name) {

    Team team = new Team();
    team.setId(id);
    team.setCity(city);
    team.setColor(color);
    team.setName(name);

    return teamDao.saveTeam(team);
  }
}
