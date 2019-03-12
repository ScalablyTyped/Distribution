package typings
package youtubeDashPlayerLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmitterType extends js.Object {
  def trigger(eventName: java.lang.String, event: js.Object): scala.Unit
}

object EmitterType {
  @scala.inline
  def apply(trigger: (java.lang.String, js.Object) => scala.Unit): EmitterType = {
    val __obj = js.Dynamic.literal(trigger = js.Any.fromFunction2(trigger))
  
    __obj.asInstanceOf[EmitterType]
  }
}

