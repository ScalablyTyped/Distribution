package typings.yup

import typings.yup.yupMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Values[T] extends js.Object {
  var values: T | Ref
}

object Anon_Values {
  @scala.inline
  def apply[T](values: T | Ref): Anon_Values[T] = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Values[T]]
  }
}

