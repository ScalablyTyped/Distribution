package typings
package yupLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExcludeEmptyString extends js.Object {
  var excludeEmptyString: js.UndefOr[scala.Boolean] = js.undefined
  var message: js.UndefOr[yupLib.yupMod.TestOptionsMessage] = js.undefined
}

object Anon_ExcludeEmptyString {
  @scala.inline
  def apply(
    excludeEmptyString: js.UndefOr[scala.Boolean] = js.undefined,
    message: yupLib.yupMod.TestOptionsMessage = null
  ): Anon_ExcludeEmptyString = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(excludeEmptyString)) __obj.updateDynamic("excludeEmptyString")(excludeEmptyString)
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExcludeEmptyString]
  }
}

