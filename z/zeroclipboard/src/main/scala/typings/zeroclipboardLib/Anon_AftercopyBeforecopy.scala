package typings
package zeroclipboardLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AftercopyBeforecopy extends js.Object {
  var aftercopy: js.UndefOr[
    js.Array[
      zeroclipboardLib.ZCNs.EventListenerOrEventListenerObject[zeroclipboardLib.ZCNs.ZeroClipboardAfterCopyEvent]
    ]
  ] = js.undefined
  var beforecopy: js.UndefOr[
    js.Array[
      zeroclipboardLib.ZCNs.EventListenerOrEventListenerObject[zeroclipboardLib.ZCNs.ZeroClipboardBeforeCopyEvent]
    ]
  ] = js.undefined
  var copy: js.UndefOr[
    js.Array[
      zeroclipboardLib.ZCNs.EventListenerOrEventListenerObject[zeroclipboardLib.ZCNs.ZeroClipboardCopyEvent]
    ]
  ] = js.undefined
  var destroy: js.UndefOr[
    js.Array[
      zeroclipboardLib.ZCNs.EventListenerOrEventListenerObject[zeroclipboardLib.ZCNs.ZeroClipboardDestroyEvent]
    ]
  ] = js.undefined
  var error: js.UndefOr[
    js.Array[
      zeroclipboardLib.ZCNs.EventListenerOrEventListenerObject[zeroclipboardLib.ZCNs.ZeroClipboardErrorEvent]
    ]
  ] = js.undefined
  var ready: js.UndefOr[
    js.Array[
      zeroclipboardLib.ZCNs.EventListenerOrEventListenerObject[zeroclipboardLib.ZCNs.ZeroClipboardReadyEvent]
    ]
  ] = js.undefined
}

object Anon_AftercopyBeforecopy {
  @scala.inline
  def apply(
    aftercopy: js.Array[
      zeroclipboardLib.ZCNs.EventListenerOrEventListenerObject[zeroclipboardLib.ZCNs.ZeroClipboardAfterCopyEvent]
    ] = null,
    beforecopy: js.Array[
      zeroclipboardLib.ZCNs.EventListenerOrEventListenerObject[zeroclipboardLib.ZCNs.ZeroClipboardBeforeCopyEvent]
    ] = null,
    copy: js.Array[
      zeroclipboardLib.ZCNs.EventListenerOrEventListenerObject[zeroclipboardLib.ZCNs.ZeroClipboardCopyEvent]
    ] = null,
    destroy: js.Array[
      zeroclipboardLib.ZCNs.EventListenerOrEventListenerObject[zeroclipboardLib.ZCNs.ZeroClipboardDestroyEvent]
    ] = null,
    error: js.Array[
      zeroclipboardLib.ZCNs.EventListenerOrEventListenerObject[zeroclipboardLib.ZCNs.ZeroClipboardErrorEvent]
    ] = null,
    ready: js.Array[
      zeroclipboardLib.ZCNs.EventListenerOrEventListenerObject[zeroclipboardLib.ZCNs.ZeroClipboardReadyEvent]
    ] = null
  ): Anon_AftercopyBeforecopy = {
    val __obj = js.Dynamic.literal()
    if (aftercopy != null) __obj.updateDynamic("aftercopy")(aftercopy)
    if (beforecopy != null) __obj.updateDynamic("beforecopy")(beforecopy)
    if (copy != null) __obj.updateDynamic("copy")(copy)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (error != null) __obj.updateDynamic("error")(error)
    if (ready != null) __obj.updateDynamic("ready")(ready)
    __obj.asInstanceOf[Anon_AftercopyBeforecopy]
  }
}

