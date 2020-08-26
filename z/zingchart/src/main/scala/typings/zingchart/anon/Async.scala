package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Async extends js.Object {
  /**
    * Sets the transparency of the object. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and 1.0 being comp
    * letely opaque. Please note that values also require the leading 0 before the decimal. 0.3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.native
  /**
    * TODO: description of async attribute true | false | 1 | 0
    */
  var async: js.UndefOr[Boolean] = js.native
  /**
    * Sets the blur radius of the heatmap regions. 10 | 20 | ...
    */
  var blur: js.UndefOr[Double] = js.native
  /**
    * Sets the type of blur shape. "circle" | "square" | ...
    */
  var `brush-typebrushType`: js.UndefOr[String] = js.native
  /**
    * Sets the blur shapes to composite or not. true | false | 1 | 0
    */
  var composite: js.UndefOr[Boolean] = js.native
  var graph: js.UndefOr[KeyscalekeyScale] = js.native
  /**
    * Sets the size of the object/shape. 4 | "6px" | ...
    */
  var size: js.UndefOr[js.Any] = js.native
  /**
    * Sets whether or not the data is sorted. true | false | 1 | 0
    */
  var `sort-datasortData`: js.UndefOr[Boolean] = js.native
  var tooltip: js.UndefOr[Backgroundfit] = js.native
}

object Async {
  @scala.inline
  def apply(): Async = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Async]
  }
  @scala.inline
  implicit class AsyncOps[Self <: Async] (val x: Self) extends AnyVal {
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
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    @scala.inline
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    @scala.inline
    def setBlur(value: Double): Self = this.set("blur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlur: Self = this.set("blur", js.undefined)
    @scala.inline
    def `setBrush-typebrushType`(value: String): Self = this.set("brush-typebrushType", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBrush-typebrushType`: Self = this.set("brush-typebrushType", js.undefined)
    @scala.inline
    def setComposite(value: Boolean): Self = this.set("composite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComposite: Self = this.set("composite", js.undefined)
    @scala.inline
    def setGraph(value: KeyscalekeyScale): Self = this.set("graph", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraph: Self = this.set("graph", js.undefined)
    @scala.inline
    def setSize(value: js.Any): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def `setSort-datasortData`(value: Boolean): Self = this.set("sort-datasortData", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSort-datasortData`: Self = this.set("sort-datasortData", js.undefined)
    @scala.inline
    def setTooltip(value: Backgroundfit): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
  
}

