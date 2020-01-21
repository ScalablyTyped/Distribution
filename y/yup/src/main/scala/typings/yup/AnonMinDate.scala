package typings.yup

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMinDate extends js.Object {
  var min: Date | String
}

object AnonMinDate {
  @scala.inline
  def apply(min: Date | String): AnonMinDate = {
    val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMinDate]
  }
}

