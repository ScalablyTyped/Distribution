package typings.zetapushJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zetapush-js", "Authentication")
@js.native
class Authentication () extends StObject
/* static members */
object Authentication {
  
  @JSImport("zetapush-js", "Authentication.create")
  @js.native
  def create(authData: AbstractAuthData): CredentialsHandshake | TokenHandshake = js.native
  
  @JSImport("zetapush-js", "Authentication.delegating")
  @js.native
  def delegating(authData: TokenAuthData): TokenHandshake = js.native
  
  @JSImport("zetapush-js", "Authentication.simple")
  @js.native
  def simple(authData: CredentialsAuthData): CredentialsHandshake = js.native
  
  @JSImport("zetapush-js", "Authentication.weak")
  @js.native
  def weak(authData: TokenAuthData): TokenHandshake = js.native
}
