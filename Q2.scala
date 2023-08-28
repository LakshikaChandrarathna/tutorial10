object Q2 {
  def main(args: Array[String]): Unit = {
    val words = List("apple", "banana", "cherry", "date")
    val totalCount = countLetterOccurrences(words)
    println(s"Total count of letter occurrences: $totalCount")
  }

  def countLetterOccurrences(words: List[String]): Int = {
    val letterCounts = words.map(_.length)
    val totalCount = letterCounts.reduce(_ + _)
    totalCount
  }
}
