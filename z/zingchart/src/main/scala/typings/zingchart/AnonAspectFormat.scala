package typings.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAspectFormat extends js.Object {
  /**
    * On a radar chart, the “aspect” attribute allows you to change the chart’s shape from star/spider (default) to circular. 'star' (de
    * fault) | 'circle'
    */
  var aspect: js.UndefOr[String] = js.undefined
  /**
    * Allows you to set the format for your scale-k values. You can use a combination of text and tokens (%v represents the scale values
    * ), e.g., “%v°” or “Variable %v”. 'Value: %v'
    */
  var format: js.UndefOr[String] = js.undefined
  var guide: js.UndefOr[AnonAlphaBackgroundcolorItems] = js.undefined
  var item: js.UndefOr[AnonAlphaAngleBackgroundcolorBordercolor] = js.undefined
  /**
    * Allows you to set custom labels for each step along scale-k. [...]
    */
  var labels: js.UndefOr[js.Any] = js.undefined
  var tick: js.UndefOr[AnonAlphaLinecolorLinestyleLinewidth] = js.undefined
  var tooltip: js.UndefOr[AnonAlphaBackgroundcolorBorderalphaBordercolorBorderradius] = js.undefined
  /**
    * Used to set the minimum, maximum, and step scale values on scale-k. E.g., for “values”: “0:330:30”, 0 is the minimum, 330 is the m
    * aximum, and 30 is the step. "0:100:10" | [1,3,5,7] | ...
    */
  var values: js.UndefOr[js.Any] = js.undefined
  /**
    * Used to hide the k-axis. true | false
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AnonAspectFormat {
  @scala.inline
  def apply(
    aspect: String = null,
    format: String = null,
    guide: AnonAlphaBackgroundcolorItems = null,
    item: AnonAlphaAngleBackgroundcolorBordercolor = null,
    labels: js.Any = null,
    tick: AnonAlphaLinecolorLinestyleLinewidth = null,
    tooltip: AnonAlphaBackgroundcolorBorderalphaBordercolorBorderradius = null,
    values: js.Any = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): AnonAspectFormat = {
    val __obj = js.Dynamic.literal()
    if (aspect != null) __obj.updateDynamic("aspect")(aspect.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (guide != null) __obj.updateDynamic("guide")(guide.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(tick.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAspectFormat]
  }
}

