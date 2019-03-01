package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuerySupport extends js.Object {
  var transition: scala.Boolean | TransitionEventNames
}

object JQuerySupport {
  @scala.inline
  def apply(transition: scala.Boolean | TransitionEventNames): JQuerySupport = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuerySupport]
  }
}

