package typings.yup.mod

import typings.yup.anon.Length
import typings.yup.anon.Max
import typings.yup.anon.Min
import typings.yup.anon.PartialTestMessageParams
import typings.yup.anon.Regex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringLocale extends js.Object {
  var email: js.UndefOr[TestOptionsMessage[Regex, _]] = js.native
  var length: js.UndefOr[TestOptionsMessage[Length, _]] = js.native
  var lowercase: js.UndefOr[TestOptionsMessage[js.Object, _]] = js.native
  var matches: js.UndefOr[TestOptionsMessage[Regex, _]] = js.native
  var max: js.UndefOr[TestOptionsMessage[Max, _]] = js.native
  var min: js.UndefOr[TestOptionsMessage[Min, _]] = js.native
  var trim: js.UndefOr[TestOptionsMessage[js.Object, _]] = js.native
  var uppercase: js.UndefOr[TestOptionsMessage[js.Object, _]] = js.native
  var url: js.UndefOr[TestOptionsMessage[Regex, _]] = js.native
}

object StringLocale {
  @scala.inline
  def apply(): StringLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringLocale]
  }
  @scala.inline
  implicit class StringLocaleOps[Self <: StringLocale] (val x: Self) extends AnyVal {
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
    def setEmailFunction1(value: /* params */ Regex with PartialTestMessageParams => _): Self = this.set("email", js.Any.fromFunction1(value))
    @scala.inline
    def setEmail(value: TestOptionsMessage[Regex, _]): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setLengthFunction1(value: /* params */ Length with PartialTestMessageParams => _): Self = this.set("length", js.Any.fromFunction1(value))
    @scala.inline
    def setLength(value: TestOptionsMessage[Length, _]): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setLowercaseFunction1(value: /* params */ js.Object with PartialTestMessageParams => _): Self = this.set("lowercase", js.Any.fromFunction1(value))
    @scala.inline
    def setLowercase(value: TestOptionsMessage[js.Object, _]): Self = this.set("lowercase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowercase: Self = this.set("lowercase", js.undefined)
    @scala.inline
    def setMatchesFunction1(value: /* params */ Regex with PartialTestMessageParams => _): Self = this.set("matches", js.Any.fromFunction1(value))
    @scala.inline
    def setMatches(value: TestOptionsMessage[Regex, _]): Self = this.set("matches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatches: Self = this.set("matches", js.undefined)
    @scala.inline
    def setMaxFunction1(value: /* params */ Max with PartialTestMessageParams => _): Self = this.set("max", js.Any.fromFunction1(value))
    @scala.inline
    def setMax(value: TestOptionsMessage[Max, _]): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMinFunction1(value: /* params */ Min with PartialTestMessageParams => _): Self = this.set("min", js.Any.fromFunction1(value))
    @scala.inline
    def setMin(value: TestOptionsMessage[Min, _]): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setTrimFunction1(value: /* params */ js.Object with PartialTestMessageParams => _): Self = this.set("trim", js.Any.fromFunction1(value))
    @scala.inline
    def setTrim(value: TestOptionsMessage[js.Object, _]): Self = this.set("trim", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrim: Self = this.set("trim", js.undefined)
    @scala.inline
    def setUppercaseFunction1(value: /* params */ js.Object with PartialTestMessageParams => _): Self = this.set("uppercase", js.Any.fromFunction1(value))
    @scala.inline
    def setUppercase(value: TestOptionsMessage[js.Object, _]): Self = this.set("uppercase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUppercase: Self = this.set("uppercase", js.undefined)
    @scala.inline
    def setUrlFunction1(value: /* params */ Regex with PartialTestMessageParams => _): Self = this.set("url", js.Any.fromFunction1(value))
    @scala.inline
    def setUrl(value: TestOptionsMessage[Regex, _]): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

