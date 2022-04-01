object nonogramRow {

  def nonogramRows(ns: Array[Int]):Array[Int] = {
    ns
      .foldLeft("")(_ + _)
      .split("0+")
      .filter(_.nonEmpty)
      .map(_.length)
  }
}
