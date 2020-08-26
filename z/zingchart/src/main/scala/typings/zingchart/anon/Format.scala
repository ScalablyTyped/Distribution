package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Format extends js.Object {
  /**
    * On a radar chart, the “aspect” attribute allows you to change the chart’s shape from star/spider (default) to circular. 'star' (de
    * fault) | 'circle'
    */
  var aspect: js.UndefOr[String] = js.native
  /**
    * Allows you to set the format for your scale-k values. You can use a combination of text and tokens (%v represents the scale values
    * ), e.g., “%v°” or “Variable %v”. 'Value: %v'
    */
  var format: js.UndefOr[String] = js.native
  var guide: js.UndefOr[Items] = js.native
  var item: js.UndefOr[Fontstyle] = js.native
  /**
    * Allows you to set custom labels for each step along scale-k. [...]
    */
  var labels: js.UndefOr[js.Any] = js.native
  var tick: js.UndefOr[Placement] = js.native
  var tooltip: js.UndefOr[Fontweight] = js.native
  /**
    * Used to set the minimum, maximum, and step scale values on scale-k. E.g., for “values”: “0:330:30”, 0 is the minimum, 330 is the m
    * aximum, and 30 is the step. "0:100:10" | [1,3,5,7] | ...
    */
  var values: js.UndefOr[js.Any] = js.native
  /**
    * Used to hide the k-axis. true | false
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object Format {
  @scala.inline
  def apply(): Format = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Format]
  }
  @scala.inline
  implicit class FormatOps[Self <: Format] (val x: Self) extends AnyVal {
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
    def setAspect(value: String): Self = this.set("aspect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAspect: Self = this.set("aspect", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setGuide(value: Items): Self = this.set("guide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuide: Self = this.set("guide", js.undefined)
    @scala.inline
    def setItem(value: Fontstyle): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    @scala.inline
    def setLabels(value: js.Any): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setTick(value: Placement): Self = this.set("tick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTick: Self = this.set("tick", js.undefined)
    @scala.inline
    def setTooltip(value: Fontweight): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setValues(value: js.Any): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

