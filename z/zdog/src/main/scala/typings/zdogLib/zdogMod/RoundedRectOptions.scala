package typings
package zdogLib.zdogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoundedRectOptions extends ShapeOptions {
  /** @default 0.25 */
  val cornerRadius: js.UndefOr[scala.Double] = js.undefined
  /** @default 1 */
  val height: js.UndefOr[scala.Double] = js.undefined
  /** @default 1 */
  val width: js.UndefOr[scala.Double] = js.undefined
}

object RoundedRectOptions {
  @scala.inline
  def apply(
    addTo: Anchor = null,
    backface: scala.Boolean | java.lang.String = null,
    closed: js.UndefOr[scala.Boolean] = js.undefined,
    color: java.lang.String = null,
    cornerRadius: scala.Int | scala.Double = null,
    fill: js.UndefOr[scala.Boolean] = js.undefined,
    front: VectorOptions = null,
    height: scala.Int | scala.Double = null,
    path: js.Array[PathCommand] = null,
    rotate: VectorOptions = null,
    scale: VectorOptions | scala.Double = null,
    stroke: scala.Double | zdogLib.zdogLibNumbers.`false` = null,
    translate: VectorOptions = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): RoundedRectOptions = {
    val __obj = js.Dynamic.literal()
    if (addTo != null) __obj.updateDynamic("addTo")(addTo)
    if (backface != null) __obj.updateDynamic("backface")(backface.asInstanceOf[js.Any])
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed)
    if (color != null) __obj.updateDynamic("color")(color)
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (front != null) __obj.updateDynamic("front")(front)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (rotate != null) __obj.updateDynamic("rotate")(rotate)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoundedRectOptions]
  }
}

