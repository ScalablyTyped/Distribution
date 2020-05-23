package typings.yup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Min extends js.Object {
  var min: Double
}

object Min {
  @scala.inline
  def apply(min: Double): Min = {
    val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Min]
  }
}

