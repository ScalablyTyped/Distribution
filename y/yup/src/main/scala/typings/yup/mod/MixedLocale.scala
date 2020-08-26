package typings.yup.mod

import typings.yup.anon.PartialTestMessageParams
import typings.yup.anon.Values
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MixedLocale extends js.Object {
  var default: js.UndefOr[TestOptionsMessage[js.Object, _]] = js.native
  var notOneOf: js.UndefOr[TestOptionsMessage[Values, _]] = js.native
  var notType: js.UndefOr[LocaleValue] = js.native
  var oneOf: js.UndefOr[TestOptionsMessage[Values, _]] = js.native
  var required: js.UndefOr[TestOptionsMessage[js.Object, _]] = js.native
}

object MixedLocale {
  @scala.inline
  def apply(): MixedLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MixedLocale]
  }
  @scala.inline
  implicit class MixedLocaleOps[Self <: MixedLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDefaultFunction1(value: /* params */ js.Object with PartialTestMessageParams => _): Self = this.set("default", js.Any.fromFunction1(value))
    @scala.inline
    def setDefault(value: TestOptionsMessage[js.Object, _]): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setNotOneOfFunction1(value: /* params */ Values with PartialTestMessageParams => _): Self = this.set("notOneOf", js.Any.fromFunction1(value))
    @scala.inline
    def setNotOneOf(value: TestOptionsMessage[Values, _]): Self = this.set("notOneOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotOneOf: Self = this.set("notOneOf", js.undefined)
    @scala.inline
    def setNotTypeFunction1(value: /* params */ FormatErrorParams => String): Self = this.set("notType", js.Any.fromFunction1(value))
    @scala.inline
    def setNotType(value: LocaleValue): Self = this.set("notType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotType: Self = this.set("notType", js.undefined)
    @scala.inline
    def setOneOfFunction1(value: /* params */ Values with PartialTestMessageParams => _): Self = this.set("oneOf", js.Any.fromFunction1(value))
    @scala.inline
    def setOneOf(value: TestOptionsMessage[Values, _]): Self = this.set("oneOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOneOf: Self = this.set("oneOf", js.undefined)
    @scala.inline
    def setRequiredFunction1(value: /* params */ js.Object with PartialTestMessageParams => _): Self = this.set("required", js.Any.fromFunction1(value))
    @scala.inline
    def setRequired(value: TestOptionsMessage[js.Object, _]): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
  }
  
}

