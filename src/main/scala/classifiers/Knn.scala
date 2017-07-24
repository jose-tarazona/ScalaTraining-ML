package classifiers

class Knn (features: List[List[Float]], labels:List[Int] ) extends IClassifier{

  override def fit = {}

  override def predict(dataset: List[List[Float]]): List[Int] = ???

  def eucDist(a: List[Float], b:List[Float]): Float = ???

  def nearest(point: List[Float]): Int = ???
}
