package typings.yup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectLocale extends js.Object {
  var noUnknown: js.UndefOr[TestOptionsMessage[js.Object, _]] = js.undefined
}

object ObjectLocale {
  @scala.inline
  def apply(noUnknown: TestOptionsMessage[js.Object, _] = null): ObjectLocale = {
    val __obj = js.Dynamic.literal()
    if (noUnknown != null) __obj.updateDynamic("noUnknown")(noUnknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectLocale]
  }
}

