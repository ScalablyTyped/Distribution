package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * modal trigger
  */
trait ModalTriggerOption extends js.Object {
  var backdrop: js.UndefOr[Boolean] = js.undefined
  var broken: js.UndefOr[js.Function0[_]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var fade: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[String] = js.undefined
  var hidden: js.UndefOr[js.Function0[_]] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var iframe: js.UndefOr[String] = js.undefined
  var keyboard: js.UndefOr[Boolean] = js.undefined
  var loaded: js.UndefOr[js.Function0[_]] = js.undefined
  var loadingIcon: js.UndefOr[String] = js.undefined
  var moveable: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onHide: js.UndefOr[js.Function0[_]] = js.undefined
  var onShow: js.UndefOr[js.Function0[_]] = js.undefined
  var postion: js.UndefOr[String] = js.undefined
  var rememberPos: js.UndefOr[Boolean] = js.undefined
  var remote: js.UndefOr[String] = js.undefined
  var show: js.UndefOr[js.Function0[_]] = js.undefined
  var showHeader: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var waittime: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object ModalTriggerOption {
  @scala.inline
  def apply(
    backdrop: js.UndefOr[Boolean] = js.undefined,
    broken: () => _ = null,
    className: String = null,
    fade: js.UndefOr[Boolean] = js.undefined,
    height: String = null,
    hidden: () => _ = null,
    icon: String = null,
    iframe: String = null,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    loaded: () => _ = null,
    loadingIcon: String = null,
    moveable: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onHide: () => _ = null,
    onShow: () => _ = null,
    postion: String = null,
    rememberPos: js.UndefOr[Boolean] = js.undefined,
    remote: String = null,
    show: () => _ = null,
    showHeader: js.UndefOr[Boolean] = js.undefined,
    size: String = null,
    title: String = null,
    `type`: String = null,
    url: String = null,
    waittime: Int | Double = null,
    width: String = null
  ): ModalTriggerOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(backdrop)) __obj.updateDynamic("backdrop")(backdrop.asInstanceOf[js.Any])
    if (broken != null) __obj.updateDynamic("broken")(js.Any.fromFunction0(broken))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(fade)) __obj.updateDynamic("fade")(fade.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hidden != null) __obj.updateDynamic("hidden")(js.Any.fromFunction0(hidden))
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iframe != null) __obj.updateDynamic("iframe")(iframe.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (loaded != null) __obj.updateDynamic("loaded")(js.Any.fromFunction0(loaded))
    if (loadingIcon != null) __obj.updateDynamic("loadingIcon")(loadingIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(moveable)) __obj.updateDynamic("moveable")(moveable.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction0(onHide))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (postion != null) __obj.updateDynamic("postion")(postion.asInstanceOf[js.Any])
    if (!js.isUndefined(rememberPos)) __obj.updateDynamic("rememberPos")(rememberPos.asInstanceOf[js.Any])
    if (remote != null) __obj.updateDynamic("remote")(remote.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction0(show))
    if (!js.isUndefined(showHeader)) __obj.updateDynamic("showHeader")(showHeader.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (waittime != null) __obj.updateDynamic("waittime")(waittime.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalTriggerOption]
  }
}

