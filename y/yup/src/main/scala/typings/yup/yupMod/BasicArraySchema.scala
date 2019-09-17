package typings.yup.yupMod

import typings.yup.Anon_Max
import typings.yup.Anon_Min
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
  def max(limit: Double, message: TestOptionsMessage[Anon_Max, _]): this.type = js.native
  def max(limit: Ref): this.type = js.native
  def max(limit: Ref, message: TestOptionsMessage[Anon_Max, _]): this.type = js.native
  def min(limit: Double): this.type = js.native
  def min(limit: Double, message: TestOptionsMessage[Anon_Min, _]): this.type = js.native
  def min(limit: Ref): this.type = js.native
  def min(limit: Ref, message: TestOptionsMessage[Anon_Min, _]): this.type = js.native
}

