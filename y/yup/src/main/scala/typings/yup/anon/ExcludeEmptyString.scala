package typings.yup.anon

import typings.yup.mod.TestOptionsMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExcludeEmptyString extends js.Object {
  
  var excludeEmptyString: js.UndefOr[Boolean] = js.native
  
  var message: js.UndefOr[TestOptionsMessage[Regex, _]] = js.native
}
object ExcludeEmptyString {
  
  @scala.inline
  def apply(): ExcludeEmptyString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcludeEmptyString]
  }
  
  @scala.inline
  implicit class ExcludeEmptyStringOps[Self <: ExcludeEmptyString] (val x: Self) extends AnyVal {
    
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
    def setExcludeEmptyString(value: Boolean): Self = this.set("excludeEmptyString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeEmptyString: Self = this.set("excludeEmptyString", js.undefined)
    
    @scala.inline
    def setMessageFunction1(value: /* params */ Regex with PartialTestMessageParams => _): Self = this.set("message", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMessage(value: TestOptionsMessage[Regex, _]): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}
