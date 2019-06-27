package typings
package yupLib.yupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasicArraySchema[T /* <: js.UndefOr[js.Array[_] | scala.Null] */] extends Schema[T] {
  def compact(): this.type = js.native
  def compact(
    rejector: js.Function3[
      /* value */ InferredArrayType[T], 
      /* index */ scala.Double, 
      /* array */ js.Array[InferredArrayType[T]], 
      scala.Boolean
    ]
  ): this.type = js.native
  def ensure(): this.type = js.native
  def max(limit: scala.Double): this.type = js.native
  def max(limit: scala.Double, message: TestOptionsMessage): this.type = js.native
  def max(limit: Ref): this.type = js.native
  def max(limit: Ref, message: TestOptionsMessage): this.type = js.native
  def min(limit: scala.Double): this.type = js.native
  def min(limit: scala.Double, message: TestOptionsMessage): this.type = js.native
  def min(limit: Ref): this.type = js.native
  def min(limit: Ref, message: TestOptionsMessage): this.type = js.native
}

