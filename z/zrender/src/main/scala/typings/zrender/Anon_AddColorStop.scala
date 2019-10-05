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

trait Anon_AddColorStop extends js.Object {
  var colorStops: ColorStops
  var globalCoord: GlobalCoords
  var `type`: linear
  var x: X
  var x2: X2
  var y: Y
  var y2: Y2
  def addColorStop(offset: Double, color: String): Unit
}

object Anon_AddColorStop {
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
  ): Anon_AddColorStop = {
    val __obj = js.Dynamic.literal(addColorStop = js.Any.fromFunction2(addColorStop), colorStops = colorStops, globalCoord = globalCoord, x = x, x2 = x2, y = y, y2 = y2)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_AddColorStop]
  }
}

