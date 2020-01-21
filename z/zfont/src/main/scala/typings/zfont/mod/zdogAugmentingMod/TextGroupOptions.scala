package typings.zfont.mod.zdogAugmentingMod

import typings.zdog.mod.Anchor
import typings.zdog.mod.GroupOptions
import typings.zdog.mod.VectorOptions
import typings.zfont.zfontBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link TextGroup}
  * @see {@link https://github.com/jaames/zfont#options-2 Zfont API}
  */
trait TextGroupOptions[T /* <: MultilineText */] extends GroupOptions {
  /**
    * @default '#333'
    * @see {@link TextGroup#color}
    */
  val color: js.UndefOr[String] = js.undefined
  /**
    * @default false
    * @see {@link TextGroup#fill}
    */
  val fill: js.UndefOr[Boolean] = js.undefined
  /** @see {@link TextGroup#font} */
  val font: Font
  /**
    * Measured in pixels.
    * @default 64
    * @see {@link TextGroup#fontSize}
    */
  val fontSize: js.UndefOr[Double] = js.undefined
  /**
    * @default 1
    * @see {@link TextGroup#stroke}
    */
  val stroke: js.UndefOr[Double | `false`] = js.undefined
  /**
    * @default 'left'
    * @see {@link TextGroup#textAlign}
    */
  val textAlign: js.UndefOr[TextAlign] = js.undefined
  /**
    * @default 'bottom'
    * @see {@link TextGroup#textBaseline}
    */
  val textBaseline: js.UndefOr[TextBaseline] = js.undefined
  /**
    * @default ''
    * @see {@link TextGroup#value}
    */
  val value: js.UndefOr[T] = js.undefined
}

object TextGroupOptions {
  @scala.inline
  def apply[T /* <: MultilineText */](
    font: Font,
    addTo: Anchor = null,
    color: String = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    fontSize: Int | Double = null,
    rotate: VectorOptions = null,
    scale: VectorOptions | Double = null,
    stroke: Double | `false` = null,
    textAlign: TextAlign = null,
    textBaseline: TextBaseline = null,
    translate: VectorOptions = null,
    updateSort: js.UndefOr[Boolean] = js.undefined,
    value: T = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): TextGroupOptions[T] = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any])
    if (addTo != null) __obj.updateDynamic("addTo")(addTo.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textBaseline != null) __obj.updateDynamic("textBaseline")(textBaseline.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (!js.isUndefined(updateSort)) __obj.updateDynamic("updateSort")(updateSort.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextGroupOptions[T]]
  }
}

