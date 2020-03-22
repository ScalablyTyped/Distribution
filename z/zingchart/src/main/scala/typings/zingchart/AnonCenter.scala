package typings.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCenter extends js.Object {
  var center: js.UndefOr[AnonSize] = js.undefined
  var guide: js.UndefOr[AnonVisible] = js.undefined
  var item: js.UndefOr[AnonOffsetR] = js.undefined
  /**
    * Gauge Charts Only: To set custom labels that correspond to each tick mark on the scale. If there are more tick marks than labels,
    * the default scale values will be used for the remaining labels. ['A', 'B', 'C', 'D', 'E'] | ...
    */
  var labels: js.UndefOr[js.Any] = js.undefined
  var markers: js.UndefOr[js.Array[AnonLabel]] = js.undefined
  var `minor-guide`: js.UndefOr[AnonLinecolorLinestyle] = js.undefined
  var `minor-tick`: js.UndefOr[AnonPlacement] = js.undefined
  /**
    * Gauge Charts Only: To set the number of minor tick marks displayed between the major tick marks. 9 | 5 | 2 | ...
    */
  var `minor-ticks`: js.UndefOr[Double] = js.undefined
  var ring: js.UndefOr[AnonBorderwidthItems] = js.undefined
  var tick: js.UndefOr[AnonPlacement] = js.undefined
  /**
    * Gauge Charts Only: To set the minimum, maximum, and step scale values. '0:10' | '0:25:5' | ...
    */
  var values: js.UndefOr[js.Any] = js.undefined
}

object AnonCenter {
  @scala.inline
  def apply(
    center: AnonSize = null,
    guide: AnonVisible = null,
    item: AnonOffsetR = null,
    labels: js.Any = null,
    markers: js.Array[AnonLabel] = null,
    `minor-guide`: AnonLinecolorLinestyle = null,
    `minor-tick`: AnonPlacement = null,
    `minor-ticks`: Int | Double = null,
    ring: AnonBorderwidthItems = null,
    tick: AnonPlacement = null,
    values: js.Any = null
  ): AnonCenter = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (guide != null) __obj.updateDynamic("guide")(guide.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (markers != null) __obj.updateDynamic("markers")(markers.asInstanceOf[js.Any])
    if (`minor-guide` != null) __obj.updateDynamic("minor-guide")(`minor-guide`.asInstanceOf[js.Any])
    if (`minor-tick` != null) __obj.updateDynamic("minor-tick")(`minor-tick`.asInstanceOf[js.Any])
    if (`minor-ticks` != null) __obj.updateDynamic("minor-ticks")(`minor-ticks`.asInstanceOf[js.Any])
    if (ring != null) __obj.updateDynamic("ring")(ring.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(tick.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCenter]
  }
}

