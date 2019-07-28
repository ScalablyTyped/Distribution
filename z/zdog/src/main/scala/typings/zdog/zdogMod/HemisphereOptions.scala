package typings.zdog.zdogMod

import typings.zdog.zdogNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HemisphereOptions extends EllipseOptions

object HemisphereOptions {
  @scala.inline
  def apply(
    addTo: Anchor = null,
    backface: Boolean | String = null,
    closed: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    diameter: Int | Double = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    front: VectorOptions = null,
    height: Int | Double = null,
    path: js.Array[PathCommand] = null,
    quarters: QuartersValue = null,
    rotate: VectorOptions = null,
    scale: VectorOptions | Double = null,
    stroke: Double | `false` = null,
    translate: VectorOptions = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): HemisphereOptions = {
    val __obj = js.Dynamic.literal()
    if (addTo != null) __obj.updateDynamic("addTo")(addTo)
    if (backface != null) __obj.updateDynamic("backface")(backface.asInstanceOf[js.Any])
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed)
    if (color != null) __obj.updateDynamic("color")(color)
    if (diameter != null) __obj.updateDynamic("diameter")(diameter.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (front != null) __obj.updateDynamic("front")(front)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (quarters != null) __obj.updateDynamic("quarters")(quarters)
    if (rotate != null) __obj.updateDynamic("rotate")(rotate)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[HemisphereOptions]
  }
}

