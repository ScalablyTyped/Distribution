package typings
package zchatDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Department extends js.Object {
  var department: js.UndefOr[scala.Double] = js.undefined
  var email: java.lang.String
  var message: java.lang.String
  var name: java.lang.String
  var phone: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Department {
  @scala.inline
  def apply(
    email: java.lang.String,
    message: java.lang.String,
    name: java.lang.String,
    department: scala.Int | scala.Double = null,
    phone: java.lang.String = null
  ): Anon_Department = {
    val __obj = js.Dynamic.literal(email = email, message = message, name = name)
    if (department != null) __obj.updateDynamic("department")(department.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone)
    __obj.asInstanceOf[Anon_Department]
  }
}

