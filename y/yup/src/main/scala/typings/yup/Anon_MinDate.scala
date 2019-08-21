package typings.yup

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MinDate extends js.Object {
  var min: Date | String
}

object Anon_MinDate {
  @scala.inline
  def apply(min: Date | String): Anon_MinDate = {
    val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_MinDate]
  }
}

