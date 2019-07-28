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
    if (!js.isUndefined(backdrop)) __obj.updateDynamic("backdrop")(backdrop)
    if (broken != null) __obj.updateDynamic("broken")(js.Any.fromFunction0(broken))
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(fade)) __obj.updateDynamic("fade")(fade)
    if (height != null) __obj.updateDynamic("height")(height)
    if (hidden != null) __obj.updateDynamic("hidden")(js.Any.fromFunction0(hidden))
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (iframe != null) __obj.updateDynamic("iframe")(iframe)
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard)
    if (loaded != null) __obj.updateDynamic("loaded")(js.Any.fromFunction0(loaded))
    if (loadingIcon != null) __obj.updateDynamic("loadingIcon")(loadingIcon)
    if (!js.isUndefined(moveable)) __obj.updateDynamic("moveable")(moveable)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction0(onHide))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (postion != null) __obj.updateDynamic("postion")(postion)
    if (!js.isUndefined(rememberPos)) __obj.updateDynamic("rememberPos")(rememberPos)
    if (remote != null) __obj.updateDynamic("remote")(remote)
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction0(show))
    if (!js.isUndefined(showHeader)) __obj.updateDynamic("showHeader")(showHeader)
    if (size != null) __obj.updateDynamic("size")(size)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    if (waittime != null) __obj.updateDynamic("waittime")(waittime.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ModalTriggerOption]
  }
}

