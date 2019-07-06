package typings
package zchatDashBrowserLib.zchatDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Department extends js.Object {
  var id: scala.Double
  var name: java.lang.String
  var status: zchatDashBrowserLib.zchatDashBrowserLibStrings.online | zchatDashBrowserLib.zchatDashBrowserLibStrings.offline
}

object Department {
  @scala.inline
  def apply(
    id: scala.Double,
    name: java.lang.String,
    status: zchatDashBrowserLib.zchatDashBrowserLibStrings.online | zchatDashBrowserLib.zchatDashBrowserLibStrings.offline
  ): Department = {
    val __obj = js.Dynamic.literal(id = id, name = name, status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Department]
  }
}

