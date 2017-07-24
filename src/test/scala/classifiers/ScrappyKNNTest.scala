package classifiers

import org.junit.Assert.assertTrue
import org.junit.Test
import utils.{AccuracyScore, IrisDatasets}

/**
  * Created by mario on 6/6/17.
  */
@Test
class ScrappyKNNTest {
  @Test
  def testPrediction() = {
    val trainingDatasets = IrisDatasets.getTrainingData

    val scrappyKNNT = new ScrappyKNN(trainingDatasets._1, trainingDatasets._2)
    scrappyKNNT.fit

    val predictions = scrappyKNNT.predict(trainingDatasets._3)
    val eval = new AccuracyScore(trainingDatasets._4, predictions).eval()
    println(s"ScrappyKnn Accuracy Score: $eval")
    println(s"ScrappyKnn Accuracy Score < 0.9: ${eval < 0.9}")
    assertTrue(eval < 0.9)

  }

}
