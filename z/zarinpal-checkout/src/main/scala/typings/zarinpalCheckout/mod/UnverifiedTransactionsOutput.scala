package typings.zarinpalCheckout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnverifiedTransactionsOutput extends js.Object {
  
  var authorities: js.Array[Authority] = js.native
  
  var status: Double = js.native
}
object UnverifiedTransactionsOutput {
  
  @scala.inline
  def apply(authorities: js.Array[Authority], status: Double): UnverifiedTransactionsOutput = {
    val __obj = js.Dynamic.literal(authorities = authorities.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnverifiedTransactionsOutput]
  }
  
  @scala.inline
  implicit class UnverifiedTransactionsOutputOps[Self <: UnverifiedTransactionsOutput] (val x: Self) extends AnyVal {
    
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
    def setAuthoritiesVarargs(value: Authority*): Self = this.set("authorities", js.Array(value :_*))
    
    @scala.inline
    def setAuthorities(value: js.Array[Authority]): Self = this.set("authorities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
