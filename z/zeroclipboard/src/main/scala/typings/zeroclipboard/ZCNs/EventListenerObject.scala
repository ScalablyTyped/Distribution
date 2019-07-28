package typings.zeroclipboard.ZCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventListenerObject[T /* <: ZeroClipboardEvent */] extends js.Object {
  def handleEvent(ev: T): Unit
}

object EventListenerObject {
  @scala.inline
  def apply[T /* <: ZeroClipboardEvent */](handleEvent: T => Unit): EventListenerObject[T] = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
  
    __obj.asInstanceOf[EventListenerObject[T]]
  }
}

