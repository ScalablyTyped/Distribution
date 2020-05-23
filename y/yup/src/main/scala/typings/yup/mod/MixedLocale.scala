package typings.yup.mod

import typings.yup.anon.Values
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MixedLocale extends js.Object {
  var default: js.UndefOr[TestOptionsMessage[js.Object, _]] = js.undefined
  var notOneOf: js.UndefOr[TestOptionsMessage[Values, _]] = js.undefined
  var notType: js.UndefOr[LocaleValue] = js.undefined
  var oneOf: js.UndefOr[TestOptionsMessage[Values, _]] = js.undefined
  var required: js.UndefOr[TestOptionsMessage[js.Object, _]] = js.undefined
}

object MixedLocale {
  @scala.inline
  def apply(
    default: TestOptionsMessage[js.Object, _] = null,
    notOneOf: TestOptionsMessage[Values, _] = null,
    notType: LocaleValue = null,
    oneOf: TestOptionsMessage[Values, _] = null,
    required: TestOptionsMessage[js.Object, _] = null
  ): MixedLocale = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (notOneOf != null) __obj.updateDynamic("notOneOf")(notOneOf.asInstanceOf[js.Any])
    if (notType != null) __obj.updateDynamic("notType")(notType.asInstanceOf[js.Any])
    if (oneOf != null) __obj.updateDynamic("oneOf")(oneOf.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[MixedLocale]
  }
}

