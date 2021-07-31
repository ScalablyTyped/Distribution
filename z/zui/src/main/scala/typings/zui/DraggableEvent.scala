package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DraggableEvent extends StObject {
  
  var element: js.UndefOr[JQuery | js.Object] = js.undefined
  
  var event: js.UndefOr[js.Object] = js.undefined
  
  var offset: js.UndefOr[js.Object] = js.undefined
  
  var pos: js.UndefOr[Postion] = js.undefined
  
  var smallOffset: js.UndefOr[js.Object] = js.undefined
  
  var startOffset: js.UndefOr[js.Object] = js.undefined
  
  var target: js.UndefOr[JQuery | js.Object] = js.undefined
}
object DraggableEvent {
  
  @scala.inline
  def apply(): DraggableEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DraggableEvent]
  }
  
  @scala.inline
  implicit class DraggableEventMutableBuilder[Self <: DraggableEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElement(value: JQuery | js.Object): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setEvent(value: js.Object): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setOffset(value: js.Object): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPos(value: Postion): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosUndefined: Self = StObject.set(x, "pos", js.undefined)
    
    @scala.inline
    def setSmallOffset(value: js.Object): Self = StObject.set(x, "smallOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmallOffsetUndefined: Self = StObject.set(x, "smallOffset", js.undefined)
    
    @scala.inline
    def setStartOffset(value: js.Object): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartOffsetUndefined: Self = StObject.set(x, "startOffset", js.undefined)
    
    @scala.inline
    def setTarget(value: JQuery | js.Object): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
