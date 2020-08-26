package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollapseOptions extends js.Object {
  var parent: js.UndefOr[js.Any] = js.native
  var toggle: js.UndefOr[Boolean] = js.native
}

object CollapseOptions {
  @scala.inline
  def apply(): CollapseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapseOptions]
  }
  @scala.inline
  implicit class CollapseOptionsOps[Self <: CollapseOptions] (val x: Self) extends AnyVal {
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
    def setParent(value: js.Any): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setToggle(value: Boolean): Self = this.set("toggle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
  }
  
}

