package typings.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGuide extends js.Object {
  /**
    * Allows you to set the format for your scale-v values. You can use a combination of text and tokens (%v represents the scale values
    * ), e.g., “%v°” or “Variable %v”. 'Value: %v'
    */
  var format: js.UndefOr[String] = js.undefined
  var guide: js.UndefOr[AnonBackgroundcolorItems] = js.undefined
  var item: js.UndefOr[AnonFontstyle] = js.undefined
  /**
    * Allows you to set custom labels for each step along scale-v. Note that if there are more steps than provided labels, the default v
    * alues will be used for the remaining labels. [...]
    */
  var labels: js.UndefOr[js.Any] = js.undefined
  var `ref-line`: js.UndefOr[AnonLinestyleLinewidth] = js.undefined
  var tick: js.UndefOr[AnonPlacement] = js.undefined
  var tooltip: js.UndefOr[AnonFontweight] = js.undefined
  /**
    * Used to set the minimum, maximum, and step scale values on scale-v. E.g., for “values”: “0:100:25”, 0 is the minimum, 100 is the m
    * aximum, and 25 is the step. "0:100:10" | [1,3,5,7] | ...
    */
  var values: js.UndefOr[js.Any] = js.undefined
  /**
    * Used to hide the v-axis. true | false
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AnonGuide {
  @scala.inline
  def apply(
    format: String = null,
    guide: AnonBackgroundcolorItems = null,
    item: AnonFontstyle = null,
    labels: js.Any = null,
    `ref-line`: AnonLinestyleLinewidth = null,
    tick: AnonPlacement = null,
    tooltip: AnonFontweight = null,
    values: js.Any = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): AnonGuide = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (guide != null) __obj.updateDynamic("guide")(guide.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (`ref-line` != null) __obj.updateDynamic("ref-line")(`ref-line`.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(tick.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGuide]
  }
}

