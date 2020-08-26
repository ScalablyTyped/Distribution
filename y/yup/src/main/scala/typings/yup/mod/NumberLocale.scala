package typings.yup.mod

import typings.yup.anon.Less
import typings.yup.anon.Max
import typings.yup.anon.Min
import typings.yup.anon.More
import typings.yup.anon.PartialTestMessageParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberLocale extends js.Object {
  var integer: js.UndefOr[TestOptionsMessage[js.Object, _]] = js.native
  var lessThan: js.UndefOr[TestOptionsMessage[Less, _]] = js.native
  var max: js.UndefOr[TestOptionsMessage[Max, _]] = js.native
  var min: js.UndefOr[TestOptionsMessage[Min, _]] = js.native
  var moreThan: js.UndefOr[TestOptionsMessage[More, _]] = js.native
  var negative: js.UndefOr[TestOptionsMessage[Less, _]] = js.native
  var positive: js.UndefOr[TestOptionsMessage[More, _]] = js.native
}

object NumberLocale {
  @scala.inline
  def apply(): NumberLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberLocale]
  }
  @scala.inline
  implicit class NumberLocaleOps[Self <: NumberLocale] (val x: Self) extends AnyVal {
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
    def setIntegerFunction1(value: /* params */ js.Object with PartialTestMessageParams => _): Self = this.set("integer", js.Any.fromFunction1(value))
    @scala.inline
    def setInteger(value: TestOptionsMessage[js.Object, _]): Self = this.set("integer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteger: Self = this.set("integer", js.undefined)
    @scala.inline
    def setLessThanFunction1(value: /* params */ Less with PartialTestMessageParams => _): Self = this.set("lessThan", js.Any.fromFunction1(value))
    @scala.inline
    def setLessThan(value: TestOptionsMessage[Less, _]): Self = this.set("lessThan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLessThan: Self = this.set("lessThan", js.undefined)
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
    def setMoreThanFunction1(value: /* params */ More with PartialTestMessageParams => _): Self = this.set("moreThan", js.Any.fromFunction1(value))
    @scala.inline
    def setMoreThan(value: TestOptionsMessage[More, _]): Self = this.set("moreThan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoreThan: Self = this.set("moreThan", js.undefined)
    @scala.inline
    def setNegativeFunction1(value: /* params */ Less with PartialTestMessageParams => _): Self = this.set("negative", js.Any.fromFunction1(value))
    @scala.inline
    def setNegative(value: TestOptionsMessage[Less, _]): Self = this.set("negative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegative: Self = this.set("negative", js.undefined)
    @scala.inline
    def setPositiveFunction1(value: /* params */ More with PartialTestMessageParams => _): Self = this.set("positive", js.Any.fromFunction1(value))
    @scala.inline
    def setPositive(value: TestOptionsMessage[More, _]): Self = this.set("positive", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositive: Self = this.set("positive", js.undefined)
  }
  
}

