package typings.zchatDashBrowser.zchatDashBrowserMod

import typings.zchatDashBrowser.zchatDashBrowserStrings.offline
import typings.zchatDashBrowser.zchatDashBrowserStrings.online
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Department extends js.Object {
  var id: Double
  var name: String
  var status: online | offline
}

object Department {
  @scala.inline
  def apply(id: Double, name: String, status: online | offline): Department = {
    val __obj = js.Dynamic.literal(id = id, name = name, status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Department]
  }
}

