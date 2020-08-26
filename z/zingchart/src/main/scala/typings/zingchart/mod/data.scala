package typings.zingchart.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait data extends js.Object {
  var globals: js.UndefOr[typings.zingchart.mod.globals] = js.native
  var graphset: js.UndefOr[js.Array[typings.zingchart.mod.graphset]] = js.native
  var gui: js.UndefOr[typings.zingchart.mod.gui] = js.native
  var history: js.UndefOr[typings.zingchart.mod.history] = js.native
  var refresh: js.UndefOr[typings.zingchart.mod.refresh] = js.native
}

object data {
  @scala.inline
  def apply(): data = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[data]
  }
  @scala.inline
  implicit class dataOps[Self <: data] (val x: Self) extends AnyVal {
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
    def setGlobals(value: globals): Self = this.set("globals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobals: Self = this.set("globals", js.undefined)
    @scala.inline
    def setGraphsetVarargs(value: graphset*): Self = this.set("graphset", js.Array(value :_*))
    @scala.inline
    def setGraphset(value: js.Array[graphset]): Self = this.set("graphset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraphset: Self = this.set("graphset", js.undefined)
    @scala.inline
    def setGui(value: gui): Self = this.set("gui", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGui: Self = this.set("gui", js.undefined)
    @scala.inline
    def setHistory(value: history): Self = this.set("history", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
    @scala.inline
    def setRefresh(value: refresh): Self = this.set("refresh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefresh: Self = this.set("refresh", js.undefined)
  }
  
}

