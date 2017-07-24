package classifiers

import org.junit.Assert._
import org.junit.Test
import utils.AccuracyScore

/**
  * Created by mario on 6/6/17.
  */
@Test
class AccuracyScoreTest {
  @Test
  def testScore() = {
    val expected = List(1,2,3,4,5,6,7,8,9,0)
    val result = List(1,1,3,4,3,6,2,8,9,0)
    val eval = new AccuracyScore(expected, result).eval()
    assertEquals(0.7, eval, 0.9)
  }
}
