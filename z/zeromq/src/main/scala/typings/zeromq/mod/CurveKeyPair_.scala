package typings.zeromq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurveKeyPair_ extends js.Object {
  
  /**
    * A Z85 string denoting the public portion of the Curve25519 key.
    *
    */
  var public: String = js.native
  
  /**
    * A Z85 string denoting the private, secret portion of the Curve25519 key.
    *
    */
  var secret: String = js.native
}
object CurveKeyPair_ {
  
  @scala.inline
  def apply(public: String, secret: String): CurveKeyPair_ = {
    val __obj = js.Dynamic.literal(public = public.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurveKeyPair_]
  }
  
  @scala.inline
  implicit class CurveKeyPair_Ops[Self <: CurveKeyPair_] (val x: Self) extends AnyVal {
    
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
    def setPublic(value: String): Self = this.set("public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
  }
}
