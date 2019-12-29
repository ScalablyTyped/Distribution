package typings.zdog.zdogMod

import typings.zdog.zdogBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CylinderOptions extends ShapeOptions {
  /** @default 1 */
  val diameter: js.UndefOr[Double] = js.undefined
  val frontFace: js.UndefOr[Boolean | String] = js.undefined
  /** @default 1 */
  val length: js.UndefOr[Double] = js.undefined
}

object CylinderOptions {
  @scala.inline
  def apply(
    addTo: Anchor = null,
    backface: Boolean | String = null,
    closed: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    diameter: Int | Double = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    front: VectorOptions = null,
    frontFace: Boolean | String = null,
    length: Int | Double = null,
    path: js.Array[PathCommand] = null,
    rotate: VectorOptions = null,
    scale: VectorOptions | Double = null,
    stroke: Double | `false` = null,
    translate: VectorOptions = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): CylinderOptions = {
    val __obj = js.Dynamic.literal()
    if (addTo != null) __obj.updateDynamic("addTo")(addTo.asInstanceOf[js.Any])
    if (backface != null) __obj.updateDynamic("backface")(backface.asInstanceOf[js.Any])
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (diameter != null) __obj.updateDynamic("diameter")(diameter.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (front != null) __obj.updateDynamic("front")(front.asInstanceOf[js.Any])
    if (frontFace != null) __obj.updateDynamic("frontFace")(frontFace.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[CylinderOptions]
  }
}

