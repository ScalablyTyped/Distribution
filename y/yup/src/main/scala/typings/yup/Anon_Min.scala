package typings.yup

import typings.yup.yupMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Min extends js.Object {
  var min: Double | Ref
}

object Anon_Min {
  @scala.inline
  def apply(min: Double | Ref): Anon_Min = {
    val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Min]
  }
}

