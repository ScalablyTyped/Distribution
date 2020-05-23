package typings.yup.mod

import typings.yup.anon.Length
import typings.yup.anon.Max
import typings.yup.anon.Min
import typings.yup.anon.Regex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringLocale extends js.Object {
  var email: js.UndefOr[TestOptionsMessage[Regex, _]] = js.undefined
  var length: js.UndefOr[TestOptionsMessage[Length, _]] = js.undefined
  var lowercase: js.UndefOr[TestOptionsMessage[js.Object, _]] = js.undefined
  var matches: js.UndefOr[TestOptionsMessage[Regex, _]] = js.undefined
  var max: js.UndefOr[TestOptionsMessage[Max, _]] = js.undefined
  var min: js.UndefOr[TestOptionsMessage[Min, _]] = js.undefined
  var trim: js.UndefOr[TestOptionsMessage[js.Object, _]] = js.undefined
  var uppercase: js.UndefOr[TestOptionsMessage[js.Object, _]] = js.undefined
  var url: js.UndefOr[TestOptionsMessage[Regex, _]] = js.undefined
}

object StringLocale {
  @scala.inline
  def apply(
    email: TestOptionsMessage[Regex, _] = null,
    length: TestOptionsMessage[Length, _] = null,
    lowercase: TestOptionsMessage[js.Object, _] = null,
    matches: TestOptionsMessage[Regex, _] = null,
    max: TestOptionsMessage[Max, _] = null,
    min: TestOptionsMessage[Min, _] = null,
    trim: TestOptionsMessage[js.Object, _] = null,
    uppercase: TestOptionsMessage[js.Object, _] = null,
    url: TestOptionsMessage[Regex, _] = null
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

