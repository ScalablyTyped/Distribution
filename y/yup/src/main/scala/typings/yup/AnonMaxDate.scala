package typings.yup

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxDate extends js.Object {
  var max: Date | String
}

object AnonMaxDate {
  @scala.inline
  def apply(max: Date | String): AnonMaxDate = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMaxDate]
  }
}

