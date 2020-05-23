package typings.yup.mod

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectSchemaConstructor
  extends AnySchemaConstructor
     with Instantiable0[ObjectSchema[js.Object]] {
  def apply[T /* <: js.Object */](): ObjectSchema[js.UndefOr[T]] = js.native
  def apply[T /* <: js.Object */](fields: ObjectSchemaDefinition[T]): ObjectSchema[js.UndefOr[T]] = js.native
}

