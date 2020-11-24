package typings.zarinpalCheckout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefreshAuthorityInput extends js.Object {
  
  var Authority: String = js.native
  
  var Expire: Double = js.native
}
object RefreshAuthorityInput {
  
  @scala.inline
  def apply(Authority: String, Expire: Double): RefreshAuthorityInput = {
    val __obj = js.Dynamic.literal(Authority = Authority.asInstanceOf[js.Any], Expire = Expire.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshAuthorityInput]
  }
  
  @scala.inline
  implicit class RefreshAuthorityInputOps[Self <: RefreshAuthorityInput] (val x: Self) extends AnyVal {
    
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
    def setAuthority(value: String): Self = this.set("Authority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpire(value: Double): Self = this.set("Expire", value.asInstanceOf[js.Any])
  }
}
