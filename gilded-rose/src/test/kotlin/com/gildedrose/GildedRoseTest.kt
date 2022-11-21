package com.gildedrose

import java.io.ByteArrayOutputStream
import java.io.PrintStream
import org.approvaltests.Approvals
import org.junit.jupiter.api.Test

class GildedRoseTest {
  @Test
  fun `basic test for 2 days`() {
    // given
    val outStream = ByteArrayOutputStream()
    System.setOut(PrintStream(outStream))

    // when
    main(emptyArray())

    // then
    Approvals.verify(outStream.toString())
  }
}
