package typings.yup.yupMod

import typings.yup.Anon_Length
import typings.yup.Anon_Max
import typings.yup.Anon_Min
import typings.yup.Anon_Regex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringLocale extends js.Object {
  var email: js.UndefOr[TestOptionsMessage[Anon_Regex, _]] = js.undefined
  var length: js.UndefOr[TestOptionsMessage[Anon_Length, _]] = js.undefined
  var lowercase: js.UndefOr[TestOptionsMessage[js.Object, _]] = js.undefined
  var matches: js.UndefOr[TestOptionsMessage[Anon_Regex, _]] = js.undefined
  var max: js.UndefOr[TestOptionsMessage[Anon_Max, _]] = js.undefined
  var min: js.UndefOr[TestOptionsMessage[Anon_Min, _]] = js.undefined
  var trim: js.UndefOr[TestOptionsMessage[js.Object, _]] = js.undefined
  var uppercase: js.UndefOr[TestOptionsMessage[js.Object, _]] = js.undefined
  var url: js.UndefOr[TestOptionsMessage[Anon_Regex, _]] = js.undefined
}

object StringLocale {
  @scala.inline
  def apply(
    email: TestOptionsMessage[Anon_Regex, _] = null,
    length: TestOptionsMessage[Anon_Length, _] = null,
    lowercase: TestOptionsMessage[js.Object, _] = null,
    matches: TestOptionsMessage[Anon_Regex, _] = null,
    max: TestOptionsMessage[Anon_Max, _] = null,
    min: TestOptionsMessage[Anon_Min, _] = null,
    trim: TestOptionsMessage[js.Object, _] = null,
    uppercase: TestOptionsMessage[js.Object, _] = null,
    url: TestOptionsMessage[Anon_Regex, _] = null
  ): StringLocale = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (lowercase != null) __obj.updateDynamic("lowercase")(lowercase.asInstanceOf[js.Any])
    if (matches != null) __obj.updateDynamic("matches")(matches.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (trim != null) __obj.updateDynamic("trim")(trim.asInstanceOf[js.Any])
    if (uppercase != null) __obj.updateDynamic("uppercase")(uppercase.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringLocale]
  }
}

