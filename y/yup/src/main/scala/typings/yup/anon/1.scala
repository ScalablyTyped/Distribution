package typings.yup.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1` extends js.Object {
  var max: Date | String
}

object `1` {
  @scala.inline
  def apply(max: Date | String): `1` = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
}

