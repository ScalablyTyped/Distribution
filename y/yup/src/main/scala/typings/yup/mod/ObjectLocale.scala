package typings.yup.mod

import typings.yup.anon.PartialTestMessageParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectLocale extends js.Object {
  var noUnknown: js.UndefOr[TestOptionsMessage[js.Object, _]] = js.native
}

object ObjectLocale {
  @scala.inline
  def apply(): ObjectLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectLocale]
  }
  @scala.inline
  implicit class ObjectLocaleOps[Self <: ObjectLocale] (val x: Self) extends AnyVal {
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
    def setNoUnknownFunction1(value: /* params */ js.Object with PartialTestMessageParams => _): Self = this.set("noUnknown", js.Any.fromFunction1(value))
    @scala.inline
    def setNoUnknown(value: TestOptionsMessage[js.Object, _]): Self = this.set("noUnknown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoUnknown: Self = this.set("noUnknown", js.undefined)
  }
  
}

