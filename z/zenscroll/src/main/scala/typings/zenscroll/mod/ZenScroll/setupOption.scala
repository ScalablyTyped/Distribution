package typings.zenscroll.mod.ZenScroll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait setupOption extends js.Object {
  var defaultDuration: Double = js.native
  var edgeOffset: Double = js.native
}

object setupOption {
  @scala.inline
  def apply(defaultDuration: Double, edgeOffset: Double): setupOption = {
    val __obj = js.Dynamic.literal(defaultDuration = defaultDuration.asInstanceOf[js.Any], edgeOffset = edgeOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[setupOption]
  }
  @scala.inline
  implicit class setupOptionOps[Self <: setupOption] (val x: Self) extends AnyVal {
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
    def setDefaultDuration(value: Double): Self = this.set("defaultDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def setEdgeOffset(value: Double): Self = this.set("edgeOffset", value.asInstanceOf[js.Any])
  }
  
}

