package typings.zrender

import typings.zrender.zrender.ColorStops
import typings.zrender.zrender.GlobalCoords
import typings.zrender.zrender.X
import typings.zrender.zrender.X2
import typings.zrender.zrender.Y
import typings.zrender.zrender.Y2
import typings.zrender.zrenderStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddColorStop extends js.Object {
  var colorStops: ColorStops
  var globalCoord: GlobalCoords
  var `type`: linear
  var x: X
  var x2: X2
  var y: Y
  var y2: Y2
  def addColorStop(offset: Double, color: String): Unit
}

object AnonAddColorStop {
  @scala.inline
  def apply(
    addColorStop: (Double, String) => Unit,
    colorStops: ColorStops,
    globalCoord: GlobalCoords,
    `type`: linear,
    x: X,
    x2: X2,
    y: Y,
    y2: Y2
  ): AnonAddColorStop = {
    val __obj = js.Dynamic.literal(addColorStop = js.Any.fromFunction2(addColorStop), colorStops = colorStops.asInstanceOf[js.Any], globalCoord = globalCoord.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddColorStop]
  }
}

