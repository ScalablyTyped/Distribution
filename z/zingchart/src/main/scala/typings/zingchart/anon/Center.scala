package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Center extends js.Object {
  var center: js.UndefOr[Size] = js.native
  var guide: js.UndefOr[Visible] = js.native
  var item: js.UndefOr[OffsetR] = js.native
  /**
    * Gauge Charts Only: To set custom labels that correspond to each tick mark on the scale. If there are more tick marks than labels,
    * the default scale values will be used for the remaining labels. ['A', 'B', 'C', 'D', 'E'] | ...
    */
  var labels: js.UndefOr[js.Any] = js.native
  var markers: js.UndefOr[js.Array[Label]] = js.native
  var `minor-guide`: js.UndefOr[LinecolorLinestyle] = js.native
  var `minor-tick`: js.UndefOr[Placement] = js.native
  /**
    * Gauge Charts Only: To set the number of minor tick marks displayed between the major tick marks. 9 | 5 | 2 | ...
    */
  var `minor-ticks`: js.UndefOr[Double] = js.native
  var ring: js.UndefOr[BorderwidthItems] = js.native
  var tick: js.UndefOr[Placement] = js.native
  /**
    * Gauge Charts Only: To set the minimum, maximum, and step scale values. '0:10' | '0:25:5' | ...
    */
  var values: js.UndefOr[js.Any] = js.native
}

object Center {
  @scala.inline
  def apply(): Center = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Center]
  }
  @scala.inline
  implicit class CenterOps[Self <: Center] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCenter(value: Size): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    @scala.inline
    def setGuide(value: Visible): Self = this.set("guide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuide: Self = this.set("guide", js.undefined)
    @scala.inline
    def setItem(value: OffsetR): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    @scala.inline
    def setLabels(value: js.Any): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setMarkersVarargs(value: Label*): Self = this.set("markers", js.Array(value :_*))
    @scala.inline
    def setMarkers(value: js.Array[Label]): Self = this.set("markers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkers: Self = this.set("markers", js.undefined)
    @scala.inline
    def `setMinor-guide`(value: LinecolorLinestyle): Self = this.set("minor-guide", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMinor-guide`: Self = this.set("minor-guide", js.undefined)
    @scala.inline
    def `setMinor-tick`(value: Placement): Self = this.set("minor-tick", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMinor-tick`: Self = this.set("minor-tick", js.undefined)
    @scala.inline
    def `setMinor-ticks`(value: Double): Self = this.set("minor-ticks", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMinor-ticks`: Self = this.set("minor-ticks", js.undefined)
    @scala.inline
    def setRing(value: BorderwidthItems): Self = this.set("ring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRing: Self = this.set("ring", js.undefined)
    @scala.inline
    def setTick(value: Placement): Self = this.set("tick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTick: Self = this.set("tick", js.undefined)
    @scala.inline
    def setValues(value: js.Any): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

