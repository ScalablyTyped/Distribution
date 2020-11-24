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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Aftercopy extends js.Object {
  
  var aftercopy: js.UndefOr[EventListenerOrEventListenerObject[ZeroClipboardAfterCopyEvent]] = js.native
  
  var beforecopy: js.UndefOr[EventListenerOrEventListenerObject[ZeroClipboardBeforeCopyEvent]] = js.native
  
  var copy: js.UndefOr[EventListenerOrEventListenerObject[ZeroClipboardCopyEvent]] = js.native
  
  var destroy: js.UndefOr[EventListenerOrEventListenerObject[ZeroClipboardDestroyEvent]] = js.native
  
  var error: js.UndefOr[EventListenerOrEventListenerObject[ZeroClipboardErrorEvent]] = js.native
  
  var ready: js.UndefOr[EventListenerOrEventListenerObject[ZeroClipboardReadyEvent]] = js.native
}
object Aftercopy {
  
  @scala.inline
  def apply(): Aftercopy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Aftercopy]
  }
  
  @scala.inline
  implicit class AftercopyOps[Self <: Aftercopy] (val x: Self) extends AnyVal {
    
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
    def setAftercopyFunction1(value: ZeroClipboardAfterCopyEvent => Unit): Self = this.set("aftercopy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAftercopy(value: EventListenerOrEventListenerObject[ZeroClipboardAfterCopyEvent]): Self = this.set("aftercopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAftercopy: Self = this.set("aftercopy", js.undefined)
    
    @scala.inline
    def setBeforecopyFunction1(value: ZeroClipboardBeforeCopyEvent => Unit): Self = this.set("beforecopy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforecopy(value: EventListenerOrEventListenerObject[ZeroClipboardBeforeCopyEvent]): Self = this.set("beforecopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforecopy: Self = this.set("beforecopy", js.undefined)
    
    @scala.inline
    def setCopyFunction1(value: ZeroClipboardCopyEvent => Unit): Self = this.set("copy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCopy(value: EventListenerOrEventListenerObject[ZeroClipboardCopyEvent]): Self = this.set("copy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopy: Self = this.set("copy", js.undefined)
    
    @scala.inline
    def setDestroyFunction1(value: ZeroClipboardDestroyEvent => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroy(value: EventListenerOrEventListenerObject[ZeroClipboardDestroyEvent]): Self = this.set("destroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setErrorFunction1(value: ZeroClipboardErrorEvent => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setError(value: EventListenerOrEventListenerObject[ZeroClipboardErrorEvent]): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setReadyFunction1(value: ZeroClipboardReadyEvent => Unit): Self = this.set("ready", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReady(value: EventListenerOrEventListenerObject[ZeroClipboardReadyEvent]): Self = this.set("ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReady: Self = this.set("ready", js.undefined)
  }
}
