package typings.zfont.mod.zdogAugmentingMod

import typings.zdog.mod.Anchor
import typings.zdog.mod.PathCommand
import typings.zdog.mod.ShapeOptions
import typings.zdog.mod.VectorOptions
import typings.zdog.zdogBooleans.`false`
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
  def apply[/* <: typings.zfont.mod.zdogAugmentingMod.MultilineText */ T](
    font: Font,
    addTo: Anchor = null,
    backface: Boolean | String = null,
    closed: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    fontSize: js.UndefOr[Double] = js.undefined,
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
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any])
    if (addTo != null) __obj.updateDynamic("addTo")(addTo.asInstanceOf[js.Any])
    if (backface != null) __obj.updateDynamic("backface")(backface.asInstanceOf[js.Any])
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.get.asInstanceOf[js.Any])
    if (front != null) __obj.updateDynamic("front")(front.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textBaseline != null) __obj.updateDynamic("textBaseline")(textBaseline.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextOptions[T]]
  }
}

