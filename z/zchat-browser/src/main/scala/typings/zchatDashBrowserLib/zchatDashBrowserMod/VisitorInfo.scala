package typings
package zchatDashBrowserLib.zchatDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisitorInfo extends js.Object {
  var display_name: java.lang.String
  var email: java.lang.String
  var phone: java.lang.String
}

object VisitorInfo {
  @scala.inline
  def apply(display_name: java.lang.String, email: java.lang.String, phone: java.lang.String): VisitorInfo = {
    val __obj = js.Dynamic.literal(display_name = display_name, email = email, phone = phone)
  
    __obj.asInstanceOf[VisitorInfo]
  }
}

