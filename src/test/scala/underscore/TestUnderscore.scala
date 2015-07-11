/*
 * Copyright (c) 2015 Mind Eratosthenes Kft.
 * License: AGPL v3
 */
package com.mind_era.underscore

import scala.scalajs._
import org.scalatest._

/**
 * Tests Underscore
 * 
 * @author Gabor Bakos
 */
class TestUnderscore  extends FlatSpec with Matchers {
  "Unique" should "return unique values" in {
    val list/*: List[Int]*/ = js.Array(1, 2, 1, 3, 1, 4)
    ___.uniq(list) should be (js.Array(1, 2, 3, 4))
  }
  "Unique with single value" should "return that value" in {
    val list/*: List[Int]*/ = scala.collection.mutable.IndexedSeq(1)
    ___.uniq(list) should be (collection.mutable.IndexedSeq(1))
  }
}
