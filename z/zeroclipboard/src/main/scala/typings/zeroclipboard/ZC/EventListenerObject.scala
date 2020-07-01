package typings.zeroclipboard.ZC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventListenerObject[T /* <: ZeroClipboardEvent */] extends js.Object {
  def handleEvent(ev: T): Unit
}

object EventListenerObject {
  @scala.inline
  def apply[/* <: typings.zeroclipboard.ZC.ZeroClipboardEvent */ T](handleEvent: T => Unit): EventListenerObject[T] = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
    __obj.asInstanceOf[EventListenerObject[T]]
  }
}

