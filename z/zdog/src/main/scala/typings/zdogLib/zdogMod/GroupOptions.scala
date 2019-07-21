package typings
package zdogLib.zdogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupOptions extends AnchorOptions {
  /**
    * Updates the rendering order of the group’s child items.
    * @default false
    * @see {@link https://zzz.dog/api#group-updatesort Zdog API}
    */
  val updateSort: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Shows or hides group, including all child items in the group.
    * {@link Shape#visible} only shows or hides the item.
    * @default true
    * @see {@link https://zzz.dog/api#group-visible Zdog API}
    */
  val visible: js.UndefOr[scala.Boolean] = js.undefined
}

object GroupOptions {
  @scala.inline
  def apply(
    addTo: Anchor = null,
    rotate: VectorOptions = null,
    scale: VectorOptions | scala.Double = null,
    translate: VectorOptions = null,
    updateSort: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): GroupOptions = {
    val __obj = js.Dynamic.literal()
    if (addTo != null) __obj.updateDynamic("addTo")(addTo)
    if (rotate != null) __obj.updateDynamic("rotate")(rotate)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate)
    if (!js.isUndefined(updateSort)) __obj.updateDynamic("updateSort")(updateSort)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[GroupOptions]
  }
}

