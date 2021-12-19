package racingcar.textconvertor

import java.io.IOException
import kotlin.test.Ignore
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class HtmlPagesConverterTest {
  @Test
  @Ignore
  @Throws(IOException::class)
  fun foo() {
    val converter = HtmlPagesConverter("foo")
    assertEquals("foo", converter.filename)
  }
}
