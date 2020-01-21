package typings.yup.mod

import typings.yup.AnonMax
import typings.yup.AnonMin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasicArraySchema[T /* <: js.UndefOr[js.Array[_] | Null] */] extends Schema[T] {
  def compact(): this.type = js.native
  def compact(
    rejector: js.Function3[
      /* value */ InferredArrayType[T], 
      /* index */ Double, 
      /* array */ js.Array[InferredArrayType[T]], 
      Boolean
    ]
  ): this.type = js.native
  def ensure(): this.type = js.native
  def max(limit: Double): this.type = js.native
  def max(limit: Double, message: TestOptionsMessage[AnonMax, _]): this.type = js.native
  def max(limit: Ref_): this.type = js.native
  def max(limit: Ref_, message: TestOptionsMessage[AnonMax, _]): this.type = js.native
  def min(limit: Double): this.type = js.native
  def min(limit: Double, message: TestOptionsMessage[AnonMin, _]): this.type = js.native
  def min(limit: Ref_): this.type = js.native
  def min(limit: Ref_, message: TestOptionsMessage[AnonMin, _]): this.type = js.native
}

