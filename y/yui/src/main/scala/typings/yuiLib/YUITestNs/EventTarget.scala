package typings
package yuiLib.YUITestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTarget extends js.Object {
  def attach(`type`: java.lang.String, listener: js.Function): scala.Unit = js.native
  def detach(`type`: java.lang.String, listener: js.Function): scala.Unit = js.native
  def fire(event: java.lang.String): scala.Unit = js.native
  def fire(event: js.Object): scala.Unit = js.native
  def subscribe(`type`: java.lang.String, listener: js.Function): scala.Unit = js.native
  def unsubscribe(`type`: java.lang.String, listener: js.Function): scala.Unit = js.native
}

