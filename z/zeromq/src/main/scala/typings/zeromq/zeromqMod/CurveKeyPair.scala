package typings.zeromq.zeromqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurveKeyPair extends js.Object {
  /**
    * A Z85 string denoting the public portion of the Curve25519 key.
    *
    */
  var public: String
  /**
    * A Z85 string denoting the private, secret portion of the Curve25519 key.
    *
    */
  var secret: String
}

object CurveKeyPair {
  @scala.inline
  def apply(public: String, secret: String): CurveKeyPair = {
    val __obj = js.Dynamic.literal(public = public, secret = secret)
  
    __obj.asInstanceOf[CurveKeyPair]
  }
}

