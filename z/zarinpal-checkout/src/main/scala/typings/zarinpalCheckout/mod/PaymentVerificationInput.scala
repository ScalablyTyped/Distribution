package typings.zarinpalCheckout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentVerificationInput extends js.Object {
  
  var Amount: Double = js.native
  
  var Authority: String = js.native
}
object PaymentVerificationInput {
  
  @scala.inline
  def apply(Amount: Double, Authority: String): PaymentVerificationInput = {
    val __obj = js.Dynamic.literal(Amount = Amount.asInstanceOf[js.Any], Authority = Authority.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentVerificationInput]
  }
  
  @scala.inline
  implicit class PaymentVerificationInputOps[Self <: PaymentVerificationInput] (val x: Self) extends AnyVal {
    
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
    def setAuthority(value: String): Self = this.set("Authority", value.asInstanceOf[js.Any])
  }
}
