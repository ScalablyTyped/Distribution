package typings.zchatBrowser.mod

import typings.zchatBrowser.zchatBrowserStrings.offline
import typings.zchatBrowser.zchatBrowserStrings.online
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Department extends js.Object {
  var id: Double = js.native
  var name: String = js.native
  var status: online | offline = js.native
}

object Department {
  @scala.inline
  def apply(id: Double, name: String, status: online | offline): Department = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Department]
  }
  @scala.inline
  implicit class DepartmentOps[Self <: Department] (val x: Self) extends AnyVal {
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: online | offline): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

