package typings.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBar extends js.Object {
  var bar: js.UndefOr[AnonAlphaBackgroundcolorBorderbottom] = js.undefined
  var handle: js.UndefOr[AnonAlphaBackgroundcolorBorderbottom] = js.undefined
}

object AnonBar {
  @scala.inline
  def apply(
    bar: AnonAlphaBackgroundcolorBorderbottom = null,
    handle: AnonAlphaBackgroundcolorBorderbottom = null
  ): AnonBar = {
    val __obj = js.Dynamic.literal()
    if (bar != null) __obj.updateDynamic("bar")(bar.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBar]
  }
}

