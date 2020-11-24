package typings.zarinpalCheckout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZarinPalInstance extends js.Object {
  
  def PaymentRequest(input: PaymentRequestInput): js.Promise[PaymentRequestOutput] = js.native
  
  def PaymentVerification(input: PaymentVerificationInput): js.Promise[PaymentVerificationOutput] = js.native
  
  def RefreshAuthority(input: RefreshAuthorityInput): js.Promise[RefreshAuthorityOutput] = js.native
  
  def UnverifiedTransactions(): js.Promise[UnverifiedTransactionsOutput] = js.native
}
object ZarinPalInstance {
  
  @scala.inline
  def apply(
    PaymentRequest: PaymentRequestInput => js.Promise[PaymentRequestOutput],
    PaymentVerification: PaymentVerificationInput => js.Promise[PaymentVerificationOutput],
    RefreshAuthority: RefreshAuthorityInput => js.Promise[RefreshAuthorityOutput],
    UnverifiedTransactions: () => js.Promise[UnverifiedTransactionsOutput]
  ): ZarinPalInstance = {
    val __obj = js.Dynamic.literal(PaymentRequest = js.Any.fromFunction1(PaymentRequest), PaymentVerification = js.Any.fromFunction1(PaymentVerification), RefreshAuthority = js.Any.fromFunction1(RefreshAuthority), UnverifiedTransactions = js.Any.fromFunction0(UnverifiedTransactions))
    __obj.asInstanceOf[ZarinPalInstance]
  }
  
  @scala.inline
  implicit class ZarinPalInstanceOps[Self <: ZarinPalInstance] (val x: Self) extends AnyVal {
    
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
    def setPaymentRequest(value: PaymentRequestInput => js.Promise[PaymentRequestOutput]): Self = this.set("PaymentRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPaymentVerification(value: PaymentVerificationInput => js.Promise[PaymentVerificationOutput]): Self = this.set("PaymentVerification", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefreshAuthority(value: RefreshAuthorityInput => js.Promise[RefreshAuthorityOutput]): Self = this.set("RefreshAuthority", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnverifiedTransactions(value: () => js.Promise[UnverifiedTransactionsOutput]): Self = this.set("UnverifiedTransactions", js.Any.fromFunction0(value))
  }
}
