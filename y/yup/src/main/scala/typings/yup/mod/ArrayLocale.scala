package typings.yup.mod

import typings.yup.anon.Max
import typings.yup.anon.Min
import typings.yup.anon.PartialTestMessageParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayLocale extends js.Object {
  var max: js.UndefOr[TestOptionsMessage[Max, _]] = js.native
  var min: js.UndefOr[TestOptionsMessage[Min, _]] = js.native
}

object ArrayLocale {
  @scala.inline
  def apply(): ArrayLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayLocale]
  }
  @scala.inline
  implicit class ArrayLocaleOps[Self <: ArrayLocale] (val x: Self) extends AnyVal {
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
  }
  
}

