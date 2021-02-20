package typings.zarinpalCheckout

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zarinpal-checkout", "create")
  @js.native
  def create(merchantID: String, sandbox: Boolean): ZarinPalInstance = js.native
  
  @js.native
  trait Authority extends StObject {
    
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
    implicit class AuthorityMutableBuilder[Self <: Authority] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: String): Self = StObject.set(x, "Amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthority(value: String): Self = StObject.set(x, "Authority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannel(value: String): Self = StObject.set(x, "Channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PaymentRequestInput extends StObject {
    
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
    implicit class PaymentRequestInputMutableBuilder[Self <: PaymentRequestInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "Amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackURL(value: String): Self = StObject.set(x, "CallbackURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "Email", js.undefined)
      
      @scala.inline
      def setMobile(value: String): Self = StObject.set(x, "Mobile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMobileUndefined: Self = StObject.set(x, "Mobile", js.undefined)
    }
  }
  
  @js.native
  trait PaymentRequestOutput extends StObject {
    
    var authority: String = js.native
    
    var status: Double = js.native
    
    var url: String = js.native
  }
  object PaymentRequestOutput {
    
    @scala.inline
    def apply(authority: String, status: Double, url: String): PaymentRequestOutput = {
      val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaymentRequestOutput]
    }
    
    @scala.inline
    implicit class PaymentRequestOutputMutableBuilder[Self <: PaymentRequestOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PaymentVerificationInput extends StObject {
    
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
    implicit class PaymentVerificationInputMutableBuilder[Self <: PaymentVerificationInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "Amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthority(value: String): Self = StObject.set(x, "Authority", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PaymentVerificationOutput extends StObject {
    
    var RefID: Double = js.native
    
    var status: Double = js.native
  }
  object PaymentVerificationOutput {
    
    @scala.inline
    def apply(RefID: Double, status: Double): PaymentVerificationOutput = {
      val __obj = js.Dynamic.literal(RefID = RefID.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaymentVerificationOutput]
    }
    
    @scala.inline
    implicit class PaymentVerificationOutputMutableBuilder[Self <: PaymentVerificationOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRefID(value: Double): Self = StObject.set(x, "RefID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RefreshAuthorityInput extends StObject {
    
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
    implicit class RefreshAuthorityInputMutableBuilder[Self <: RefreshAuthorityInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthority(value: String): Self = StObject.set(x, "Authority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpire(value: Double): Self = StObject.set(x, "Expire", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RefreshAuthorityOutput extends StObject {
    
    var status: Double = js.native
  }
  object RefreshAuthorityOutput {
    
    @scala.inline
    def apply(status: Double): RefreshAuthorityOutput = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefreshAuthorityOutput]
    }
    
    @scala.inline
    implicit class RefreshAuthorityOutputMutableBuilder[Self <: RefreshAuthorityOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UnverifiedTransactionsOutput extends StObject {
    
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
    implicit class UnverifiedTransactionsOutputMutableBuilder[Self <: UnverifiedTransactionsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorities(value: js.Array[Authority]): Self = StObject.set(x, "authorities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthoritiesVarargs(value: Authority*): Self = StObject.set(x, "authorities", js.Array(value :_*))
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ZarinPalInstance extends StObject {
    
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
    implicit class ZarinPalInstanceMutableBuilder[Self <: ZarinPalInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPaymentRequest(value: PaymentRequestInput => js.Promise[PaymentRequestOutput]): Self = StObject.set(x, "PaymentRequest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPaymentVerification(value: PaymentVerificationInput => js.Promise[PaymentVerificationOutput]): Self = StObject.set(x, "PaymentVerification", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefreshAuthority(value: RefreshAuthorityInput => js.Promise[RefreshAuthorityOutput]): Self = StObject.set(x, "RefreshAuthority", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnverifiedTransactions(value: () => js.Promise[UnverifiedTransactionsOutput]): Self = StObject.set(x, "UnverifiedTransactions", js.Any.fromFunction0(value))
    }
  }
}
