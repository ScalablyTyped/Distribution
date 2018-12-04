package typings
package yupLib.yupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectSchema[T] extends Schema[T] {
  def camelCase(): ObjectSchema[T] = js.native
  def constantCase(): ObjectSchema[T] = js.native
  def from(fromKey: java.lang.String, toKey: java.lang.String): ObjectSchema[T] = js.native
  def from(fromKey: java.lang.String, toKey: java.lang.String, alias: scala.Boolean): ObjectSchema[T] = js.native
  def noUnknown(): ObjectSchema[T] = js.native
  def noUnknown(onlyKnownKeys: scala.Boolean): ObjectSchema[T] = js.native
  def noUnknown(onlyKnownKeys: scala.Boolean, message: TestOptionsMessage): ObjectSchema[T] = js.native
  def shape(fields: yupLib.yupLibStrings.ObjectSchema with T): ObjectSchema[T] = js.native
  def shape(
    fields: yupLib.yupLibStrings.ObjectSchema with T,
    noSortEdges: js.Array[js.Tuple2[java.lang.String, java.lang.String]]
  ): ObjectSchema[T] = js.native
  def transformKeys(callback: js.Function1[/* key */ js.Any, _]): scala.Unit = js.native
}

