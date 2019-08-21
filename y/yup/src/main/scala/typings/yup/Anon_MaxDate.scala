package typings.yup

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxDate extends js.Object {
  var max: Date | String
}

object Anon_MaxDate {
  @scala.inline
  def apply(max: Date | String): Anon_MaxDate = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_MaxDate]
  }
}

