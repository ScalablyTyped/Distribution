package typings.yup

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRegex extends js.Object {
  var regex: RegExp
}

object AnonRegex {
  @scala.inline
  def apply(regex: RegExp): AnonRegex = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRegex]
  }
}

