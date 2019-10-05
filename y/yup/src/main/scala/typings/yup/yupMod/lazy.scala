package typings.yup.yupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yup", "lazy")
@js.native
object `lazy` extends js.Object {
  def apply[T](fn: js.Function1[/* value */ T, Schema[T]]): Lazy = js.native
}

