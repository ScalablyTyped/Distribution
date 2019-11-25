package typings.zdog.zdogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupOptions extends AnchorOptions {
  /**
    * Updates the rendering order of the group’s child items.
    * @default false
    * @see {@link https://zzz.dog/api#group-updatesort Zdog API}
    */
  val updateSort: js.UndefOr[Boolean] = js.undefined
  /**
    * Shows or hides group, including all child items in the group.
    * {@link Shape#visible} only shows or hides the item.
    * @default true
    * @see {@link https://zzz.dog/api#group-visible Zdog API}
    */
  val visible: js.UndefOr[Boolean] = js.undefined
}

object GroupOptions {
  @scala.inline
  def apply(
    addTo: Anchor = null,
    rotate: VectorOptions = null,
    scale: VectorOptions | Double = null,
    translate: VectorOptions = null,
    updateSort: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): GroupOptions = {
    val __obj = js.Dynamic.literal()
    if (addTo != null) __obj.updateDynamic("addTo")(addTo.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (!js.isUndefined(updateSort)) __obj.updateDynamic("updateSort")(updateSort.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupOptions]
  }
}

