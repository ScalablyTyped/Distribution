package typings.yup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait More extends js.Object {
  var more: Double
}

object More {
  @scala.inline
  def apply(more: Double): More = {
    val __obj = js.Dynamic.literal(more = more.asInstanceOf[js.Any])
    __obj.asInstanceOf[More]
  }
}

