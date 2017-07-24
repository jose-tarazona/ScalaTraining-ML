package classifiers

/**
  * Created by mario on 6/6/17.
  */
trait IClassifier {
  def fit

  def predict(dataset: List[List[Float]]):List[Int]

}
