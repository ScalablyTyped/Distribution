package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * modal trigger
  */
trait ModalTriggerOption extends js.Object {
  var backdrop: js.UndefOr[scala.Boolean] = js.undefined
  var broken: js.UndefOr[js.Function0[_]] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var fade: js.UndefOr[scala.Boolean] = js.undefined
  var height: js.UndefOr[java.lang.String] = js.undefined
  var hidden: js.UndefOr[js.Function0[_]] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var iframe: js.UndefOr[java.lang.String] = js.undefined
  var keyboard: js.UndefOr[scala.Boolean] = js.undefined
  var loaded: js.UndefOr[js.Function0[_]] = js.undefined
  var loadingIcon: js.UndefOr[java.lang.String] = js.undefined
  var moveable: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onHide: js.UndefOr[js.Function0[_]] = js.undefined
  var onShow: js.UndefOr[js.Function0[_]] = js.undefined
  var postion: js.UndefOr[java.lang.String] = js.undefined
  var rememberPos: js.UndefOr[scala.Boolean] = js.undefined
  var remote: js.UndefOr[java.lang.String] = js.undefined
  var show: js.UndefOr[js.Function0[_]] = js.undefined
  var showHeader: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var waittime: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object ModalTriggerOption {
  @scala.inline
  def apply(
    backdrop: js.UndefOr[scala.Boolean] = js.undefined,
    broken: js.Function0[_] = null,
    className: java.lang.String = null,
    fade: js.UndefOr[scala.Boolean] = js.undefined,
    height: java.lang.String = null,
    hidden: js.Function0[_] = null,
    icon: java.lang.String = null,
    iframe: java.lang.String = null,
    keyboard: js.UndefOr[scala.Boolean] = js.undefined,
    loaded: js.Function0[_] = null,
    loadingIcon: java.lang.String = null,
    moveable: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    onHide: js.Function0[_] = null,
    onShow: js.Function0[_] = null,
    postion: java.lang.String = null,
    rememberPos: js.UndefOr[scala.Boolean] = js.undefined,
    remote: java.lang.String = null,
    show: js.Function0[_] = null,
    showHeader: js.UndefOr[scala.Boolean] = js.undefined,
    size: java.lang.String = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null,
    url: java.lang.String = null,
    waittime: scala.Int | scala.Double = null,
    width: java.lang.String = null
  ): ModalTriggerOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(backdrop)) __obj.updateDynamic("backdrop")(backdrop)
    if (broken != null) __obj.updateDynamic("broken")(broken)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(fade)) __obj.updateDynamic("fade")(fade)
    if (height != null) __obj.updateDynamic("height")(height)
    if (hidden != null) __obj.updateDynamic("hidden")(hidden)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (iframe != null) __obj.updateDynamic("iframe")(iframe)
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard)
    if (loaded != null) __obj.updateDynamic("loaded")(loaded)
    if (loadingIcon != null) __obj.updateDynamic("loadingIcon")(loadingIcon)
    if (!js.isUndefined(moveable)) __obj.updateDynamic("moveable")(moveable)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onHide != null) __obj.updateDynamic("onHide")(onHide)
    if (onShow != null) __obj.updateDynamic("onShow")(onShow)
    if (postion != null) __obj.updateDynamic("postion")(postion)
    if (!js.isUndefined(rememberPos)) __obj.updateDynamic("rememberPos")(rememberPos)
    if (remote != null) __obj.updateDynamic("remote")(remote)
    if (show != null) __obj.updateDynamic("show")(show)
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

