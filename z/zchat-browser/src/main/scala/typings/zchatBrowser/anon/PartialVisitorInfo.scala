package typings.zchatBrowser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<zchat-browser.zchat-browser.VisitorInfo> */
trait PartialVisitorInfo extends StObject {
  
  var display_name: js.UndefOr[String] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
  
  var phone: js.UndefOr[String] = js.undefined
}
object PartialVisitorInfo {
  
  @scala.inline
  def apply(): PartialVisitorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialVisitorInfo]
  }
  
  @scala.inline
  implicit class PartialVisitorInfoMutableBuilder[Self <: PartialVisitorInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay_nameUndefined: Self = StObject.set(x, "display_name", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
  }
}
