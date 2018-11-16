package typings
package yupLib.yupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArraySchema[T]
  extends Schema[js.Array[T]] {
  def compact(): ArraySchema[T] = js.native
  def compact(rejector: js.Function1[/* value */ js.Any, scala.Boolean]): ArraySchema[T] = js.native
  def ensure(): ArraySchema[T] = js.native
  def max(limit: scala.Double): ArraySchema[T] = js.native
  def max(limit: scala.Double, message: java.lang.String): ArraySchema[T] = js.native
  def max(limit: Ref): ArraySchema[T] = js.native
  def max(limit: Ref, message: java.lang.String): ArraySchema[T] = js.native
  def min(limit: scala.Double): ArraySchema[T] = js.native
  def min(limit: scala.Double, message: java.lang.String): ArraySchema[T] = js.native
  def min(limit: Ref): ArraySchema[T] = js.native
  def min(limit: Ref, message: java.lang.String): ArraySchema[T] = js.native
  def of[U](`type`: Schema[U]): ArraySchema[U] = js.native
}

