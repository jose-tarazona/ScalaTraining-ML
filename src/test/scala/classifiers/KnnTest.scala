package classifiers

import org.junit.Assert.{assertEquals, assertTrue}
import org.junit.Test
import utils.{AccuracyScore, IrisDatasets}

/**
  * Created by mario on 6/6/17.
  */
@Test
class KnnTest {
  @Test
  def testEucDist() = {
    val a = List(2f, 3f)
    val b = List(5f, 2f)
    val knn = new Knn(Nil, Nil)
    val result = knn.eucDist(a, b)
    println(s"result: $result")
    assertEquals(3.1, result, 0.09)
  }

  @Test
  def testPrediction() = {

    val trainingDatasets = IrisDatasets.getTrainingData

    val knn = new Knn(trainingDatasets._1, trainingDatasets._2)

    val predictions = knn.predict(trainingDatasets._3)
    val eval = new AccuracyScore(trainingDatasets._4, predictions).eval()
    println(s"Knn Accuracy Score: $eval")
    println(s"Knn Accuracy Score < 0.9: ${eval >= 0.9}")
    assertTrue(eval >= 0.9)

  }
}
