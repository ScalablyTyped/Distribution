package typings
package zdogLib.zdogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolygonOptions extends ShapeOptions {
  /** @default 0.5 */
  val radius: js.UndefOr[scala.Double] = js.undefined
  /** @default 3 */
  val sides: js.UndefOr[scala.Double] = js.undefined
}

object PolygonOptions {
  @scala.inline
  def apply(
    addTo: Anchor = null,
    backface: scala.Boolean | java.lang.String = null,
    closed: js.UndefOr[scala.Boolean] = js.undefined,
    color: java.lang.String = null,
    fill: js.UndefOr[scala.Boolean] = js.undefined,
    front: VectorOptions = null,
    path: js.Array[PathCommand] = null,
    radius: scala.Int | scala.Double = null,
    rotate: VectorOptions = null,
    scale: VectorOptions | scala.Double = null,
    sides: scala.Int | scala.Double = null,
    stroke: scala.Double | zdogLib.zdogLibNumbers.`false` = null,
    translate: VectorOptions = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): PolygonOptions = {
    val __obj = js.Dynamic.literal()
    if (addTo != null) __obj.updateDynamic("addTo")(addTo)
    if (backface != null) __obj.updateDynamic("backface")(backface.asInstanceOf[js.Any])
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (front != null) __obj.updateDynamic("front")(front)
    if (path != null) __obj.updateDynamic("path")(path)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (sides != null) __obj.updateDynamic("sides")(sides.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[PolygonOptions]
  }
}

