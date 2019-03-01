package typings
package zeroclipboardLib.ZCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventListenerObject[T /* <: ZeroClipboardEvent */] extends js.Object {
  def handleEvent(ev: T): scala.Unit
}

object EventListenerObject {
  @scala.inline
  def apply[T /* <: ZeroClipboardEvent */](handleEvent: js.Function1[T, scala.Unit]): EventListenerObject[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handleEvent")(handleEvent)
    __obj.asInstanceOf[EventListenerObject[T]]
  }
}

