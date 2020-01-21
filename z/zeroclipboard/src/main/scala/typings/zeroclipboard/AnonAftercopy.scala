package typings.zeroclipboard

import typings.zeroclipboard.ZC.EventListenerOrEventListenerObject
import typings.zeroclipboard.ZC.ZeroClipboardAfterCopyEvent
import typings.zeroclipboard.ZC.ZeroClipboardBeforeCopyEvent
import typings.zeroclipboard.ZC.ZeroClipboardCopyEvent
import typings.zeroclipboard.ZC.ZeroClipboardDestroyEvent
import typings.zeroclipboard.ZC.ZeroClipboardErrorEvent
import typings.zeroclipboard.ZC.ZeroClipboardReadyEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAftercopy extends js.Object {
  var aftercopy: js.UndefOr[EventListenerOrEventListenerObject[ZeroClipboardAfterCopyEvent]] = js.undefined
  var beforecopy: js.UndefOr[EventListenerOrEventListenerObject[ZeroClipboardBeforeCopyEvent]] = js.undefined
  var copy: js.UndefOr[EventListenerOrEventListenerObject[ZeroClipboardCopyEvent]] = js.undefined
  var destroy: js.UndefOr[EventListenerOrEventListenerObject[ZeroClipboardDestroyEvent]] = js.undefined
  var error: js.UndefOr[EventListenerOrEventListenerObject[ZeroClipboardErrorEvent]] = js.undefined
  var ready: js.UndefOr[EventListenerOrEventListenerObject[ZeroClipboardReadyEvent]] = js.undefined
}

object AnonAftercopy {
  @scala.inline
  def apply(
    aftercopy: EventListenerOrEventListenerObject[ZeroClipboardAfterCopyEvent] = null,
    beforecopy: EventListenerOrEventListenerObject[ZeroClipboardBeforeCopyEvent] = null,
    copy: EventListenerOrEventListenerObject[ZeroClipboardCopyEvent] = null,
    destroy: EventListenerOrEventListenerObject[ZeroClipboardDestroyEvent] = null,
    error: EventListenerOrEventListenerObject[ZeroClipboardErrorEvent] = null,
    ready: EventListenerOrEventListenerObject[ZeroClipboardReadyEvent] = null
  ): AnonAftercopy = {
    val __obj = js.Dynamic.literal()
    if (aftercopy != null) __obj.updateDynamic("aftercopy")(aftercopy.asInstanceOf[js.Any])
    if (beforecopy != null) __obj.updateDynamic("beforecopy")(beforecopy.asInstanceOf[js.Any])
    if (copy != null) __obj.updateDynamic("copy")(copy.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(destroy.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(ready.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAftercopy]
  }
}

