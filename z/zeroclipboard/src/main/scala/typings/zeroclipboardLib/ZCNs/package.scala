package typings
package zeroclipboardLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ZCNs {
  // Generic version EventHandler containers.
  // Mimicking native interfaces in lib.dom.d.ts of the same name.
  type EventListener[T /* <: ZeroClipboardEvent */] = js.Function1[/* ev */ T, scala.Unit]
  type EventListenerOrEventListenerObject[T /* <: ZeroClipboardEvent */] = EventListener[T] | EventListenerObject[T]
  type ZeroClipboardBeforeCopyEvent = ZeroClipboardEvent
}
