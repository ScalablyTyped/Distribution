package typings.zdog.zdogMod

import typings.zdog.zdogBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RectOptions extends ShapeOptions {
  /** @default 1 */
  val height: js.UndefOr[Double] = js.undefined
  /** @default 1 */
  val width: js.UndefOr[Double] = js.undefined
}

object RectOptions {
  @scala.inline
  def apply(
    addTo: Anchor = null,
    backface: Boolean | String = null,
    closed: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    front: VectorOptions = null,
    height: Int | Double = null,
    path: js.Array[PathCommand] = null,
    rotate: VectorOptions = null,
    scale: VectorOptions | Double = null,
    stroke: Double | `false` = null,
    translate: VectorOptions = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): RectOptions = {
    val __obj = js.Dynamic.literal()
    if (addTo != null) __obj.updateDynamic("addTo")(addTo.asInstanceOf[js.Any])
    if (backface != null) __obj.updateDynamic("backface")(backface.asInstanceOf[js.Any])
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (front != null) __obj.updateDynamic("front")(front.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectOptions]
  }
}

