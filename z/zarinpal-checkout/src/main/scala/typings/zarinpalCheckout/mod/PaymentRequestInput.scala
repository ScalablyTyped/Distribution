package typings.zarinpalCheckout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentRequestInput extends js.Object {
  
  var Amount: Double = js.native
  
  var CallbackURL: String = js.native
  
  var Description: String = js.native
  
  var Email: js.UndefOr[String] = js.native
  
  var Mobile: js.UndefOr[String] = js.native
}
object PaymentRequestInput {
  
  @scala.inline
  def apply(Amount: Double, CallbackURL: String, Description: String): PaymentRequestInput = {
    val __obj = js.Dynamic.literal(Amount = Amount.asInstanceOf[js.Any], CallbackURL = CallbackURL.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentRequestInput]
  }
  
  @scala.inline
  implicit class PaymentRequestInputOps[Self <: PaymentRequestInput] (val x: Self) extends AnyVal {
    
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
    def setAmount(value: Double): Self = this.set("Amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackURL(value: String): Self = this.set("CallbackURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = this.set("Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("Email", js.undefined)
    
    @scala.inline
    def setMobile(value: String): Self = this.set("Mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobile: Self = this.set("Mobile", js.undefined)
  }
}
