package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DroppableEvent extends StObject {
  
  var element: js.UndefOr[JQuery] = js.undefined
  
  var event: js.UndefOr[js.Object] = js.undefined
  
  var offset: js.UndefOr[js.Object] = js.undefined
  
  var pos: js.UndefOr[Postion] = js.undefined
  
  var smallOffset: js.UndefOr[js.Object] = js.undefined
  
  var startOffset: js.UndefOr[js.Object] = js.undefined
  
  var target: js.UndefOr[JQuery] = js.undefined
}
object DroppableEvent {
  
  inline def apply(): DroppableEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DroppableEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DroppableEvent] (val x: Self) extends AnyVal {
    
    inline def setElement(value: JQuery): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setEvent(value: js.Object): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setOffset(value: js.Object): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPos(value: Postion): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    inline def setPosUndefined: Self = StObject.set(x, "pos", js.undefined)
    
    inline def setSmallOffset(value: js.Object): Self = StObject.set(x, "smallOffset", value.asInstanceOf[js.Any])
    
    inline def setSmallOffsetUndefined: Self = StObject.set(x, "smallOffset", js.undefined)
    
    inline def setStartOffset(value: js.Object): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    
    inline def setStartOffsetUndefined: Self = StObject.set(x, "startOffset", js.undefined)
    
    inline def setTarget(value: JQuery): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
