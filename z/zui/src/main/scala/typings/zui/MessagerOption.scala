package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagerOption extends js.Object {
  var actions: js.UndefOr[js.Array[Action]] = js.undefined
  var close: js.UndefOr[Boolean] = js.undefined
  var contentClass: js.UndefOr[String] = js.undefined
  var cssClass: js.UndefOr[String] = js.undefined
  var fade: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var onAction: js.UndefOr[OnActionFunc] = js.undefined
  var parent: js.UndefOr[String] = js.undefined
  var placement: js.UndefOr[String] = js.undefined
  var scale: js.UndefOr[Boolean] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var time: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[MessagerTypeEnum | String] = js.undefined
}

object MessagerOption {
  @scala.inline
  def apply(
    actions: js.Array[Action] = null,
    close: js.UndefOr[Boolean] = js.undefined,
    contentClass: String = null,
    cssClass: String = null,
    fade: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    message: String = null,
    onAction: (/* name */ String, /* action */ String, /* messager */ Messager) => js.Any = null,
    parent: String = null,
    placement: String = null,
    scale: js.UndefOr[Boolean] = js.undefined,
    show: js.UndefOr[Boolean] = js.undefined,
    time: js.UndefOr[Double] = js.undefined,
    `type`: MessagerTypeEnum | String = null
  ): MessagerOption = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (!js.isUndefined(close)) __obj.updateDynamic("close")(close.get.asInstanceOf[js.Any])
    if (contentClass != null) __obj.updateDynamic("contentClass")(contentClass.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (!js.isUndefined(fade)) __obj.updateDynamic("fade")(fade.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (onAction != null) __obj.updateDynamic("onAction")(js.Any.fromFunction3(onAction))
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    if (!js.isUndefined(time)) __obj.updateDynamic("time")(time.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagerOption]
  }
}

