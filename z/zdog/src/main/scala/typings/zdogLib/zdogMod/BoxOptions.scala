package typings
package zdogLib.zdogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxOptions extends RectOptions {
  /** @default true */
  val bottomFace: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /** @default 1 */
  val depth: js.UndefOr[scala.Double] = js.undefined
  /** @default true */
  val frontFace: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /** @default true */
  val leftFace: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /** @default true */
  val rearFace: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /** @default true */
  val rightFace: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /** @default true */
  val topFace: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
}

object BoxOptions {
  @scala.inline
  def apply(
    addTo: Anchor = null,
    backface: scala.Boolean | java.lang.String = null,
    bottomFace: scala.Boolean | java.lang.String = null,
    closed: js.UndefOr[scala.Boolean] = js.undefined,
    color: java.lang.String = null,
    depth: scala.Int | scala.Double = null,
    fill: js.UndefOr[scala.Boolean] = js.undefined,
    front: VectorOptions = null,
    frontFace: scala.Boolean | java.lang.String = null,
    height: scala.Int | scala.Double = null,
    leftFace: scala.Boolean | java.lang.String = null,
    path: js.Array[PathCommand] = null,
    rearFace: scala.Boolean | java.lang.String = null,
    rightFace: scala.Boolean | java.lang.String = null,
    rotate: VectorOptions = null,
    scale: VectorOptions | scala.Double = null,
    stroke: scala.Double | zdogLib.zdogLibNumbers.`false` = null,
    topFace: scala.Boolean | java.lang.String = null,
    translate: VectorOptions = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): BoxOptions = {
    val __obj = js.Dynamic.literal()
    if (addTo != null) __obj.updateDynamic("addTo")(addTo)
    if (backface != null) __obj.updateDynamic("backface")(backface.asInstanceOf[js.Any])
    if (bottomFace != null) __obj.updateDynamic("bottomFace")(bottomFace.asInstanceOf[js.Any])
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed)
    if (color != null) __obj.updateDynamic("color")(color)
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (front != null) __obj.updateDynamic("front")(front)
    if (frontFace != null) __obj.updateDynamic("frontFace")(frontFace.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (leftFace != null) __obj.updateDynamic("leftFace")(leftFace.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (rearFace != null) __obj.updateDynamic("rearFace")(rearFace.asInstanceOf[js.Any])
    if (rightFace != null) __obj.updateDynamic("rightFace")(rightFace.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (topFace != null) __obj.updateDynamic("topFace")(topFace.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxOptions]
  }
}

