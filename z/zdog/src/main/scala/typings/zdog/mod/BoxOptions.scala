package typings.zdog.mod

import typings.zdog.zdogBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxOptions extends RectOptions {
  /** @default true */
  val bottomFace: js.UndefOr[Boolean | String] = js.undefined
  /** @default 1 */
  val depth: js.UndefOr[Double] = js.undefined
  /** @default true */
  val frontFace: js.UndefOr[Boolean | String] = js.undefined
  /** @default true */
  val leftFace: js.UndefOr[Boolean | String] = js.undefined
  /** @default true */
  val rearFace: js.UndefOr[Boolean | String] = js.undefined
  /** @default true */
  val rightFace: js.UndefOr[Boolean | String] = js.undefined
  /** @default true */
  val topFace: js.UndefOr[Boolean | String] = js.undefined
}

object BoxOptions {
  @scala.inline
  def apply(
    addTo: Anchor = null,
    backface: Boolean | String = null,
    bottomFace: Boolean | String = null,
    closed: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    depth: js.UndefOr[Double] = js.undefined,
    fill: js.UndefOr[Boolean] = js.undefined,
    front: VectorOptions = null,
    frontFace: Boolean | String = null,
    height: js.UndefOr[Double] = js.undefined,
    leftFace: Boolean | String = null,
    path: js.Array[PathCommand] = null,
    rearFace: Boolean | String = null,
    rightFace: Boolean | String = null,
    rotate: VectorOptions = null,
    scale: VectorOptions | Double = null,
    stroke: Double | `false` = null,
    topFace: Boolean | String = null,
    translate: VectorOptions = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): BoxOptions = {
    val __obj = js.Dynamic.literal()
    if (addTo != null) __obj.updateDynamic("addTo")(addTo.asInstanceOf[js.Any])
    if (backface != null) __obj.updateDynamic("backface")(backface.asInstanceOf[js.Any])
    if (bottomFace != null) __obj.updateDynamic("bottomFace")(bottomFace.asInstanceOf[js.Any])
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.get.asInstanceOf[js.Any])
    if (front != null) __obj.updateDynamic("front")(front.asInstanceOf[js.Any])
    if (frontFace != null) __obj.updateDynamic("frontFace")(frontFace.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (leftFace != null) __obj.updateDynamic("leftFace")(leftFace.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (rearFace != null) __obj.updateDynamic("rearFace")(rearFace.asInstanceOf[js.Any])
    if (rightFace != null) __obj.updateDynamic("rightFace")(rightFace.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (topFace != null) __obj.updateDynamic("topFace")(topFace.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxOptions]
  }
}

