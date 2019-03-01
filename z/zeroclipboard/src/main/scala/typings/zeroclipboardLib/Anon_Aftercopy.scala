package typings
package zeroclipboardLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Aftercopy extends js.Object {
  var aftercopy: js.UndefOr[
    zeroclipboardLib.ZCNs.EventListenerOrEventListenerObject[zeroclipboardLib.ZCNs.ZeroClipboardAfterCopyEvent]
  ] = js.undefined
  var beforecopy: js.UndefOr[
    zeroclipboardLib.ZCNs.EventListenerOrEventListenerObject[zeroclipboardLib.ZCNs.ZeroClipboardBeforeCopyEvent]
  ] = js.undefined
  var copy: js.UndefOr[
    zeroclipboardLib.ZCNs.EventListenerOrEventListenerObject[zeroclipboardLib.ZCNs.ZeroClipboardCopyEvent]
  ] = js.undefined
  var destroy: js.UndefOr[
    zeroclipboardLib.ZCNs.EventListenerOrEventListenerObject[zeroclipboardLib.ZCNs.ZeroClipboardDestroyEvent]
  ] = js.undefined
  var error: js.UndefOr[
    zeroclipboardLib.ZCNs.EventListenerOrEventListenerObject[zeroclipboardLib.ZCNs.ZeroClipboardErrorEvent]
  ] = js.undefined
  var ready: js.UndefOr[
    zeroclipboardLib.ZCNs.EventListenerOrEventListenerObject[zeroclipboardLib.ZCNs.ZeroClipboardReadyEvent]
  ] = js.undefined
}

object Anon_Aftercopy {
  @scala.inline
  def apply(
    aftercopy: zeroclipboardLib.ZCNs.EventListenerOrEventListenerObject[zeroclipboardLib.ZCNs.ZeroClipboardAfterCopyEvent] = null,
    beforecopy: zeroclipboardLib.ZCNs.EventListenerOrEventListenerObject[zeroclipboardLib.ZCNs.ZeroClipboardBeforeCopyEvent] = null,
    copy: zeroclipboardLib.ZCNs.EventListenerOrEventListenerObject[zeroclipboardLib.ZCNs.ZeroClipboardCopyEvent] = null,
    destroy: zeroclipboardLib.ZCNs.EventListenerOrEventListenerObject[zeroclipboardLib.ZCNs.ZeroClipboardDestroyEvent] = null,
    error: zeroclipboardLib.ZCNs.EventListenerOrEventListenerObject[zeroclipboardLib.ZCNs.ZeroClipboardErrorEvent] = null,
    ready: zeroclipboardLib.ZCNs.EventListenerOrEventListenerObject[zeroclipboardLib.ZCNs.ZeroClipboardReadyEvent] = null
  ): Anon_Aftercopy = {
    val __obj = js.Dynamic.literal()
    if (aftercopy != null) __obj.updateDynamic("aftercopy")(aftercopy.asInstanceOf[js.Any])
    if (beforecopy != null) __obj.updateDynamic("beforecopy")(beforecopy.asInstanceOf[js.Any])
    if (copy != null) __obj.updateDynamic("copy")(copy.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(destroy.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(ready.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Aftercopy]
  }
}

