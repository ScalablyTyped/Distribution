package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Center extends js.Object {
  var center: js.UndefOr[Size] = js.undefined
  var guide: js.UndefOr[Visible] = js.undefined
  var item: js.UndefOr[OffsetR] = js.undefined
  /**
    * Gauge Charts Only: To set custom labels that correspond to each tick mark on the scale. If there are more tick marks than labels,
    * the default scale values will be used for the remaining labels. ['A', 'B', 'C', 'D', 'E'] | ...
    */
  var labels: js.UndefOr[js.Any] = js.undefined
  var markers: js.UndefOr[js.Array[Label]] = js.undefined
  var `minor-guide`: js.UndefOr[LinecolorLinestyle] = js.undefined
  var `minor-tick`: js.UndefOr[Placement] = js.undefined
  /**
    * Gauge Charts Only: To set the number of minor tick marks displayed between the major tick marks. 9 | 5 | 2 | ...
    */
  var `minor-ticks`: js.UndefOr[Double] = js.undefined
  var ring: js.UndefOr[BorderwidthItems] = js.undefined
  var tick: js.UndefOr[Placement] = js.undefined
  /**
    * Gauge Charts Only: To set the minimum, maximum, and step scale values. '0:10' | '0:25:5' | ...
    */
  var values: js.UndefOr[js.Any] = js.undefined
}

object Center {
  @scala.inline
  def apply(
    center: Size = null,
    guide: Visible = null,
    item: OffsetR = null,
    labels: js.Any = null,
    markers: js.Array[Label] = null,
    `minor-guide`: LinecolorLinestyle = null,
    `minor-tick`: Placement = null,
    `minor-ticks`: js.UndefOr[Double] = js.undefined,
    ring: BorderwidthItems = null,
    tick: Placement = null,
    values: js.Any = null
  ): Center = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (guide != null) __obj.updateDynamic("guide")(guide.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (markers != null) __obj.updateDynamic("markers")(markers.asInstanceOf[js.Any])
    if (`minor-guide` != null) __obj.updateDynamic("minor-guide")(`minor-guide`.asInstanceOf[js.Any])
    if (`minor-tick` != null) __obj.updateDynamic("minor-tick")(`minor-tick`.asInstanceOf[js.Any])
    if (!js.isUndefined(`minor-ticks`)) __obj.updateDynamic("minor-ticks")(`minor-ticks`.get.asInstanceOf[js.Any])
    if (ring != null) __obj.updateDynamic("ring")(ring.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(tick.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Center]
  }
}

