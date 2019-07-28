package typings.yup

import typings.yup.yupMod.LocaleValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NotType extends js.Object {
  var notType: js.UndefOr[LocaleValue] = js.undefined
}

object Anon_NotType {
  @scala.inline
  def apply(notType: LocaleValue = null): Anon_NotType = {
    val __obj = js.Dynamic.literal()
    if (notType != null) __obj.updateDynamic("notType")(notType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NotType]
  }
}

