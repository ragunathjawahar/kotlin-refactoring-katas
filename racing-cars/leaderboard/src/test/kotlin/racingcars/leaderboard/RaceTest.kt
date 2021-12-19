package racingcars.leaderboard

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class RaceTest {
  @Test
  fun isShouldCalculateDriverPoints() {
    // setup

    // act

    // verify
    Assertions.assertEquals(25, TestData.race1.getPoints(TestData.driver1))
    Assertions.assertEquals(18, TestData.race1.getPoints(TestData.driver2))
    Assertions.assertEquals(15, TestData.race1.getPoints(TestData.driver3))
  }
}
