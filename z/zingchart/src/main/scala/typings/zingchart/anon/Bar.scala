package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bar extends js.Object {
  var bar: js.UndefOr[Borderradius] = js.undefined
  var handle: js.UndefOr[Borderradius] = js.undefined
}

object Bar {
  @scala.inline
  def apply(bar: Borderradius = null, handle: Borderradius = null): Bar = {
    val __obj = js.Dynamic.literal()
    if (bar != null) __obj.updateDynamic("bar")(bar.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bar]
  }
}

