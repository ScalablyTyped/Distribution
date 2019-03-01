package typings
package zipkinLib.zipkinMod.zipkinNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InetAddress extends js.Object {
  def ipv4(): java.lang.String
  def toInt(): scala.Double
}

object InetAddress {
  @scala.inline
  def apply(ipv4: js.Function0[java.lang.String], toInt: js.Function0[scala.Double]): InetAddress = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ipv4")(ipv4)
    __obj.updateDynamic("toInt")(toInt)
    __obj.asInstanceOf[InetAddress]
  }
}

