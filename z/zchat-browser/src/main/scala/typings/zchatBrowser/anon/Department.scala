package typings.zchatBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Department extends js.Object {
  var department: js.UndefOr[Double] = js.undefined
  var email: String
  var message: String
  var name: String
  var phone: js.UndefOr[String] = js.undefined
}

object Department {
  @scala.inline
  def apply(
    email: String,
    message: String,
    name: String,
    department: js.UndefOr[Double] = js.undefined,
    phone: String = null
  ): Department = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(department)) __obj.updateDynamic("department")(department.get.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Department]
  }
}

