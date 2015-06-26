package underscore

import com.mind_era.underscore.__._
import com.mind_era.underscore._
import utest._
import scala.scalajs.js

/**
 * @author Gabor Bakos
 */
object UnderscoreTestSuite extends TestSuite{
  val tests = TestSuite{
//    'hello{
//      'world{
//        val x = 1
//        val y = 2
//        assert(x != y)
//        (x, y)
//      }
//    }
//    'test2{
//      val a = 1
//      val b = 2
//      assert(a == b)
//    }
    import com.mind_era.underscore.{___ => __}
    import collection.mutable.{IndexedSeq => List}
    'uniq{
      print(__)
          val list/*: List[Int]*/ = js.Array(1, 2, 1, 3, 1, 4)
          assert(__.uniq/*[Int, List[Int]]*/(list)
              == (js.Array(1, 2, 3, 4)/*: List[Int]*/)/*, "can find the unique values of an unsorted array"*/);

//    list = [1, 1, 1, 2, 2, 3];
//    deepEqual(_.uniq(list, true), [1, 2, 3], 'can find the unique values of a sorted array faster');
//
//    list = [{name: 'moe'}, {name: 'curly'}, {name: 'larry'}, {name: 'curly'}];
//    var iterator = function(value) { return value.name; };
//    deepEqual(_.map(_.uniq(list, false, iterator), iterator), ['moe', 'curly', 'larry'], 'can find the unique values of an array using a custom iterator');
//
//    deepEqual(_.map(_.uniq(list, iterator), iterator), ['moe', 'curly', 'larry'], 'can find the unique values of an array using a custom iterator without specifying whether array is sorted');
//
//    iterator = function(value) { return value + 1; };
//    list = [1, 2, 2, 3, 4, 4];
//    deepEqual(_.uniq(list, true, iterator), [1, 2, 3, 4], 'iterator works with sorted array');
//
//    var kittens = [
//      {kitten: 'Celery', cuteness: 8},
//      {kitten: 'Juniper', cuteness: 10},
//      {kitten: 'Spottis', cuteness: 10}
//    ];
//
//    var expected = [
//      {kitten: 'Celery', cuteness: 8},
//      {kitten: 'Juniper', cuteness: 10}
//    ];
//
//    deepEqual(_.uniq(kittens, true, 'cuteness'), expected, 'string iterator works with sorted array');
//
//
//    var result = (function(){ return _.uniq(arguments); }(1, 2, 1, 3, 1, 4));
//    deepEqual(result, [1, 2, 3, 4], 'works on an arguments object');
//
//    var a = {}, b = {}, c = {};
//    deepEqual(_.uniq([a, b, a, b, c]), [a, b, c], 'works on values that can be tested for equivalency but not ordered');
//
//    deepEqual(_.uniq(null), []);
//
//    var context = {};
//    list = [3];
//    _.uniq(list, function(value, index, array) {
//      strictEqual(this, context);
//      strictEqual(value, 3);
//      strictEqual(index, 0);
//      strictEqual(array, list);
//    }, context);
//
//    deepEqual(_.uniq([{a: 1, b: 1}, {a: 1, b: 2}, {a: 1, b: 3}, {a: 2, b: 1}], 'a'), [{a: 1, b: 1}, {a: 2, b: 1}], 'can use pluck like iterator');
//    deepEqual(_.uniq([{0: 1, b: 1}, {0: 1, b: 2}, {0: 1, b: 3}, {0: 2, b: 1}], 0), [{0: 1, b: 1}, {0: 2, b: 1}], 'can use falsey pluck like iterator');
    }
  }
}