package typings.zingchart.mod

import typings.zingchart.anon.Customitems
import typings.zingchart.anon.Enabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait gui extends js.Object {
  var behaviors: js.UndefOr[js.Array[Enabled]] = js.native
  var `context-menu`: js.UndefOr[Customitems] = js.native
}

object gui {
  @scala.inline
  def apply(): gui = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[gui]
  }
  @scala.inline
  implicit class guiOps[Self <: gui] (val x: Self) extends AnyVal {
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
    def setBehaviorsVarargs(value: Enabled*): Self = this.set("behaviors", js.Array(value :_*))
    @scala.inline
    def setBehaviors(value: js.Array[Enabled]): Self = this.set("behaviors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBehaviors: Self = this.set("behaviors", js.undefined)
    @scala.inline
    def `setContext-menu`(value: Customitems): Self = this.set("context-menu", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteContext-menu`: Self = this.set("context-menu", js.undefined)
  }
  
}

