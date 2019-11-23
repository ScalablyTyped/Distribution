package typings.zfont.zfontMod.zdogMod

import typings.zdog.zdogMod.Anchor
import typings.zdog.zdogMod.PathCommand
import typings.zdog.zdogMod.ShapeOptions
import typings.zdog.zdogMod.VectorOptions
import typings.zdog.zdogNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link Text}
  * @see {@link https://github.com/jaames/zfont#options-1 Zfont API}
  */
trait TextOptions[T /* <: MultilineText */] extends ShapeOptions {
  /** @see {@link Text#font} */
  val font: Font
  /**
    * Measured in pixels.
    * @default 64
    * @see {@link Text#fontSize}
    */
  val fontSize: js.UndefOr[Double] = js.undefined
  /**
    * @default 'left'
    * @see {@link Text#textAlign}
    */
  val textAlign: js.UndefOr[TextAlign] = js.undefined
  /**
    * @default 'bottom'
    * @see {@link Text#textBaseline}
    */
  val textBaseline: js.UndefOr[TextBaseline] = js.undefined
  /**
    * @default ''
    * @see {@link Text#value}
    */
  val value: js.UndefOr[T] = js.undefined
}

object TextOptions {
  @scala.inline
  def apply[T /* <: MultilineText */](
    font: Font,
    addTo: Anchor = null,
    backface: Boolean | String = null,
    closed: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    fontSize: Int | Double = null,
    front: VectorOptions = null,
    path: js.Array[PathCommand] = null,
    rotate: VectorOptions = null,
    scale: VectorOptions | Double = null,
    stroke: Double | `false` = null,
    textAlign: TextAlign = null,
    textBaseline: TextBaseline = null,
    translate: VectorOptions = null,
    value: T = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): TextOptions[T] = {
    val __obj = js.Dynamic.literal(font = font)
    if (addTo != null) __obj.updateDynamic("addTo")(addTo)
    if (backface != null) __obj.updateDynamic("backface")(backface.asInstanceOf[js.Any])
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (front != null) __obj.updateDynamic("front")(front)
    if (path != null) __obj.updateDynamic("path")(path)
    if (rotate != null) __obj.updateDynamic("rotate")(rotate)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign)
    if (textBaseline != null) __obj.updateDynamic("textBaseline")(textBaseline)
    if (translate != null) __obj.updateDynamic("translate")(translate)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[TextOptions[T]]
  }
}

