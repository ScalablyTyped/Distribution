package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DroppableOption extends StObject {
  
  var always: js.UndefOr[js.Function1[/* e */ DroppableEvent, Unit]] = js.undefined
  
  var before: js.UndefOr[js.Function1[/* e */ js.UndefOr[DroppableEvent], Boolean]] = js.undefined
  
  var beforeDrop: js.UndefOr[js.Function1[/* e */ DroppableEvent, Boolean]] = js.undefined
  
  var container: js.UndefOr[String] = js.undefined
  
  var deviation: js.UndefOr[Double] = js.undefined
  
  var drag: js.UndefOr[js.Function1[/* e */ DroppableEvent, Unit]] = js.undefined
  
  var drop: js.UndefOr[js.Function1[/* e */ DroppableEvent, Unit]] = js.undefined
  
  var finish: js.UndefOr[js.Function1[/* e */ DroppableEvent, Unit]] = js.undefined
  
  var flex: js.UndefOr[Boolean] = js.undefined
  
  var handle: js.UndefOr[String] = js.undefined
  
  var selector: js.UndefOr[String] = js.undefined
  
  var sensorOffsetX: js.UndefOr[Double] = js.undefined
  
  var sensorOffsetY: js.UndefOr[Double] = js.undefined
  
  var start: js.UndefOr[js.Function1[/* e */ js.UndefOr[DroppableEvent], Unit]] = js.undefined
  
  var target: JQuery | String
}
object DroppableOption {
  
  inline def apply(target: JQuery | String): DroppableOption = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DroppableOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DroppableOption] (val x: Self) extends AnyVal {
    
    inline def setAlways(value: /* e */ DroppableEvent => Unit): Self = StObject.set(x, "always", js.Any.fromFunction1(value))
    
    inline def setAlwaysUndefined: Self = StObject.set(x, "always", js.undefined)
    
    inline def setBefore(value: /* e */ js.UndefOr[DroppableEvent] => Boolean): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
    
    inline def setBeforeDrop(value: /* e */ DroppableEvent => Boolean): Self = StObject.set(x, "beforeDrop", js.Any.fromFunction1(value))
    
    inline def setBeforeDropUndefined: Self = StObject.set(x, "beforeDrop", js.undefined)
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setDeviation(value: Double): Self = StObject.set(x, "deviation", value.asInstanceOf[js.Any])
    
    inline def setDeviationUndefined: Self = StObject.set(x, "deviation", js.undefined)
    
    inline def setDrag(value: /* e */ DroppableEvent => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction1(value))
    
    inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    inline def setDrop(value: /* e */ DroppableEvent => Unit): Self = StObject.set(x, "drop", js.Any.fromFunction1(value))
    
    inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    inline def setFinish(value: /* e */ DroppableEvent => Unit): Self = StObject.set(x, "finish", js.Any.fromFunction1(value))
    
    inline def setFinishUndefined: Self = StObject.set(x, "finish", js.undefined)
    
    inline def setFlex(value: Boolean): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
    
    inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setSensorOffsetX(value: Double): Self = StObject.set(x, "sensorOffsetX", value.asInstanceOf[js.Any])
    
    inline def setSensorOffsetXUndefined: Self = StObject.set(x, "sensorOffsetX", js.undefined)
    
    inline def setSensorOffsetY(value: Double): Self = StObject.set(x, "sensorOffsetY", value.asInstanceOf[js.Any])
    
    inline def setSensorOffsetYUndefined: Self = StObject.set(x, "sensorOffsetY", js.undefined)
    
    inline def setStart(value: /* e */ js.UndefOr[DroppableEvent] => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setTarget(value: JQuery | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
