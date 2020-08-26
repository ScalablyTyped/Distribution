package typings.yup.mod

import typings.yup.anon.PartialTestMessageParams
import typings.yup.anon.`0`
import typings.yup.anon.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateLocale extends js.Object {
  var max: js.UndefOr[TestOptionsMessage[`1`, _]] = js.native
  var min: js.UndefOr[TestOptionsMessage[`0`, _]] = js.native
}

object DateLocale {
  @scala.inline
  def apply(): DateLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateLocale]
  }
  @scala.inline
  implicit class DateLocaleOps[Self <: DateLocale] (val x: Self) extends AnyVal {
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
    def setMaxFunction1(value: /* params */ `1` with PartialTestMessageParams => _): Self = this.set("max", js.Any.fromFunction1(value))
    @scala.inline
    def setMax(value: TestOptionsMessage[`1`, _]): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMinFunction1(value: /* params */ `0` with PartialTestMessageParams => _): Self = this.set("min", js.Any.fromFunction1(value))
    @scala.inline
    def setMin(value: TestOptionsMessage[`0`, _]): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
  }
  
}

