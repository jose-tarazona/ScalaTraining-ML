package classifiers

import scala.collection.mutable.ListBuffer
import scala.util.Random

class ScrappyKNN(features: List[List[Float]], labels:List[Int] ) extends IClassifier{

  override def fit = {

  }

  override def predict(dataset: List[List[Float]]): List[Int] = {
    var predictions = new ListBuffer[Int]()
    val rand = new Random(System.currentTimeMillis())
    dataset.foreach(_ => {
      val index = math.abs(rand.nextInt(labels.length))
      val label = labels(index)
      predictions += label
    })
    predictions.toList
  }
}
