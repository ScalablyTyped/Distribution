package typings.zeroclipboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ZCNs {
  import org.scalablytyped.runtime.StringDictionary

  type Dictionary[T] = StringDictionary[T]
  // Generic version EventHandler containers.
  // Mimicking native interfaces in lib.dom.d.ts of the same name.
  type EventListener[T /* <: ZeroClipboardEvent */] = js.Function1[/* ev */ T, Unit]
  type EventListenerOrEventListenerObject[T /* <: ZeroClipboardEvent */] = EventListener[T] | EventListenerObject[T]
  type ZeroClipboardBeforeCopyEvent = ZeroClipboardEvent
}
