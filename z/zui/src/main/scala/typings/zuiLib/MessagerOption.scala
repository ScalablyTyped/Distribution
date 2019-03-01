package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagerOption extends js.Object {
  var actions: js.UndefOr[js.Array[Action]] = js.undefined
  var close: js.UndefOr[scala.Boolean] = js.undefined
  var contentClass: js.UndefOr[java.lang.String] = js.undefined
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  var fade: js.UndefOr[scala.Boolean] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var onAction: js.UndefOr[OnActionFunc] = js.undefined
  var parent: js.UndefOr[java.lang.String] = js.undefined
  var placement: js.UndefOr[java.lang.String] = js.undefined
  var scale: js.UndefOr[scala.Boolean] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
  var time: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[MessagerTypeEnum | java.lang.String] = js.undefined
}

object MessagerOption {
  @scala.inline
  def apply(
    actions: js.Array[Action] = null,
    close: js.UndefOr[scala.Boolean] = js.undefined,
    contentClass: java.lang.String = null,
    cssClass: java.lang.String = null,
    fade: js.UndefOr[scala.Boolean] = js.undefined,
    icon: java.lang.String = null,
    message: java.lang.String = null,
    onAction: OnActionFunc = null,
    parent: java.lang.String = null,
    placement: java.lang.String = null,
    scale: js.UndefOr[scala.Boolean] = js.undefined,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    time: scala.Int | scala.Double = null,
    `type`: MessagerTypeEnum | java.lang.String = null
  ): MessagerOption = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (!js.isUndefined(close)) __obj.updateDynamic("close")(close)
    if (contentClass != null) __obj.updateDynamic("contentClass")(contentClass)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (!js.isUndefined(fade)) __obj.updateDynamic("fade")(fade)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (message != null) __obj.updateDynamic("message")(message)
    if (onAction != null) __obj.updateDynamic("onAction")(onAction)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagerOption]
  }
}

