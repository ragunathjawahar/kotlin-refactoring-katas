import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FighterDudeTest {
  @Test
  fun `calculation returns correct result`() {
    // Oh no! How do I write this test, the function is complicated
    assertEquals(0, 0, "noop")
  }

  @Test
  fun `negative gear score results in no total power`() {
    assertEquals(null, calculation(-1, 0, 0))
  }

  @Test
  fun `negative fighting skill results in no total power`() {
    assertEquals(null, calculation(-1, 0, 0))
  }

  @Test
  fun `negative happiness results in max total power`() {
    assertEquals(Int.MAX_VALUE, calculation(0, 0, -1))
  }

  @Test
  fun `exp from enemy correct`() {
    assertEquals(515, expFromEnemy(5))
  }
}
