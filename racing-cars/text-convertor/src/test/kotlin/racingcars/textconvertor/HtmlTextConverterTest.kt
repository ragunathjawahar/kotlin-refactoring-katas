package racingcars.textconvertor

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class HtmlTextConverterTest {
  @Test
  fun foo() {
    val converter = HtmlTextConverter("foo")
    assertEquals("foo", converter.filename)
  }
}
