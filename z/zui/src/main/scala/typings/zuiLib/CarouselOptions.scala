package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselOptions extends js.Object {
  var interval: js.UndefOr[scala.Double] = js.undefined
  var keyboard: js.UndefOr[scala.Boolean] = js.undefined
  var pause: js.UndefOr[java.lang.String] = js.undefined
  var wrap: js.UndefOr[scala.Boolean] = js.undefined
}

object CarouselOptions {
  @scala.inline
  def apply(
    interval: scala.Int | scala.Double = null,
    keyboard: js.UndefOr[scala.Boolean] = js.undefined,
    pause: java.lang.String = null,
    wrap: js.UndefOr[scala.Boolean] = js.undefined
  ): CarouselOptions = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard)
    if (pause != null) __obj.updateDynamic("pause")(pause)
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[CarouselOptions]
  }
}

