package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Customitems extends js.Object {
  var button: js.UndefOr[Maxchars] = js.native
  var `custom-items`: js.UndefOr[js.Array[Function]] = js.native
  /**
    * To fix the position of the context menu to one side of the chart. true | false
    */
  var docked: js.UndefOr[Boolean] = js.native
  /**
    * Empties all default context-menu items, leaving just the "About ZingChart" button. true | false | 1 | 0
    */
  var empty: js.UndefOr[Boolean] = js.native
  var gear: js.UndefOr[Offsety] = js.native
  var item: js.UndefOr[FontcolorHoverstate] = js.native
  /**
    * To position the context menu button on the left or right side of the chart. left | right
    */
  var position: js.UndefOr[String] = js.native
}

object Customitems {
  @scala.inline
  def apply(): Customitems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Customitems]
  }
  @scala.inline
  implicit class CustomitemsOps[Self <: Customitems] (val x: Self) extends AnyVal {
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
    def setButton(value: Maxchars): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    @scala.inline
    def `setCustom-itemsVarargs`(value: Function*): Self = this.set("custom-items", js.Array(value :_*))
    @scala.inline
    def `setCustom-items`(value: js.Array[Function]): Self = this.set("custom-items", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCustom-items`: Self = this.set("custom-items", js.undefined)
    @scala.inline
    def setDocked(value: Boolean): Self = this.set("docked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocked: Self = this.set("docked", js.undefined)
    @scala.inline
    def setEmpty(value: Boolean): Self = this.set("empty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmpty: Self = this.set("empty", js.undefined)
    @scala.inline
    def setGear(value: Offsety): Self = this.set("gear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGear: Self = this.set("gear", js.undefined)
    @scala.inline
    def setItem(value: FontcolorHoverstate): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

