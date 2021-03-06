package com.twitter.penguin.korean.tools

object UpdateAllTheExamples {
  def runTools(objects: Runnable*): Unit = {
    objects.foreach{o =>
      println("--- Running %s ---".format(o.getClass.getSimpleName))
      o.run
    }
    println("Finished running %s.".format(
      objects.map(_.getClass.getSimpleName).mkString(", ")
    ))
  }

  def main(args: Array[String]) {
    runTools(
      CleanUpDictionaries,
      CreateConjugationExamples,
      CreateParsingExamples,
      CreatePhraseExtractionExamples
    )
  }
}
