package typings
package zrenderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddColorStop extends js.Object {
  var colorStops: zrenderLib.zrenderNs.ColorStops
  var globalCoord: zrenderLib.zrenderNs.GlobalCoords
  var `type`: zrenderLib.zrenderLibStrings.linear
  var x: zrenderLib.zrenderNs.X
  var x2: zrenderLib.zrenderNs.X2
  var y: zrenderLib.zrenderNs.Y
  var y2: zrenderLib.zrenderNs.Y2
  def addColorStop(offset: scala.Double, color: java.lang.String): scala.Unit
}

object Anon_AddColorStop {
  @scala.inline
  def apply(
    addColorStop: (scala.Double, java.lang.String) => scala.Unit,
    colorStops: zrenderLib.zrenderNs.ColorStops,
    globalCoord: zrenderLib.zrenderNs.GlobalCoords,
    `type`: zrenderLib.zrenderLibStrings.linear,
    x: zrenderLib.zrenderNs.X,
    x2: zrenderLib.zrenderNs.X2,
    y: zrenderLib.zrenderNs.Y,
    y2: zrenderLib.zrenderNs.Y2
  ): Anon_AddColorStop = {
    val __obj = js.Dynamic.literal(addColorStop = js.Any.fromFunction2(addColorStop), colorStops = colorStops, globalCoord = globalCoord, x = x, x2 = x2, y = y, y2 = y2)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_AddColorStop]
  }
}

