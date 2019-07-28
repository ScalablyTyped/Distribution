package typings.zdog.zdogMod

import typings.zdog.zdogNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolygonOptions extends ShapeOptions {
  /** @default 0.5 */
  val radius: js.UndefOr[Double] = js.undefined
  /** @default 3 */
  val sides: js.UndefOr[Double] = js.undefined
}

object PolygonOptions {
  @scala.inline
  def apply(
    addTo: Anchor = null,
    backface: Boolean | String = null,
    closed: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    front: VectorOptions = null,
    path: js.Array[PathCommand] = null,
    radius: Int | Double = null,
    rotate: VectorOptions = null,
    scale: VectorOptions | Double = null,
    sides: Int | Double = null,
    stroke: Double | `false` = null,
    translate: VectorOptions = null,
    visible: js.UndefOr[Boolean] = js.undefined
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

