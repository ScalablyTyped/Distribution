package typings
package zetapushDashJsLib.zetapushDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zetapush-js", "Authentication")
@js.native
class Authentication () extends js.Object

/* static members */
@JSImport("zetapush-js", "Authentication")
@js.native
object Authentication extends js.Object {
  def create(authData: zetapushDashJsLib.zetapushDashJsMod.AbstractAuthData): zetapushDashJsLib.zetapushDashJsMod.CredentialsHandshake | zetapushDashJsLib.zetapushDashJsMod.TokenHandshake = js.native
  def delegating(authData: zetapushDashJsLib.zetapushDashJsMod.TokenAuthData): zetapushDashJsLib.zetapushDashJsMod.TokenHandshake = js.native
  def simple(authData: zetapushDashJsLib.zetapushDashJsMod.CredentialsAuthData): zetapushDashJsLib.zetapushDashJsMod.CredentialsHandshake = js.native
  def weak(authData: zetapushDashJsLib.zetapushDashJsMod.TokenAuthData): zetapushDashJsLib.zetapushDashJsMod.TokenHandshake = js.native
}

