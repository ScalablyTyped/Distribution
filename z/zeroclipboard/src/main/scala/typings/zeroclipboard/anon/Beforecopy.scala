package typings.zeroclipboard.anon

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

@js.native
trait Beforecopy extends js.Object {
  var aftercopy: js.UndefOr[js.Array[EventListenerOrEventListenerObject[ZeroClipboardAfterCopyEvent]]] = js.native
  var beforecopy: js.UndefOr[js.Array[EventListenerOrEventListenerObject[ZeroClipboardBeforeCopyEvent]]] = js.native
  var copy: js.UndefOr[js.Array[EventListenerOrEventListenerObject[ZeroClipboardCopyEvent]]] = js.native
  var destroy: js.UndefOr[js.Array[EventListenerOrEventListenerObject[ZeroClipboardDestroyEvent]]] = js.native
  var error: js.UndefOr[js.Array[EventListenerOrEventListenerObject[ZeroClipboardErrorEvent]]] = js.native
  var ready: js.UndefOr[js.Array[EventListenerOrEventListenerObject[ZeroClipboardReadyEvent]]] = js.native
}

object Beforecopy {
  @scala.inline
  def apply(): Beforecopy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Beforecopy]
  }
  @scala.inline
  implicit class BeforecopyOps[Self <: Beforecopy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAftercopyVarargs(value: EventListenerOrEventListenerObject[ZeroClipboardAfterCopyEvent]*): Self = this.set("aftercopy", js.Array(value :_*))
    @scala.inline
    def setAftercopy(value: js.Array[EventListenerOrEventListenerObject[ZeroClipboardAfterCopyEvent]]): Self = this.set("aftercopy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAftercopy: Self = this.set("aftercopy", js.undefined)
    @scala.inline
    def setBeforecopyVarargs(value: EventListenerOrEventListenerObject[ZeroClipboardBeforeCopyEvent]*): Self = this.set("beforecopy", js.Array(value :_*))
    @scala.inline
    def setBeforecopy(value: js.Array[EventListenerOrEventListenerObject[ZeroClipboardBeforeCopyEvent]]): Self = this.set("beforecopy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforecopy: Self = this.set("beforecopy", js.undefined)
    @scala.inline
    def setCopyVarargs(value: EventListenerOrEventListenerObject[ZeroClipboardCopyEvent]*): Self = this.set("copy", js.Array(value :_*))
    @scala.inline
    def setCopy(value: js.Array[EventListenerOrEventListenerObject[ZeroClipboardCopyEvent]]): Self = this.set("copy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopy: Self = this.set("copy", js.undefined)
    @scala.inline
    def setDestroyVarargs(value: EventListenerOrEventListenerObject[ZeroClipboardDestroyEvent]*): Self = this.set("destroy", js.Array(value :_*))
    @scala.inline
    def setDestroy(value: js.Array[EventListenerOrEventListenerObject[ZeroClipboardDestroyEvent]]): Self = this.set("destroy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setErrorVarargs(value: EventListenerOrEventListenerObject[ZeroClipboardErrorEvent]*): Self = this.set("error", js.Array(value :_*))
    @scala.inline
    def setError(value: js.Array[EventListenerOrEventListenerObject[ZeroClipboardErrorEvent]]): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setReadyVarargs(value: EventListenerOrEventListenerObject[ZeroClipboardReadyEvent]*): Self = this.set("ready", js.Array(value :_*))
    @scala.inline
    def setReady(value: js.Array[EventListenerOrEventListenerObject[ZeroClipboardReadyEvent]]): Self = this.set("ready", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReady: Self = this.set("ready", js.undefined)
  }
  
}

