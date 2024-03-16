package org.rygn.first_graphql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class PlayerController {

  @Autowired
  private PlayerDao playerDao;

  @QueryMapping
  public List<Player> recentPlayers(@Argument int count, @Argument int offset) {
    return this.playerDao.getRecentPlayers(count, offset);
  }

  @QueryMapping
  public Player playerByID(@Argument int id){
    return this.playerDao.getPlayerByID(id);
  }

  @MutationMapping
  public Player writePlayer(@Argument int id, @Argument String firstName, @Argument String lastName,
      @Argument int number, @Argument String birthday, @Argument Team team) {

    Player player = new Player();
    player.setId(id);
    player.setFirstName(firstName);
    player.setLastName(lastName);
    player.setNumber(number);
    player.setBirthday(birthday);
//    player.setTeam(team);

    return playerDao.savePlayer(player);
  }
}
