package typings.zdog.zdogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnchorOptions extends js.Object {
  /**
    * Adds item to parent item.
    * Shapes can be added as children to other shapes.
    * A child shape is positioned relative to its parent.
    * @see {@link https://zzz.dog/api#anchor-addto Zdog API}
    */
  val addTo: js.UndefOr[Anchor] = js.undefined
  /**
    * Rotates the item.
    * Set to rotate the item around the corresponding axis.
    * @see {@link https://zzz.dog/api#anchor-rotate Zdog API}
    */
  val rotate: js.UndefOr[VectorOptions] = js.undefined
  /**
    * Enlarges or shrinks item geometry. `scale` does not scale `stroke`.
    * @see {@link https://zzz.dog/api#anchor-scale Zdog API}
    */
  val scale: js.UndefOr[VectorOptions | Double] = js.undefined
  /**
    * Positions the item.
    * @see {@link https://zzz.dog/api#anchor-translate Zdog API}
    */
  val translate: js.UndefOr[VectorOptions] = js.undefined
}

object AnchorOptions {
  @scala.inline
  def apply(
    addTo: Anchor = null,
    rotate: VectorOptions = null,
    scale: VectorOptions | Double = null,
    translate: VectorOptions = null
  ): AnchorOptions = {
    val __obj = js.Dynamic.literal()
    if (addTo != null) __obj.updateDynamic("addTo")(addTo)
    if (rotate != null) __obj.updateDynamic("rotate")(rotate)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate)
    __obj.asInstanceOf[AnchorOptions]
  }
}

