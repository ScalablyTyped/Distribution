package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselOptions extends js.Object {
  var interval: js.UndefOr[Double] = js.undefined
  var keyboard: js.UndefOr[Boolean] = js.undefined
  var pause: js.UndefOr[String] = js.undefined
  var wrap: js.UndefOr[Boolean] = js.undefined
}

object CarouselOptions {
  @scala.inline
  def apply(
    interval: js.UndefOr[Double] = js.undefined,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    pause: String = null,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): CarouselOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.get.asInstanceOf[js.Any])
    if (pause != null) __obj.updateDynamic("pause")(pause.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselOptions]
  }
}

