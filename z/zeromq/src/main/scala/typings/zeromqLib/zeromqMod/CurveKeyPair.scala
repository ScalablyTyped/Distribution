package typings
package zeromqLib.zeromqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurveKeyPair extends js.Object {
  /**
    * A Z85 string denoting the public portion of the Curve25519 key.
    *
    */
  var public: java.lang.String
  /**
    * A Z85 string denoting the private, secret portion of the Curve25519 key.
    *
    */
  var secret: java.lang.String
}

object CurveKeyPair {
  @scala.inline
  def apply(public: java.lang.String, secret: java.lang.String): CurveKeyPair = {
    val __obj = js.Dynamic.literal(public = public, secret = secret)
  
    __obj.asInstanceOf[CurveKeyPair]
  }
}

