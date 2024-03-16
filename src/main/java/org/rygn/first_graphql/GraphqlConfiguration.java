package org.rygn.first_graphql;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GraphqlConfiguration {

    @Bean
    public PlayerDao playerDao() {

        Player p1 = new Player();
        p1.setId(1);
        p1.setFirstName("Jason");
        p1.setLastName("Tatum");
        p1.setNumber(10);
        p1.setPosition("Attacker right");
//        p1.setTeam(t2);
        p1.setBirthday("xx/xx/xxxx");

        Player p2 = new Player();
        p2.setId(2);
        p2.setFirstName("James");
        p2.setLastName("Brown");
        p2.setNumber(15);
        p2.setPosition("Alive");
//        p2.setTeam(t2);
        p2.setBirthday("xx/xx/xxxx");

        Player p3 = new Player();
        p3.setId(3);
        p3.setFirstName("Smarat");
        p3.setLastName("Green");
        p3.setNumber(20);
        p3.setPosition("Defender right");
//        p3.setTeam(t2);
        p3.setBirthday("xx/xx/xxxx");

        Player p4 = new Player();
        p4.setId(4);
        p4.setFirstName("Robin");
        p4.setLastName("Bochu");
        p4.setNumber(14);
        p4.setPosition("Goat");
//        p4.setTeam(t2);
        p4.setBirthday("xx/xx/xxxx");

        Player p5 = new Player();
        p5.setId(5);
        p5.setFirstName("Kobe");
        p5.setLastName("Bryant");
        p5.setNumber(8);
        p5.setPosition("Dead");
//        p5.setTeam(t1);
        p5.setBirthday("xx/xx/xxxx");

        Player p6 = new Player();
        p6.setId(6);
        p6.setFirstName("Lebron");
        p6.setLastName("James");
        p6.setNumber(23);
        p6.setPosition("Papi");
//        p6.setTeam(t1);
        p6.setBirthday("xx/xx/xxxx");

        List<Player> bostons = new ArrayList<Player>();
        bostons.add(p1);
        bostons.add(p2);
        bostons.add(p3);
        bostons.add(p4);

        List<Player> lakers = new ArrayList<Player>();
        lakers.add(p5);
        lakers.add(p6);


        List<Player> players = new ArrayList<Player>();
        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);
        players.add(p5);
        players.add(p6);

      return new PlayerDao(players);
    }

    @Bean
    public TeamDao teamDao() {
        Team t1 = new Team();
        t1.setId(1);
        t1.setName("Lakers");
        t1.setCity("Los Angeles");
        t1.setColor("Purple / Yellow");

        Team t2 = new Team();
        t2.setId(2);
        t2.setName("Celtics");
        t2.setCity("Boston");
        t2.setColor("Green");

        List<Team> teams = new ArrayList<>();
        teams.add(t1);
        teams.add(t2);
        return new TeamDao(teams);
    }
}
