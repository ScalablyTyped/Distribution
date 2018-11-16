package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * store
 */
@js.native
trait StoreStatic extends js.Object {
  var enable: scala.Boolean = js.native
  var page: js.Any = js.native
  var storage: js.Any = js.native
  def clear(): scala.Unit = js.native
  def deserialize[T](value: java.lang.String): T = js.native
  def forEach[T](cb: js.Function2[/* key */ java.lang.String, /* value */ T, _]): js.Any = js.native
  def get[T](key: java.lang.String): T = js.native
  def getAll[T](): T = js.native
  def getItem(key: java.lang.String): java.lang.String = js.native
  def key(index: scala.Double): java.lang.String = js.native
  def length(): scala.Double = js.native
  def pageClear(): js.Any = js.native
  def pageGet(key: java.lang.String): js.Any = js.native
  def pageRemove(key: java.lang.String): js.Any = js.native
  def pageSave(): js.Any = js.native
  def pageSet(key: java.lang.String, value: js.Any): js.Any = js.native
  def remove(key: java.lang.String): js.Any = js.native
  def removeItem(key: java.lang.String): js.Any = js.native
  def serialize(value: js.Any): java.lang.String = js.native
  def set[T](key: java.lang.String): js.Any = js.native
  def set[T](key: java.lang.String, value: T): js.Any = js.native
  def setItem(key: java.lang.String, value: js.Any): js.Any = js.native
}

