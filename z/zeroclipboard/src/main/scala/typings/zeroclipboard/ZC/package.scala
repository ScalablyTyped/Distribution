package typings.zeroclipboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ZC {
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  // Generic version EventHandler containers.
  // Mimicking native interfaces in lib.dom.d.ts of the same name.
  type EventListener[T /* <: typings.zeroclipboard.ZC.ZeroClipboardEvent */] = js.Function1[/* ev */ T, scala.Unit]
  type EventListenerOrEventListenerObject[T /* <: typings.zeroclipboard.ZC.ZeroClipboardEvent */] = typings.zeroclipboard.ZC.EventListener[T] | typings.zeroclipboard.ZC.EventListenerObject[T]
  type ZeroClipboardBeforeCopyEvent = typings.zeroclipboard.ZC.ZeroClipboardEvent
}
