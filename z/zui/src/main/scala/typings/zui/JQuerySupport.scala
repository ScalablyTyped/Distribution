package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuerySupport extends js.Object {
  var transition: Boolean | TransitionEventNames
}

object JQuerySupport {
  @scala.inline
  def apply(transition: Boolean | TransitionEventNames): JQuerySupport = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuerySupport]
  }
}

