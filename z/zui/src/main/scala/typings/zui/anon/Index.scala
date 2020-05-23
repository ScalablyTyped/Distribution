package typings.zui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index extends js.Object {
  var index: Double
  var sortUp: Boolean
}

object Index {
  @scala.inline
  def apply(index: Double, sortUp: Boolean): Index = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], sortUp = sortUp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
}

