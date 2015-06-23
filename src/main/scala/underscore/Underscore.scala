
import scala.scalajs.js
import js.annotation._

package importedjs {

package `\u0952` {

trait ThrottleSettings extends js.Object {
  var leading: Boolean = js.native
  var trailing: Boolean = js.native
}

trait TemplateSettings extends js.Object {
  var evaluate: RegExp = js.native
  var interpolate: RegExp = js.native
  var escape: RegExp = js.native
}

trait Collection[T] extends js.Object {
}

trait List[T] extends Collection[T] {
  @JSBracketAccess
  def apply(index: Double): T = js.native
  @JSBracketAccess
  def update(index: Double, v: T): Unit = js.native
  var length: Double = js.native
}

trait Dictionary[T] extends Collection[T] {
  @JSBracketAccess
  def apply(index: String): T = js.native
  @JSBracketAccess
  def update(index: String, v: T): Unit = js.native
}

trait ListIterator[T, TResult] extends js.Object {
  def apply(value: T, index: Double, list: List[T]): TResult = js.native
}

trait ObjectIterator[T, TResult] extends js.Object {
  def apply(element: T, key: String, list: Dictionary[T]): TResult = js.native
}

trait MemoIterator[T, TResult] extends js.Object {
  def apply(prev: TResult, curr: T, index: Double, list: List[T]): TResult = js.native
}

trait MemoObjectIterator[T, TResult] extends js.Object {
  def apply(prev: TResult, curr: T, key: String, list: Dictionary[T]): TResult = js.native
}

}

trait UnderscoreStatic extends js.Object {
  def apply[T](value: js.Array[T]): Underscore[T] = js.native
  def each[T](list: `\u0952`.List[T], iterator: `\u0952`.ListIterator[T, Unit], context: js.Any = ???): `\u0952`.List[T] = js.native
  def each[T](`object`: `\u0952`.Dictionary[T], iterator: `\u0952`.ObjectIterator[T, Unit], context: js.Any = ???): `\u0952`.Dictionary[T] = js.native
  def forEach[T](list: `\u0952`.List[T], iterator: `\u0952`.ListIterator[T, Unit], context: js.Any = ???): `\u0952`.List[T] = js.native
  def forEach[T](`object`: `\u0952`.Dictionary[T], iterator: `\u0952`.ObjectIterator[T, Unit], context: js.Any = ???): `\u0952`.Dictionary[T] = js.native
  def map[T, TResult](list: `\u0952`.List[T], iterator: `\u0952`.ListIterator[T, TResult], context: js.Any = ???): js.Array[TResult] = js.native
  def map[T, TResult](`object`: `\u0952`.Dictionary[T], iterator: `\u0952`.ObjectIterator[T, TResult], context: js.Any = ???): js.Array[TResult] = js.native
  def collect[T, TResult](list: `\u0952`.List[T], iterator: `\u0952`.ListIterator[T, TResult], context: js.Any = ???): js.Array[TResult] = js.native
  def collect[T, TResult](`object`: `\u0952`.Dictionary[T], iterator: `\u0952`.ObjectIterator[T, TResult], context: js.Any = ???): js.Array[TResult] = js.native
  def reduce[T, TResult](list: `\u0952`.Collection[T], iterator: `\u0952`.MemoIterator[T, TResult], memo: TResult = ???, context: js.Any = ???): TResult = js.native
  def inject[T, TResult](list: `\u0952`.Collection[T], iterator: `\u0952`.MemoIterator[T, TResult], memo: TResult = ???, context: js.Any = ???): TResult = js.native
  def foldl[T, TResult](list: `\u0952`.Collection[T], iterator: `\u0952`.MemoIterator[T, TResult], memo: TResult = ???, context: js.Any = ???): TResult = js.native
  def reduceRight[T, TResult](list: `\u0952`.Collection[T], iterator: `\u0952`.MemoIterator[T, TResult], memo: TResult = ???, context: js.Any = ???): TResult = js.native
  def foldr[T, TResult](list: `\u0952`.Collection[T], iterator: `\u0952`.MemoIterator[T, TResult], memo: TResult = ???, context: js.Any = ???): TResult = js.native
  def find[T](list: `\u0952`.List[T], iterator: `\u0952`.ListIterator[T, Boolean], context: js.Any = ???): T = js.native
  def find[T](`object`: `\u0952`.Dictionary[T], iterator: `\u0952`.ObjectIterator[T, Boolean], context: js.Any = ???): T = js.native
  def detect[T](list: `\u0952`.List[T], iterator: `\u0952`.ListIterator[T, Boolean], context: js.Any = ???): T = js.native
  def detect[T](`object`: `\u0952`.Dictionary[T], iterator: `\u0952`.ObjectIterator[T, Boolean], context: js.Any = ???): T = js.native
  def findIndex[T](list: `\u0952`.List[T], iterator: `\u0952`.ListIterator[T, Boolean], context: js.Any = ???): Double = js.native
  def filter[T](list: `\u0952`.List[T], iterator: `\u0952`.ListIterator[T, Boolean], context: js.Any = ???): js.Array[T] = js.native
  def filter[T](`object`: `\u0952`.Dictionary[T], iterator: `\u0952`.ObjectIterator[T, Boolean], context: js.Any = ???): js.Array[T] = js.native
  def select[T](list: `\u0952`.List[T], iterator: `\u0952`.ListIterator[T, Boolean], context: js.Any = ???): js.Array[T] = js.native
  def select[T](`object`: `\u0952`.Dictionary[T], iterator: `\u0952`.ObjectIterator[T, Boolean], context: js.Any = ???): js.Array[T] = js.native
  def where[T, U <: AnyRef](list: `\u0952`.List[T], properties: U): js.Array[T] = js.native
  def findWhere[T, U <: AnyRef](list: `\u0952`.List[T], properties: U): T = js.native
  def reject[T](list: `\u0952`.List[T], iterator: `\u0952`.ListIterator[T, Boolean], context: js.Any = ???): js.Array[T] = js.native
  def reject[T](`object`: `\u0952`.Dictionary[T], iterator: `\u0952`.ObjectIterator[T, Boolean], context: js.Any = ???): js.Array[T] = js.native
  def every[T](list: `\u0952`.List[T], iterator: `\u0952`.ListIterator[T, Boolean] = ???, context: js.Any = ???): Boolean = js.native
  def all[T](list: `\u0952`.List[T], iterator: `\u0952`.ListIterator[T, Boolean] = ???, context: js.Any = ???): Boolean = js.native
  def some[T](list: `\u0952`.List[T], iterator: `\u0952`.ListIterator[T, Boolean] = ???, context: js.Any = ???): Boolean = js.native
  def some[T](`object`: `\u0952`.Dictionary[T], iterator: `\u0952`.ObjectIterator[T, Boolean] = ???, context: js.Any = ???): Boolean = js.native
  def any[T](list: `\u0952`.List[T], iterator: `\u0952`.ListIterator[T, Boolean] = ???, context: js.Any = ???): Boolean = js.native
  def any[T](`object`: `\u0952`.Dictionary[T], iterator: `\u0952`.ObjectIterator[T, Boolean] = ???, context: js.Any = ???): Boolean = js.native
  def contains[T](list: `\u0952`.List[T], value: T): Boolean = js.native
  def contains[T](`object`: `\u0952`.Dictionary[T], value: T): Boolean = js.native
  def include[T](list: `\u0952`.Collection[T], value: T): Boolean = js.native
  def include[T](`object`: `\u0952`.Dictionary[T], value: T): Boolean = js.native
  def invoke[T <: AnyRef](list: `\u0952`.List[T], methodName: String, arguments: js.Any*): js.Dynamic = js.native
  def pluck[T <: AnyRef](list: `\u0952`.List[T], propertyName: String): js.Array[js.Any] = js.native
  def max(list: `\u0952`.List[Double]): Double = js.native
  def max[T](list: `\u0952`.List[T], iterator: `\u0952`.ListIterator[T, js.Any] = ???, context: js.Any = ???): T = js.native
  def min(list: `\u0952`.List[Double]): Double = js.native
  def min[T](list: `\u0952`.List[T], iterator: `\u0952`.ListIterator[T, js.Any] = ???, context: js.Any = ???): T = js.native
  def sortBy[T, TSort](list: `\u0952`.List[T], iterator: `\u0952`.ListIterator[T, TSort] = ???, context: js.Any = ???): js.Array[T] = js.native
  def sortBy[T](list: `\u0952`.List[T], iterator: String, context: js.Any = ???): js.Array[T] = js.native
  def groupBy[T](list: `\u0952`.List[T], iterator: `\u0952`.ListIterator[T, js.Any] = ???, context: js.Any = ???): `\u0952`.Dictionary[js.Array[T]] = js.native
  def indexBy[T](list: `\u0952`.List[T], iterator: `\u0952`.ListIterator[T, js.Any], context: js.Any = ???): `\u0952`.Dictionary[T] = js.native
  def countBy[T](list: `\u0952`.List[T], iterator: `\u0952`.ListIterator[T, js.Any] = ???, context: js.Any = ???): `\u0952`.Dictionary[Double] = js.native
  def shuffle[T](list: `\u0952`.Collection[T]): js.Array[T] = js.native
  def sample[T](list: `\u0952`.Collection[T], n: Double): js.Array[T] = js.native
  def sample[T](list: `\u0952`.Collection[T]): T = js.native
  def toArray[T](list: `\u0952`.Collection[T]): js.Array[T] = js.native
  def size[T](list: `\u0952`.Collection[T]): Double = js.native
  def partition[T](array: js.Array[T], iterator: `\u0952`.ListIterator[T, Boolean], context: js.Any = ???): js.Array[js.Array[T]] = js.native
  def first[T](array: `\u0952`.List[T]): T = js.native
  def first[T](array: `\u0952`.List[T], n: Double): js.Array[T] = js.native
  def head[T](array: `\u0952`.List[T]): T = js.native
  def head[T](array: `\u0952`.List[T], n: Double): js.Array[T] = js.native
  def take[T](array: `\u0952`.List[T]): T = js.native
  def take[T](array: `\u0952`.List[T], n: Double): js.Array[T] = js.native
  def initial[T](array: `\u0952`.List[T], n: Double = ???): js.Array[T] = js.native
  def last[T](array: `\u0952`.List[T]): T = js.native
  def last[T](array: `\u0952`.List[T], n: Double): js.Array[T] = js.native
  def rest[T](array: `\u0952`.List[T], n: Double = ???): js.Array[T] = js.native
  def tail[T](array: `\u0952`.List[T], n: Double = ???): js.Array[T] = js.native
  def drop[T](array: `\u0952`.List[T], n: Double = ???): js.Array[T] = js.native
  def compact[T](array: `\u0952`.List[T]): js.Array[T] = js.native
  def flatten(array: `\u0952`.List[js.Any], shallow: Boolean = ???): js.Array[js.Any] = js.native
  def without[T](array: `\u0952`.List[T], values: T*): js.Array[T] = js.native
  def union[T](arrays: `\u0952`.List[T]*): js.Array[T] = js.native
  def intersection[T](arrays: `\u0952`.List[T]*): js.Array[T] = js.native
  def difference[T](array: `\u0952`.List[T], others: `\u0952`.List[T]*): js.Array[T] = js.native
  def uniq[T, TSort](array: `\u0952`.List[T], isSorted: Boolean = ???, iterator: `\u0952`.ListIterator[T, TSort] = ???, context: js.Any = ???): js.Array[T] = js.native
  def uniq[T, TSort](array: `\u0952`.List[T], iterator: `\u0952`.ListIterator[T, TSort] = ???, context: js.Any = ???): js.Array[T] = js.native
  def unique[T, TSort](array: `\u0952`.List[T], iterator: `\u0952`.ListIterator[T, TSort] = ???, context: js.Any = ???): js.Array[T] = js.native
  def unique[T, TSort](array: `\u0952`.List[T], isSorted: Boolean = ???, iterator: `\u0952`.ListIterator[T, TSort] = ???, context: js.Any = ???): js.Array[T] = js.native
  def zip(arrays: js.Array[js.Any]*): js.Array[js.Array[js.Any]] = js.native
  def zip(arrays: js.Any*): js.Array[js.Any] = js.native
  def `object`[TResult <: AnyRef](keys: `\u0952`.List[String], values: `\u0952`.List[js.Any]): TResult = js.native
  def `object`[TResult <: AnyRef](keyValuePairs: js.Array[js.Any]*): TResult = js.native
  def `object`[TResult <: AnyRef](list: `\u0952`.List[js.Any], values: js.Any = ???): TResult = js.native
  def indexOf[T](array: `\u0952`.List[T], value: T, isSorted: Boolean = ???): Double = js.native
  def indexOf[T](array: `\u0952`.List[T], value: T, startFrom: Double): Double = js.native
  def lastIndexOf[T](array: `\u0952`.List[T], value: T, from: Double = ???): Double = js.native
  def sortedIndex[T, TSort](list: `\u0952`.List[T], value: T, iterator: js.Function1[T, TSort] = ???, context: js.Any = ???): Double = js.native
  def range(start: Double, stop: Double, step: Double = ???): js.Array[Double] = js.native
  def range(stop: Double): js.Array[Double] = js.native
  def bind(func: js.Function, context: js.Any, arguments: js.Any*): js.Function0[Any] = js.native
  def bindAll(`object`: js.Any, methodNames: String*): js.Dynamic = js.native
  def partial(fn: js.Function, arguments: js.Any*): js.Function = js.native
  def memoize(fn: js.Function, hashFn: js.Function = ???): js.Function = js.native
  def delay(func: js.Function, wait: Double, arguments: js.Any*): js.Dynamic = js.native
  def delay(func: js.Function, arguments: js.Any*): js.Dynamic = js.native
  def defer(fn: js.Function, arguments: js.Any*): Unit = js.native
  def throttle[T <: js.Function](func: T, wait: Double, options: `\u0952`.ThrottleSettings = ???): T = js.native
  def debounce[T <: js.Function](fn: T, wait: Double, immediate: Boolean = ???): T = js.native
  def once[T <: js.Function](fn: T): T = js.native
  def after(count: Double, fn: js.Function): js.Function = js.native
  def before(count: Double, fn: js.Function): js.Function = js.native
  def wrap(fn: js.Function, wrapper: js.Function): js.Function = js.native
  def negate(predicate: js.Function): Boolean = js.native
  def compose(functions: js.Function*): js.Function = js.native
  def keys(`object`: js.Any): js.Array[String] = js.native
  def values(`object`: js.Any): js.Array[js.Any] = js.native
  def mapObject[T, U](`object`: `\u0952`.Dictionary[T], iteratee: js.Function3[T, String, `\u0952`.Dictionary[T], U], context: js.Any = ???): `\u0952`.Dictionary[U] = js.native
  def mapObject[T](`object`: js.Any, iteratee: js.Function3[js.Any, String, js.Any, T], context: js.Any = ???): `\u0952`.Dictionary[T] = js.native
  def mapObject(`object`: js.Any, iteratee: String, context: js.Any = ???): `\u0952`.Dictionary[js.Any] = js.native
  def pairs(`object`: js.Any): js.Array[js.Array[js.Any]] = js.native
  def invert(`object`: js.Any): js.Dynamic = js.native
  def functions(`object`: js.Any): js.Array[String] = js.native
  def methods(`object`: js.Any): js.Array[String] = js.native
  def extend(destination: js.Any, sources: js.Any*): js.Dynamic = js.native
  def pick(`object`: js.Any, keys: js.Any*): js.Dynamic = js.native
  def pick(`object`: js.Any, fn: js.Function3[js.Any, js.Any, js.Any, Any]): js.Dynamic = js.native
  def omit(`object`: js.Any, keys: String*): js.Dynamic = js.native
  def omit(`object`: js.Any, iteratee: js.Function): js.Dynamic = js.native
  def defaults(`object`: js.Any, defaults: js.Any*): js.Dynamic = js.native
  def clone[T](`object`: T): T = js.native
  def tap[T](`object`: T, intercepter: js.Function): T = js.native
  def has(`object`: js.Any, key: String): Boolean = js.native
  def matches[T, TResult](attrs: T): `\u0952`.ListIterator[T, TResult] = js.native
  def property(key: String): js.Function1[Object, Any] = js.native
  def isEqual(`object`: js.Any, other: js.Any): Boolean = js.native
  def isEmpty(`object`: js.Any): Boolean = js.native
  def isElement(`object`: js.Any): Boolean = js.native
  def isArray(`object`: js.Any): Boolean = js.native
  def isObject(`object`: js.Any): Boolean = js.native
  def isArguments(`object`: js.Any): Boolean = js.native
  def isFunction(`object`: js.Any): Boolean = js.native
  def isString(`object`: js.Any): Boolean = js.native
  def isNumber(`object`: js.Any): Boolean = js.native
  def isFinite(`object`: js.Any): Boolean = js.native
  def isBoolean(`object`: js.Any): Boolean = js.native
  def isDate(`object`: js.Any): Boolean = js.native
  def isRegExp(`object`: js.Any): Boolean = js.native
  def isNaN(`object`: js.Any): Boolean = js.native
  def isNull(`object`: js.Any): Boolean = js.native
  def isUndefined(value: js.Any): Boolean = js.native
  def noConflict(): js.Dynamic = js.native
  def identity[T](value: T): T = js.native
  def constant[T](value: T): js.Function0[T] = js.native
  def noop(): Unit = js.native
  def times[TResult](n: Double, iterator: js.Function1[Double, TResult], context: js.Any = ???): js.Array[TResult] = js.native
  def random(max: Double): Double = js.native
  def random(min: Double, max: Double): Double = js.native
  def mixin(`object`: js.Any): Unit = js.native
  def iteratee(value: String): js.Function = js.native
  def iteratee(value: js.Function, context: js.Any = ???, argCount: Double = ???): js.Function = js.native
  def uniqueId(prefix: String): String = js.native
  def uniqueId(): Double = js.native
  def escape(str: String): String = js.native
  def unescape(str: String): String = js.native
  def result(`object`: js.Any, property: String): js.Dynamic = js.native
  def template(templateString: String, settings: `\u0952`.TemplateSettings = ???): js.Function = js.native
  var templateSettings: `\u0952`.TemplateSettings = js.native
  def now(): Double = js.native
  def chain[T](obj: js.Array[T]): _Chain[T] = js.native
  def chain[T <: AnyRef](obj: T): _Chain[T] = js.native
  def value[T, TResult](obj: T): TResult = js.native
}

/*trait Underscore[T] extends js.Object {
  def each(iterator: `\u0952`.ListIterator[T, Unit], context: js.Any = ???): js.Array[T] = js.native
  def forEach(iterator: `\u0952`.ListIterator[T, Unit], context: js.Any = ???): js.Array[T] = js.native
  def map[TResult](iterator: `\u0952`.ListIterator[T, TResult], context: js.Any = ???): js.Array[TResult] = js.native
  def collect[TResult](iterator: `\u0952`.ListIterator[T, TResult], context: js.Any = ???): js.Array[TResult] = js.native
  def reduce[TResult](iterator: `\u0952`.MemoIterator[T, TResult], memo: TResult = ???, context: js.Any = ???): TResult = js.native
  def inject[TResult](iterator: `\u0952`.MemoIterator[T, TResult], memo: TResult = ???, context: js.Any = ???): TResult = js.native
  def foldl[TResult](iterator: `\u0952`.MemoIterator[T, TResult], memo: TResult = ???, context: js.Any = ???): TResult = js.native
  def reduceRight[TResult](iterator: `\u0952`.MemoIterator[T, TResult], memo: TResult = ???, context: js.Any = ???): TResult = js.native
  def foldr[TResult](iterator: `\u0952`.MemoIterator[T, TResult], memo: TResult = ???, context: js.Any = ???): TResult = js.native
  def find(iterator: `\u0952`.ListIterator[T, Boolean], context: js.Any = ???): T = js.native
  def detect(iterator: `\u0952`.ListIterator[T, Boolean], context: js.Any = ???): T = js.native
  def filter(iterator: `\u0952`.ListIterator[T, Boolean], context: js.Any = ???): js.Array[T] = js.native
  def select(iterator: `\u0952`.ListIterator[T, Boolean], context: js.Any = ???): js.Array[T] = js.native
  def where[U <: AnyRef](properties: U): js.Array[T] = js.native
  def findWhere[U <: AnyRef](properties: U): T = js.native
  def reject(iterator: `\u0952`.ListIterator[T, Boolean], context: js.Any = ???): js.Array[T] = js.native
  def all(iterator: `\u0952`.ListIterator[T, Boolean] = ???, context: js.Any = ???): Boolean = js.native
  def every(iterator: `\u0952`.ListIterator[T, Boolean] = ???, context: js.Any = ???): Boolean = js.native
  def any(iterator: `\u0952`.ListIterator[T, Boolean] = ???, context: js.Any = ???): Boolean = js.native
  def some(iterator: `\u0952`.ListIterator[T, Boolean] = ???, context: js.Any = ???): Boolean = js.native
  def contains(value: T): Boolean = js.native
  def include(value: T): Boolean = js.native
  def invoke(methodName: String, arguments: js.Any*): js.Dynamic = js.native
  def pluck(propertyName: String): js.Array[js.Any] = js.native
  def max(): Double = js.native
  def max(iterator: `\u0952`.ListIterator[T, Double], context: js.Any = ???): T = js.native
  def min(): Double = js.native
  def min(iterator: `\u0952`.ListIterator[T, Double], context: js.Any = ???): T = js.native
  def sortBy(iterator: `\u0952`.ListIterator[T, js.Any] = ???, context: js.Any = ???): js.Array[T] = js.native
  def groupBy(iterator: `\u0952`.ListIterator[T, js.Any] = ???, context: js.Any = ???): `\u0952`.Dictionary[`\u0952`.List[T]] = js.native
  def groupBy(iterator: String, context: js.Any = ???): `\u0952`.Dictionary[js.Array[T]] = js.native
  def indexBy(iterator: `\u0952`.ListIterator[T, js.Any], context: js.Any = ???): `\u0952`.Dictionary[T] = js.native
  def countBy(iterator: `\u0952`.ListIterator[T, js.Any] = ???, context: js.Any = ???): `\u0952`.Dictionary[Double] = js.native
  def shuffle(): js.Array[T] = js.native
  def sample[T](n: Double): js.Array[T] = js.native
  def sample[T](): T = js.native
  def toArray(): js.Array[T] = js.native
  def size(): Double = js.native
  def first(): T = js.native
  def first(n: Double): js.Array[T] = js.native
  def head(): T = js.native
  def head(n: Double): js.Array[T] = js.native
  def take(): T = js.native
  def take(n: Double): js.Array[T] = js.native
  def initial(n: Double = ???): js.Array[T] = js.native
  def last(): T = js.native
  def last(n: Double): js.Array[T] = js.native
  def rest(n: Double = ???): js.Array[T] = js.native
  def tail(n: Double = ???): js.Array[T] = js.native
  def drop(n: Double = ???): js.Array[T] = js.native
  def compact(): js.Array[T] = js.native
  def flatten(shallow: Boolean = ???): js.Array[js.Any] = js.native
  def without(values: T*): js.Array[T] = js.native
  def partition(iterator: `\u0952`.ListIterator[T, Boolean], context: js.Any = ???): js.Array[js.Array[T]] = js.native
  def union(arrays: `\u0952`.List[T]*): js.Array[T] = js.native
  def intersection(arrays: `\u0952`.List[T]*): js.Array[T] = js.native
  def difference(others: `\u0952`.List[T]*): js.Array[T] = js.native
  def uniq(isSorted: Boolean = ???, iterator: `\u0952`.ListIterator[T, js.Any] = ???): js.Array[T] = js.native
  def uniq[TSort](iterator: `\u0952`.ListIterator[T, TSort] = ???, context: js.Any = ???): js.Array[T] = js.native
  def unique[TSort](isSorted: Boolean = ???, iterator: `\u0952`.ListIterator[T, TSort] = ???): js.Array[T] = js.native
  def unique[TSort](iterator: `\u0952`.ListIterator[T, TSort] = ???, context: js.Any = ???): js.Array[T] = js.native
  def zip(arrays: js.Array[js.Any]*): js.Array[js.Array[js.Any]] = js.native
  def `object`(keyValuePairs: js.Array[js.Any]*): js.Dynamic = js.native
  def `object`(values: js.Any = ???): js.Dynamic = js.native
  def indexOf(value: T, isSorted: Boolean = ???): Double = js.native
  def indexOf(value: T, startFrom: Double): Double = js.native
  def lastIndexOf(value: T, from: Double = ???): Double = js.native
  def sortedIndex(value: T, iterator: js.Function1[T, Any] = ???, context: js.Any = ???): Double = js.native
  def range(stop: Double, step: Double = ???): js.Array[Double] = js.native
  def range(): js.Array[Double] = js.native
  def bind(`object`: js.Any, arguments: js.Any*): js.Function = js.native
  def bindAll(methodNames: String*): js.Dynamic = js.native
  def partial(arguments: js.Any*): js.Function = js.native
  def memoize(hashFn: js.Function1[js.Any, String] = ???): js.Function = js.native
  def defer(arguments: js.Any*): Unit = js.native
  def delay(wait: Double, arguments: js.Any*): js.Dynamic = js.native
  def delay(arguments: js.Any*): js.Dynamic = js.native
  def throttle(wait: Double, options: `\u0952`.ThrottleSettings = ???): js.Function = js.native
  def debounce(wait: Double, immediate: Boolean = ???): js.Function = js.native
  def once(): js.Function = js.native
  def after(fn: js.Function): js.Function = js.native
  def before(fn: js.Function): js.Function = js.native
  def wrap(wrapper: js.Function): js.Function0[js.Function] = js.native
  def negate(): Boolean = js.native
  def compose(functions: js.Function*): js.Function = js.native
  def keys(): js.Array[String] = js.native
  def values(): js.Array[T] = js.native
  def pairs(): js.Array[js.Array[js.Any]] = js.native
  def invert(): js.Dynamic = js.native
  def functions(): js.Array[String] = js.native
  def methods(): js.Array[String] = js.native
  def extend(sources: js.Any*): js.Dynamic = js.native
  def pick(keys: String*): js.Dynamic = js.native
  def pick(fn: js.Function3[js.Any, js.Any, js.Any, Any]): js.Dynamic = js.native
  def omit(keys: String*): js.Dynamic = js.native
  def omit(fn: js.Function): js.Dynamic = js.native
  def defaults(defaults: js.Any*): js.Dynamic = js.native
  def clone(): T = js.native
  def tap(interceptor: js.Function): js.Dynamic = js.native
  def has(key: String): Boolean = js.native
  def matches[TResult](): `\u0952`.ListIterator[T, TResult] = js.native
  def property(): js.Function1[Object, Any] = js.native
  def isEqual(other: js.Any): Boolean = js.native
  def isEmpty(): Boolean = js.native
  def isElement(): Boolean = js.native
  def isArray(): Boolean = js.native
  def isObject(): Boolean = js.native
  def isArguments(): Boolean = js.native
  def isFunction(): Boolean = js.native
  def isString(): Boolean = js.native
  def isNumber(): Boolean = js.native
  def isFinite(): Boolean = js.native
  def isBoolean(): Boolean = js.native
  def isDate(): Boolean = js.native
  def isRegExp(): Boolean = js.native
  def isNaN(): Boolean = js.native
  def isNull(): Boolean = js.native
  def isUndefined(): Boolean = js.native
  def identity(): js.Dynamic = js.native
  def constant(): js.Function0[T] = js.native
  def noop(): Unit = js.native
  def times[TResult](iterator: js.Function1[Double, TResult], context: js.Any = ???): js.Array[TResult] = js.native
  def random(): Double = js.native
  def random(max: Double): Double = js.native
  def mixin(): Unit = js.native
  def iteratee(context: js.Any = ???, argCount: Double = ???): js.Function = js.native
  def uniqueId(): String = js.native
  def escape(): String = js.native
  def unescape(): String = js.native
  def result(property: String): js.Dynamic = js.native
  def template(settings: `\u0952`.TemplateSettings = ???): js.Function = js.native
  def chain(): _Chain[T] = js.native
  def value[TResult](): TResult = js.native
}*/

/*trait _Chain[T] extends js.Object {
  def each(iterator: `\u0952`.ListIterator[T, Unit], context: js.Any = ???): _Chain[T] = js.native
  def forEach(iterator: `\u0952`.ListIterator[T, Unit], context: js.Any = ???): _Chain[T] = js.native
  def map[TArray](iterator: `\u0952`.ListIterator[T, js.Array[TArray]], context: js.Any = ???): _ChainOfArrays[TArray] = js.native
  def map[TResult](iterator: `\u0952`.ListIterator[T, TResult], context: js.Any = ???): _Chain[TResult] = js.native
  def collect[TResult](iterator: `\u0952`.ListIterator[T, TResult], context: js.Any = ???): _Chain[TResult] = js.native
  def reduce[TResult](iterator: `\u0952`.MemoIterator[T, TResult], memo: TResult = ???, context: js.Any = ???): _ChainSingle[TResult] = js.native
  def inject[TResult](iterator: `\u0952`.MemoIterator[T, TResult], memo: TResult = ???, context: js.Any = ???): _ChainSingle[TResult] = js.native
  def foldl[TResult](iterator: `\u0952`.MemoIterator[T, TResult], memo: TResult = ???, context: js.Any = ???): _ChainSingle[TResult] = js.native
  def reduceRight[TResult](iterator: `\u0952`.MemoIterator[T, TResult], memo: TResult = ???, context: js.Any = ???): _ChainSingle[TResult] = js.native
  def foldr[TResult](iterator: `\u0952`.MemoIterator[T, TResult], memo: TResult = ???, context: js.Any = ???): _ChainSingle[TResult] = js.native
  def find(iterator: `\u0952`.ListIterator[T, Boolean], context: js.Any = ???): _ChainSingle[T] = js.native
  def detect(iterator: `\u0952`.ListIterator[T, Boolean], context: js.Any = ???): _Chain[T] = js.native
  def filter(iterator: `\u0952`.ListIterator[T, Boolean], context: js.Any = ???): _Chain[T] = js.native
  def select(iterator: `\u0952`.ListIterator[T, Boolean], context: js.Any = ???): _Chain[T] = js.native
  def where[U <: AnyRef](properties: U): _Chain[T] = js.native
  def findWhere[U <: AnyRef](properties: U): _ChainSingle[T] = js.native
  def reject(iterator: `\u0952`.ListIterator[T, Boolean], context: js.Any = ???): _Chain[T] = js.native
  def all(iterator: `\u0952`.ListIterator[T, Boolean] = ???, context: js.Any = ???): _Chain[T] = js.native
  def every(iterator: `\u0952`.ListIterator[T, Boolean] = ???, context: js.Any = ???): _Chain[T] = js.native
  def any(iterator: `\u0952`.ListIterator[T, Boolean] = ???, context: js.Any = ???): _Chain[T] = js.native
  def some(iterator: `\u0952`.ListIterator[T, Boolean] = ???, context: js.Any = ???): _Chain[T] = js.native
  def contains(value: T): _Chain[T] = js.native
  def include(value: T): _Chain[T] = js.native
  def invoke(methodName: String, arguments: js.Any*): _Chain[T] = js.native
  def pluck(propertyName: String): _Chain[js.Any] = js.native
  def max(): _ChainSingle[T] = js.native
  def max(iterator: `\u0952`.ListIterator[T, Double], context: js.Any = ???): _ChainSingle[T] = js.native
  def min(): _ChainSingle[T] = js.native
  def min(iterator: `\u0952`.ListIterator[T, Double], context: js.Any = ???): _ChainSingle[T] = js.native
  def sortBy(iterator: `\u0952`.ListIterator[T, js.Any] = ???, context: js.Any = ???): _Chain[T] = js.native
  def groupBy(iterator: `\u0952`.ListIterator[T, js.Any] = ???, context: js.Any = ???): _ChainOfArrays[T] = js.native
  def indexBy(iterator: `\u0952`.ListIterator[T, js.Any], context: js.Any = ???): _Chain[T] = js.native
  def countBy(iterator: `\u0952`.ListIterator[T, js.Any] = ???, context: js.Any = ???): _Chain[T] = js.native
  def shuffle(): _Chain[T] = js.native
  def sample[T](n: Double): _Chain[T] = js.native
  def sample[T](): _Chain[T] = js.native
  def toArray(): _Chain[T] = js.native
  def size(): _Chain[T] = js.native
  def first(): _ChainSingle[T] = js.native
  def first(n: Double): _Chain[T] = js.native
  def head(): _Chain[T] = js.native
  def head(n: Double): _Chain[T] = js.native
  def take(): _Chain[T] = js.native
  def take(n: Double): _Chain[T] = js.native
  def initial(n: Double = ???): _Chain[T] = js.native
  def last(): _ChainSingle[T] = js.native
  def last(n: Double): _Chain[T] = js.native
  def rest(n: Double = ???): _Chain[T] = js.native
  def tail(n: Double = ???): _Chain[T] = js.native
  def drop(n: Double = ???): _Chain[T] = js.native
  def compact(): _Chain[T] = js.native
  def flatten(shallow: Boolean = ???): _Chain[js.Any] = js.native
  def without(values: T*): _Chain[T] = js.native
  def partition(iterator: `\u0952`.ListIterator[T, Boolean], context: js.Any = ???): _Chain[js.Array[js.Array[T]]] = js.native
  def union(arrays: `\u0952`.List[T]*): _Chain[T] = js.native
  def intersection(arrays: `\u0952`.List[T]*): _Chain[T] = js.native
  def difference(others: `\u0952`.List[T]*): _Chain[T] = js.native
  def uniq(isSorted: Boolean = ???, iterator: `\u0952`.ListIterator[T, js.Any] = ???): _Chain[T] = js.native
  def uniq[TSort](iterator: `\u0952`.ListIterator[T, TSort] = ???, context: js.Any = ???): _Chain[T] = js.native
  def unique[TSort](isSorted: Boolean = ???, iterator: `\u0952`.ListIterator[T, TSort] = ???): _Chain[T] = js.native
  def unique[TSort](iterator: `\u0952`.ListIterator[T, TSort] = ???, context: js.Any = ???): _Chain[T] = js.native
  def zip(arrays: js.Array[js.Any]*): _Chain[T] = js.native
  def `object`(keyValuePairs: js.Array[js.Any]*): _Chain[T] = js.native
  def `object`(values: js.Any = ???): _Chain[T] = js.native
  def indexOf(value: T, isSorted: Boolean = ???): _ChainSingle[T] = js.native
  def indexOf(value: T, startFrom: Double): _ChainSingle[T] = js.native
  def lastIndexOf(value: T, from: Double = ???): _ChainSingle[T] = js.native
  def sortedIndex(value: T, iterator: js.Function1[T, Any] = ???, context: js.Any = ???): _Chain[T] = js.native
  def range(stop: Double, step: Double = ???): _Chain[T] = js.native
  def range(): _Chain[T] = js.native
  def bind(`object`: js.Any, arguments: js.Any*): _Chain[T] = js.native
  def bindAll(methodNames: String*): _Chain[T] = js.native
  def partial(arguments: js.Any*): _Chain[T] = js.native
  def memoize(hashFn: js.Function1[js.Any, String] = ???): _Chain[T] = js.native
  def defer(arguments: js.Any*): _Chain[T] = js.native
  def delay(wait: Double, arguments: js.Any*): _Chain[T] = js.native
  def delay(arguments: js.Any*): _Chain[T] = js.native
  def throttle(wait: Double, options: `\u0952`.ThrottleSettings = ???): _Chain[T] = js.native
  def debounce(wait: Double, immediate: Boolean = ???): _Chain[T] = js.native
  def once(): _Chain[T] = js.native
  def after(func: js.Function): _Chain[T] = js.native
  def before(fn: js.Function): _Chain[T] = js.native
  def wrap(wrapper: js.Function): js.Function0[_Chain[T]] = js.native
  def negate(): _Chain[T] = js.native
  def compose(functions: js.Function*): _Chain[T] = js.native
  def keys(): _Chain[String] = js.native
  def values(): _Chain[T] = js.native
  def pairs(): _Chain[T] = js.native
  def invert(): _Chain[T] = js.native
  def functions(): _Chain[T] = js.native
  def methods(): _Chain[T] = js.native
  def extend(sources: js.Any*): _Chain[T] = js.native
  def pick(keys: String*): _Chain[T] = js.native
  def pick(fn: js.Function3[js.Any, js.Any, js.Any, Any]): _Chain[T] = js.native
  def omit(keys: String*): _Chain[T] = js.native
  def omit(iteratee: js.Function): _Chain[T] = js.native
  def defaults(defaults: js.Any*): _Chain[T] = js.native
  def clone(): _Chain[T] = js.native
  def tap(interceptor: js.Function): _Chain[T] = js.native
  def has(key: String): _Chain[T] = js.native
  def matches[TResult](): _Chain[T] = js.native
  def property(): _Chain[T] = js.native
  def isEqual(other: js.Any): _Chain[T] = js.native
  def isEmpty(): _Chain[T] = js.native
  def isElement(): _Chain[T] = js.native
  def isArray(): _Chain[T] = js.native
  def isObject(): _Chain[T] = js.native
  def isArguments(): _Chain[T] = js.native
  def isFunction(): _Chain[T] = js.native
  def isString(): _Chain[T] = js.native
  def isNumber(): _Chain[T] = js.native
  def isFinite(): _Chain[T] = js.native
  def isBoolean(): _Chain[T] = js.native
  def isDate(): _Chain[T] = js.native
  def isRegExp(): _Chain[T] = js.native
  def isNaN(): _Chain[T] = js.native
  def isNull(): _Chain[T] = js.native
  def isUndefined(): _Chain[T] = js.native
  def identity(): _Chain[T] = js.native
  def constant(): _Chain[T] = js.native
  def noop(): _Chain[T] = js.native
  def times[TResult](iterator: js.Function1[Double, TResult], context: js.Any = ???): _Chain[T] = js.native
  def random(): _Chain[T] = js.native
  def random(max: Double): _Chain[T] = js.native
  def mixin(): _Chain[T] = js.native
  def iteratee(context: js.Any = ???, argCount: Double = ???): _Chain[T] = js.native
  def uniqueId(): _Chain[T] = js.native
  def escape(): _Chain[T] = js.native
  def unescape(): _Chain[T] = js.native
  def result(property: String): _Chain[T] = js.native
  def template(settings: `\u0952`.TemplateSettings = ???): js.Function = js.native
  def concat(arr: js.Array[T]*): _Chain[T] = js.native
  def join(separator: js.Any = ???): _ChainSingle[T] = js.native
  def pop(): _ChainSingle[T] = js.native
  def push(item: T*): _Chain[T] = js.native
  def reverse(): _Chain[T] = js.native
  def shift(): _ChainSingle[T] = js.native
  def slice(start: Double, end: Double = ???): _Chain[T] = js.native
  def sort(compareFn: js.Function2[T, T, Boolean]): _Chain[T] = js.native
  def splice(index: Double, quantity: Double, items: T*): _Chain[T] = js.native
  def toString(): _ChainSingle[T] = js.native
  def unshift(items: T*): _Chain[T] = js.native
  def chain(): _Chain[T] = js.native
  def value[TResult](): js.Array[T] = js.native
}*/

/*trait _ChainSingle[T] extends js.Object {
  def value(): T = js.native
}*/

/*trait _ChainOfArrays[T] extends _Chain[js.Array[T]] {
  def flatten(): _Chain[T] = js.native
}*/

}

/*package object importedjs extends js.GlobalScope {
  var `\u0952`: UnderscoreStatic = js.native
}*/
