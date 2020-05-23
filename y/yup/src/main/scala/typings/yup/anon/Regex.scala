package typings.yup.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Regex extends js.Object {
  var regex: RegExp
}

object Regex {
  @scala.inline
  def apply(regex: RegExp): Regex = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Regex]
  }
}

