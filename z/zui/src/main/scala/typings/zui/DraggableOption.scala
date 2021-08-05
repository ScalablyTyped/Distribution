package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DraggableOption extends StObject {
  
  var before: js.UndefOr[js.Function1[/* e */ js.UndefOr[DraggableEvent], Boolean]] = js.undefined
  
  var container: js.UndefOr[String] = js.undefined
  
  var drag: js.UndefOr[js.Function1[/* e */ DraggableEvent, Unit]] = js.undefined
  
  var finish: js.UndefOr[js.Function1[/* e */ DraggableEvent, Unit]] = js.undefined
  
  var handle: js.UndefOr[String] = js.undefined
  
  var mouseButton: js.UndefOr[String] = js.undefined
  
  var move: js.UndefOr[Boolean] = js.undefined
  
  var selector: js.UndefOr[String] = js.undefined
  
  var stopPropagation: js.UndefOr[Boolean] = js.undefined
}
object DraggableOption {
  
  inline def apply(): DraggableOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DraggableOption]
  }
  
  extension [Self <: DraggableOption](x: Self) {
    
    inline def setBefore(value: /* e */ js.UndefOr[DraggableEvent] => Boolean): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setDrag(value: /* e */ DraggableEvent => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction1(value))
    
    inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    inline def setFinish(value: /* e */ DraggableEvent => Unit): Self = StObject.set(x, "finish", js.Any.fromFunction1(value))
    
    inline def setFinishUndefined: Self = StObject.set(x, "finish", js.undefined)
    
    inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
    
    inline def setMouseButton(value: String): Self = StObject.set(x, "mouseButton", value.asInstanceOf[js.Any])
    
    inline def setMouseButtonUndefined: Self = StObject.set(x, "mouseButton", js.undefined)
    
    inline def setMove(value: Boolean): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    inline def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setStopPropagation(value: Boolean): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
    
    inline def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
  }
}
