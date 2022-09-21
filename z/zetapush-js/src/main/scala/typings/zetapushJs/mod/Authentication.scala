package typings.zetapushJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zetapush-js", "Authentication")
@js.native
open class Authentication () extends StObject
/* static members */
object Authentication {
  
  @JSImport("zetapush-js", "Authentication")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(authData: AbstractAuthData): CredentialsHandshake | TokenHandshake = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(authData.asInstanceOf[js.Any]).asInstanceOf[CredentialsHandshake | TokenHandshake]
  
  inline def delegating(authData: TokenAuthData): TokenHandshake = ^.asInstanceOf[js.Dynamic].applyDynamic("delegating")(authData.asInstanceOf[js.Any]).asInstanceOf[TokenHandshake]
  
  inline def simple(authData: CredentialsAuthData): CredentialsHandshake = ^.asInstanceOf[js.Dynamic].applyDynamic("simple")(authData.asInstanceOf[js.Any]).asInstanceOf[CredentialsHandshake]
  
  inline def weak(authData: TokenAuthData): TokenHandshake = ^.asInstanceOf[js.Dynamic].applyDynamic("weak")(authData.asInstanceOf[js.Any]).asInstanceOf[TokenHandshake]
}
