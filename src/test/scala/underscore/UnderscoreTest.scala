package underscore

import scala.scalajs.js
import com.mind_era.underscore._
//import collection.mutable.{IndexedSeq => List}
import com.mind_era.underscore.__._
//import com.mind_era.underscore._
import org.scalatest._
/**
 * @author Gabor Bakos
 */
object UnderscoreTestSuite  extends FlatSpec with Matchers{
  "Underscore" should "make elements unique using uniq" in {
	  val list/*: List[Int]*/ = js.Array(1, 2, 1, 3, 1, 4)
			  ___.uniq/*[Int, List[Int]]*/(list) should be (js.Array(1, 2, 3, 4)/*: List[Int]*/)/*, "can find the unique values of an unsorted array"*/
  }
}