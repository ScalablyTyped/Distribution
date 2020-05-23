package typings.yup.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0` extends js.Object {
  var min: Date | String
}

object `0` {
  @scala.inline
  def apply(min: Date | String): `0` = {
    val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
}

