package typings.zeromq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurveKeyPair_ extends js.Object {
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

object CurveKeyPair_ {
  @scala.inline
  def apply(public: String, secret: String): CurveKeyPair_ = {
    val __obj = js.Dynamic.literal(public = public.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurveKeyPair_]
  }
}

