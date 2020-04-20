package typings.yup

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1 extends js.Object {
  var max: Date | String
}

object Anon1 {
  @scala.inline
  def apply(max: Date | String): Anon1 = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon1]
  }
}

