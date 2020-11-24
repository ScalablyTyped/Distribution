package typings.zarinpalCheckout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Authority extends js.Object {
  
  var Amount: String = js.native
  
  var Authority: String = js.native
  
  var Channel: String = js.native
  
  var Date: String = js.native
}
object Authority {
  
  @scala.inline
  def apply(Amount: String, Authority: String, Channel: String, Date: String): Authority = {
    val __obj = js.Dynamic.literal(Amount = Amount.asInstanceOf[js.Any], Authority = Authority.asInstanceOf[js.Any], Channel = Channel.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authority]
  }
  
  @scala.inline
  implicit class AuthorityOps[Self <: Authority] (val x: Self) extends AnyVal {
    
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
    def setAmount(value: String): Self = this.set("Amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthority(value: String): Self = this.set("Authority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannel(value: String): Self = this.set("Channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: String): Self = this.set("Date", value.asInstanceOf[js.Any])
  }
}
