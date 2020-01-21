package typings.yup.mod

import typings.yup.AnonLength
import typings.yup.AnonMax
import typings.yup.AnonMin
import typings.yup.AnonRegex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringLocale extends js.Object {
  var email: js.UndefOr[TestOptionsMessage[AnonRegex, _]] = js.undefined
  var length: js.UndefOr[TestOptionsMessage[AnonLength, _]] = js.undefined
  var lowercase: js.UndefOr[TestOptionsMessage[js.Object, _]] = js.undefined
  var matches: js.UndefOr[TestOptionsMessage[AnonRegex, _]] = js.undefined
  var max: js.UndefOr[TestOptionsMessage[AnonMax, _]] = js.undefined
  var min: js.UndefOr[TestOptionsMessage[AnonMin, _]] = js.undefined
  var trim: js.UndefOr[TestOptionsMessage[js.Object, _]] = js.undefined
  var uppercase: js.UndefOr[TestOptionsMessage[js.Object, _]] = js.undefined
  var url: js.UndefOr[TestOptionsMessage[AnonRegex, _]] = js.undefined
}

object StringLocale {
  @scala.inline
  def apply(
    email: TestOptionsMessage[AnonRegex, _] = null,
    length: TestOptionsMessage[AnonLength, _] = null,
    lowercase: TestOptionsMessage[js.Object, _] = null,
    matches: TestOptionsMessage[AnonRegex, _] = null,
    max: TestOptionsMessage[AnonMax, _] = null,
    min: TestOptionsMessage[AnonMin, _] = null,
    trim: TestOptionsMessage[js.Object, _] = null,
    uppercase: TestOptionsMessage[js.Object, _] = null,
    url: TestOptionsMessage[AnonRegex, _] = null
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

