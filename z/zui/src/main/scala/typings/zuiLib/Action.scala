package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  var action: js.UndefOr[ActionFunc] = js.undefined
  var html: js.UndefOr[java.lang.String] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object Action {
  @scala.inline
  def apply(
    action: ActionFunc = null,
    html: java.lang.String = null,
    icon: java.lang.String = null,
    name: java.lang.String = null,
    text: java.lang.String = null
  ): Action = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (html != null) __obj.updateDynamic("html")(html)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (name != null) __obj.updateDynamic("name")(name)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Action]
  }
}

