package typings.zarinpalCheckout

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zarinpal-checkout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(merchantID: String, sandbox: Boolean): ZarinPalInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(merchantID.asInstanceOf[js.Any], sandbox.asInstanceOf[js.Any])).asInstanceOf[ZarinPalInstance]
  
  trait Authority extends StObject {
    
    var Amount: String
    
    var Authority: String
    
    var Channel: String
    
    var Date: String
  }
  object Authority {
    
    inline def apply(Amount: String, Authority: String, Channel: String, Date: String): Authority = {
      val __obj = js.Dynamic.literal(Amount = Amount.asInstanceOf[js.Any], Authority = Authority.asInstanceOf[js.Any], Channel = Channel.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any])
      __obj.asInstanceOf[Authority]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Authority] (val x: Self) extends AnyVal {
      
      inline def setAmount(value: String): Self = StObject.set(x, "Amount", value.asInstanceOf[js.Any])
      
      inline def setAuthority(value: String): Self = StObject.set(x, "Authority", value.asInstanceOf[js.Any])
      
      inline def setChannel(value: String): Self = StObject.set(x, "Channel", value.asInstanceOf[js.Any])
      
      inline def setDate(value: String): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    }
  }
  
  trait PaymentRequestInput extends StObject {
    
    var Amount: Double
    
    var CallbackURL: String
    
    var Description: String
    
    var Email: js.UndefOr[String] = js.undefined
    
    var Mobile: js.UndefOr[String] = js.undefined
  }
  object PaymentRequestInput {
    
    inline def apply(Amount: Double, CallbackURL: String, Description: String): PaymentRequestInput = {
      val __obj = js.Dynamic.literal(Amount = Amount.asInstanceOf[js.Any], CallbackURL = CallbackURL.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaymentRequestInput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaymentRequestInput] (val x: Self) extends AnyVal {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "Amount", value.asInstanceOf[js.Any])
      
      inline def setCallbackURL(value: String): Self = StObject.set(x, "CallbackURL", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "Email", js.undefined)
      
      inline def setMobile(value: String): Self = StObject.set(x, "Mobile", value.asInstanceOf[js.Any])
      
      inline def setMobileUndefined: Self = StObject.set(x, "Mobile", js.undefined)
    }
  }
  
  trait PaymentRequestOutput extends StObject {
    
    var authority: String
    
    var status: Double
    
    var url: String
  }
  object PaymentRequestOutput {
    
    inline def apply(authority: String, status: Double, url: String): PaymentRequestOutput = {
      val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaymentRequestOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaymentRequestOutput] (val x: Self) extends AnyVal {
      
      inline def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait PaymentVerificationInput extends StObject {
    
    var Amount: Double
    
    var Authority: String
  }
  object PaymentVerificationInput {
    
    inline def apply(Amount: Double, Authority: String): PaymentVerificationInput = {
      val __obj = js.Dynamic.literal(Amount = Amount.asInstanceOf[js.Any], Authority = Authority.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaymentVerificationInput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaymentVerificationInput] (val x: Self) extends AnyVal {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "Amount", value.asInstanceOf[js.Any])
      
      inline def setAuthority(value: String): Self = StObject.set(x, "Authority", value.asInstanceOf[js.Any])
    }
  }
  
  trait PaymentVerificationOutput extends StObject {
    
    var RefID: Double
    
    var status: Double
  }
  object PaymentVerificationOutput {
    
    inline def apply(RefID: Double, status: Double): PaymentVerificationOutput = {
      val __obj = js.Dynamic.literal(RefID = RefID.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaymentVerificationOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaymentVerificationOutput] (val x: Self) extends AnyVal {
      
      inline def setRefID(value: Double): Self = StObject.set(x, "RefID", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait RefreshAuthorityInput extends StObject {
    
    var Authority: String
    
    var Expire: Double
  }
  object RefreshAuthorityInput {
    
    inline def apply(Authority: String, Expire: Double): RefreshAuthorityInput = {
      val __obj = js.Dynamic.literal(Authority = Authority.asInstanceOf[js.Any], Expire = Expire.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefreshAuthorityInput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RefreshAuthorityInput] (val x: Self) extends AnyVal {
      
      inline def setAuthority(value: String): Self = StObject.set(x, "Authority", value.asInstanceOf[js.Any])
      
      inline def setExpire(value: Double): Self = StObject.set(x, "Expire", value.asInstanceOf[js.Any])
    }
  }
  
  trait RefreshAuthorityOutput extends StObject {
    
    var status: Double
  }
  object RefreshAuthorityOutput {
    
    inline def apply(status: Double): RefreshAuthorityOutput = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefreshAuthorityOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RefreshAuthorityOutput] (val x: Self) extends AnyVal {
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnverifiedTransactionsOutput extends StObject {
    
    var authorities: js.Array[Authority]
    
    var status: Double
  }
  object UnverifiedTransactionsOutput {
    
    inline def apply(authorities: js.Array[Authority], status: Double): UnverifiedTransactionsOutput = {
      val __obj = js.Dynamic.literal(authorities = authorities.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnverifiedTransactionsOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnverifiedTransactionsOutput] (val x: Self) extends AnyVal {
      
      inline def setAuthorities(value: js.Array[Authority]): Self = StObject.set(x, "authorities", value.asInstanceOf[js.Any])
      
      inline def setAuthoritiesVarargs(value: Authority*): Self = StObject.set(x, "authorities", js.Array(value*))
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait ZarinPalInstance extends StObject {
    
    def PaymentRequest(input: PaymentRequestInput): js.Promise[PaymentRequestOutput]
    
    def PaymentVerification(input: PaymentVerificationInput): js.Promise[PaymentVerificationOutput]
    
    def RefreshAuthority(input: RefreshAuthorityInput): js.Promise[RefreshAuthorityOutput]
    
    def UnverifiedTransactions(): js.Promise[UnverifiedTransactionsOutput]
  }
  object ZarinPalInstance {
    
    inline def apply(
      PaymentRequest: PaymentRequestInput => js.Promise[PaymentRequestOutput],
      PaymentVerification: PaymentVerificationInput => js.Promise[PaymentVerificationOutput],
      RefreshAuthority: RefreshAuthorityInput => js.Promise[RefreshAuthorityOutput],
      UnverifiedTransactions: () => js.Promise[UnverifiedTransactionsOutput]
    ): ZarinPalInstance = {
      val __obj = js.Dynamic.literal(PaymentRequest = js.Any.fromFunction1(PaymentRequest), PaymentVerification = js.Any.fromFunction1(PaymentVerification), RefreshAuthority = js.Any.fromFunction1(RefreshAuthority), UnverifiedTransactions = js.Any.fromFunction0(UnverifiedTransactions))
      __obj.asInstanceOf[ZarinPalInstance]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZarinPalInstance] (val x: Self) extends AnyVal {
      
      inline def setPaymentRequest(value: PaymentRequestInput => js.Promise[PaymentRequestOutput]): Self = StObject.set(x, "PaymentRequest", js.Any.fromFunction1(value))
      
      inline def setPaymentVerification(value: PaymentVerificationInput => js.Promise[PaymentVerificationOutput]): Self = StObject.set(x, "PaymentVerification", js.Any.fromFunction1(value))
      
      inline def setRefreshAuthority(value: RefreshAuthorityInput => js.Promise[RefreshAuthorityOutput]): Self = StObject.set(x, "RefreshAuthority", js.Any.fromFunction1(value))
      
      inline def setUnverifiedTransactions(value: () => js.Promise[UnverifiedTransactionsOutput]): Self = StObject.set(x, "UnverifiedTransactions", js.Any.fromFunction0(value))
    }
  }
}
