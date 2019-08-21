package typings.yup

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Regex extends js.Object {
  var regex: RegExp
}

object Anon_Regex {
  @scala.inline
  def apply(regex: RegExp): Anon_Regex = {
    val __obj = js.Dynamic.literal(regex = regex)
  
    __obj.asInstanceOf[Anon_Regex]
  }
}

