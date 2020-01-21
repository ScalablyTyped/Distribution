package typings.yup

import typings.yup.mod.TestOptionsMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExcludeEmptyString extends js.Object {
  var excludeEmptyString: js.UndefOr[Boolean] = js.undefined
  var message: js.UndefOr[TestOptionsMessage[AnonRegex, _]] = js.undefined
}

object AnonExcludeEmptyString {
  @scala.inline
  def apply(
    excludeEmptyString: js.UndefOr[Boolean] = js.undefined,
    message: TestOptionsMessage[AnonRegex, _] = null
  ): AnonExcludeEmptyString = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(excludeEmptyString)) __obj.updateDynamic("excludeEmptyString")(excludeEmptyString.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExcludeEmptyString]
  }
}

