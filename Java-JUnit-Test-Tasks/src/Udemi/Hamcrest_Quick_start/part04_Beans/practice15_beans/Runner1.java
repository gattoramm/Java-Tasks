package Udemi.Hamcrest_Quick_start.part04_Beans.practice15_beans;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Runner1 {
    @Test
    public void test1() {
        FootballPlayer player1 = new FootballPlayer();
        player1.setName("Diego");
        player1.setNumber(10);

        FootballPlayer player2 = new FootballPlayer();
        player2.setName("Diego");
        player2.setNumber(10);

        FootballPlayer player3 = new FootballPlayer();
        player3.setName("Lionel");
        player3.setNumber(10);

        assertThat(player1, hasProperty("name"));
        assertThat(player1, hasProperty("name",equalTo("Diego")));
        assertThat(player1, samePropertyValuesAs(player2));
        assertThat(player2, not(samePropertyValuesAs(player3)));
    }
}
