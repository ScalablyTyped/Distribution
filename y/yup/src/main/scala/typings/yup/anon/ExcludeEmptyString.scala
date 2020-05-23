package typings.yup.anon

import typings.yup.mod.TestOptionsMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcludeEmptyString extends js.Object {
  var excludeEmptyString: js.UndefOr[Boolean] = js.undefined
  var message: js.UndefOr[TestOptionsMessage[Regex, _]] = js.undefined
}

object ExcludeEmptyString {
  @scala.inline
  def apply(
    excludeEmptyString: js.UndefOr[Boolean] = js.undefined,
    message: TestOptionsMessage[Regex, _] = null
  ): ExcludeEmptyString = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(excludeEmptyString)) __obj.updateDynamic("excludeEmptyString")(excludeEmptyString.get.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcludeEmptyString]
  }
}

