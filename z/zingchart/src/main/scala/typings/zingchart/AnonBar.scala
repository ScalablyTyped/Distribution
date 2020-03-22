package typings.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBar extends js.Object {
  var bar: js.UndefOr[AnonBorderradius] = js.undefined
  var handle: js.UndefOr[AnonBorderradius] = js.undefined
}

object AnonBar {
  @scala.inline
  def apply(bar: AnonBorderradius = null, handle: AnonBorderradius = null): AnonBar = {
    val __obj = js.Dynamic.literal()
    if (bar != null) __obj.updateDynamic("bar")(bar.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBar]
  }
}

