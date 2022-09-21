package typings.zeroclipboard

import typings.zeroclipboard.ZC.Dictionary
import typings.zeroclipboard.ZC.EventListenerOrEventListenerObject
import typings.zeroclipboard.ZC.ZeroClipboardAfterCopyEvent
import typings.zeroclipboard.ZC.ZeroClipboardBeforeCopyEvent
import typings.zeroclipboard.ZC.ZeroClipboardCopyEvent
import typings.zeroclipboard.ZC.ZeroClipboardDestroyEvent
import typings.zeroclipboard.ZC.ZeroClipboardErrorEvent
import typings.zeroclipboard.ZC.ZeroClipboardReadyEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Aftercopy extends StObject {
    
    var aftercopy: js.UndefOr[EventListenerOrEventListenerObject[ZeroClipboardAfterCopyEvent]] = js.undefined
    
    var beforecopy: js.UndefOr[EventListenerOrEventListenerObject[ZeroClipboardBeforeCopyEvent]] = js.undefined
    
    var copy: js.UndefOr[EventListenerOrEventListenerObject[ZeroClipboardCopyEvent]] = js.undefined
    
    var destroy: js.UndefOr[EventListenerOrEventListenerObject[ZeroClipboardDestroyEvent]] = js.undefined
    
    var error: js.UndefOr[EventListenerOrEventListenerObject[ZeroClipboardErrorEvent]] = js.undefined
    
    var ready: js.UndefOr[EventListenerOrEventListenerObject[ZeroClipboardReadyEvent]] = js.undefined
  }
  object Aftercopy {
    
    inline def apply(): Aftercopy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Aftercopy]
    }
    
    extension [Self <: Aftercopy](x: Self) {
      
      inline def setAftercopy(value: EventListenerOrEventListenerObject[ZeroClipboardAfterCopyEvent]): Self = StObject.set(x, "aftercopy", value.asInstanceOf[js.Any])
      
      inline def setAftercopyFunction1(value: ZeroClipboardAfterCopyEvent => Unit): Self = StObject.set(x, "aftercopy", js.Any.fromFunction1(value))
      
      inline def setAftercopyUndefined: Self = StObject.set(x, "aftercopy", js.undefined)
      
      inline def setBeforecopy(value: EventListenerOrEventListenerObject[ZeroClipboardBeforeCopyEvent]): Self = StObject.set(x, "beforecopy", value.asInstanceOf[js.Any])
      
      inline def setBeforecopyFunction1(value: ZeroClipboardBeforeCopyEvent => Unit): Self = StObject.set(x, "beforecopy", js.Any.fromFunction1(value))
      
      inline def setBeforecopyUndefined: Self = StObject.set(x, "beforecopy", js.undefined)
      
      inline def setCopy(value: EventListenerOrEventListenerObject[ZeroClipboardCopyEvent]): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      inline def setCopyFunction1(value: ZeroClipboardCopyEvent => Unit): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
      
      inline def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      inline def setDestroy(value: EventListenerOrEventListenerObject[ZeroClipboardDestroyEvent]): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
      
      inline def setDestroyFunction1(value: ZeroClipboardDestroyEvent => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setError(value: EventListenerOrEventListenerObject[ZeroClipboardErrorEvent]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorFunction1(value: ZeroClipboardErrorEvent => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setReady(value: EventListenerOrEventListenerObject[ZeroClipboardReadyEvent]): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
      
      inline def setReadyFunction1(value: ZeroClipboardReadyEvent => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction1(value))
      
      inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    }
  }
  
  trait Beforecopy extends StObject {
    
    var aftercopy: js.UndefOr[js.Array[EventListenerOrEventListenerObject[ZeroClipboardAfterCopyEvent]]] = js.undefined
    
    var beforecopy: js.UndefOr[js.Array[EventListenerOrEventListenerObject[ZeroClipboardBeforeCopyEvent]]] = js.undefined
    
    var copy: js.UndefOr[js.Array[EventListenerOrEventListenerObject[ZeroClipboardCopyEvent]]] = js.undefined
    
    var destroy: js.UndefOr[js.Array[EventListenerOrEventListenerObject[ZeroClipboardDestroyEvent]]] = js.undefined
    
    var error: js.UndefOr[js.Array[EventListenerOrEventListenerObject[ZeroClipboardErrorEvent]]] = js.undefined
    
    var ready: js.UndefOr[js.Array[EventListenerOrEventListenerObject[ZeroClipboardReadyEvent]]] = js.undefined
  }
  object Beforecopy {
    
    inline def apply(): Beforecopy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Beforecopy]
    }
    
    extension [Self <: Beforecopy](x: Self) {
      
      inline def setAftercopy(value: js.Array[EventListenerOrEventListenerObject[ZeroClipboardAfterCopyEvent]]): Self = StObject.set(x, "aftercopy", value.asInstanceOf[js.Any])
      
      inline def setAftercopyUndefined: Self = StObject.set(x, "aftercopy", js.undefined)
      
      inline def setAftercopyVarargs(value: EventListenerOrEventListenerObject[ZeroClipboardAfterCopyEvent]*): Self = StObject.set(x, "aftercopy", js.Array(value*))
      
      inline def setBeforecopy(value: js.Array[EventListenerOrEventListenerObject[ZeroClipboardBeforeCopyEvent]]): Self = StObject.set(x, "beforecopy", value.asInstanceOf[js.Any])
      
      inline def setBeforecopyUndefined: Self = StObject.set(x, "beforecopy", js.undefined)
      
      inline def setBeforecopyVarargs(value: EventListenerOrEventListenerObject[ZeroClipboardBeforeCopyEvent]*): Self = StObject.set(x, "beforecopy", js.Array(value*))
      
      inline def setCopy(value: js.Array[EventListenerOrEventListenerObject[ZeroClipboardCopyEvent]]): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      inline def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      inline def setCopyVarargs(value: EventListenerOrEventListenerObject[ZeroClipboardCopyEvent]*): Self = StObject.set(x, "copy", js.Array(value*))
      
      inline def setDestroy(value: js.Array[EventListenerOrEventListenerObject[ZeroClipboardDestroyEvent]]): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setDestroyVarargs(value: EventListenerOrEventListenerObject[ZeroClipboardDestroyEvent]*): Self = StObject.set(x, "destroy", js.Array(value*))
      
      inline def setError(value: js.Array[EventListenerOrEventListenerObject[ZeroClipboardErrorEvent]]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setErrorVarargs(value: EventListenerOrEventListenerObject[ZeroClipboardErrorEvent]*): Self = StObject.set(x, "error", js.Array(value*))
      
      inline def setReady(value: js.Array[EventListenerOrEventListenerObject[ZeroClipboardReadyEvent]]): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
      
      inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
      
      inline def setReadyVarargs(value: EventListenerOrEventListenerObject[ZeroClipboardReadyEvent]*): Self = StObject.set(x, "ready", js.Array(value*))
    }
  }
  
  @js.native
  trait ClearData extends StObject {
    
    def clearData(): Unit = js.native
    def clearData(mimeType: String): Unit = js.native
    
    def setData(data: Dictionary[String]): Unit = js.native
    def setData(format: String, data: String): Unit = js.native
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var `type`: String
  }
  object Name {
    
    inline def apply(name: String, `type`: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
