package typings
package zdogLib.zdogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeOptions extends AnchorOptions {
  /**
    * Shows or hides the shape when its backface is visible.
    * @default true
    * @see {@link https://zzz.dog/api#shape-backface Zdog API}
    */
  val backface: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
    * Closes the path from the last point back to the first.
    * @default true
    * @see {@link https://zzz.dog/api#shape-closed Zdog API}
    * @see {@link https://zzz.dog/shapes#shape-closed Zdog Shapes API}
    */
  val closed: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets shape stroke and fill color.
    * Set to any color string — hex code, `rgb()`, `hsla()`, etc.
    * @default '#333'
    * @see {@link https://zzz.dog/api#shape-color Zdog API}
    */
  val color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Renders the inner shape area.
    * @default false
    * @see {@link https://zzz.dog/api#shape-fill Zdog API}
    */
  val fill: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A {@link Vector} used to determine where the front of the shape is.
    * Useful for changing how {@link backface} works for custom `Shape`s.
    * @default {z: 1}
    * @see {@link https://zzz.dog/api#shape-front Zdog API}
    */
  val front: js.UndefOr[VectorOptions] = js.undefined
  /**
    * Defines the shape.
    * @see {@link https://zzz.dog/shapes#shape-path Zdog Shape API}
    */
  val path: js.UndefOr[js.Array[PathCommand]] = js.undefined
  /**
    * Renders the shape line and sets line width.
    * Set to `0` or `false` to disable.
    * @default 1
    * @see {@link https://zzz.dog/api#shape-stroke Zdog API}
    */
  val stroke: js.UndefOr[scala.Double | zdogLib.zdogLibNumbers.`false`] = js.undefined
  /**
    * Shows or hides shape. Does not affect child items.
    * @default true
    * @see {@link https://zzz.dog/api#shape-visible Zdog API}
    */
  val visible: js.UndefOr[scala.Boolean] = js.undefined
}

object ShapeOptions {
  @scala.inline
  def apply(
    addTo: Anchor = null,
    backface: scala.Boolean | java.lang.String = null,
    closed: js.UndefOr[scala.Boolean] = js.undefined,
    color: java.lang.String = null,
    fill: js.UndefOr[scala.Boolean] = js.undefined,
    front: VectorOptions = null,
    path: js.Array[PathCommand] = null,
    rotate: VectorOptions = null,
    scale: VectorOptions | scala.Double = null,
    stroke: scala.Double | zdogLib.zdogLibNumbers.`false` = null,
    translate: VectorOptions = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): ShapeOptions = {
    val __obj = js.Dynamic.literal()
    if (addTo != null) __obj.updateDynamic("addTo")(addTo)
    if (backface != null) __obj.updateDynamic("backface")(backface.asInstanceOf[js.Any])
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (front != null) __obj.updateDynamic("front")(front)
    if (path != null) __obj.updateDynamic("path")(path)
    if (rotate != null) __obj.updateDynamic("rotate")(rotate)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ShapeOptions]
  }
}

