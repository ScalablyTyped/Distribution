package typings.zoomist.anon

import typings.std.Event
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Destroy extends StObject {
  
  var destroy: js.Array[js.Function0[Unit]]
  
  var drag: js.Array[js.Function2[/* transform */ js.UndefOr[X], /* event */ js.UndefOr[Event], Unit]]
  
  var dragEnd: js.Array[js.Function2[/* transform */ js.UndefOr[X], /* event */ js.UndefOr[Event], Unit]]
  
  var dragStart: js.Array[js.Function2[/* transform */ js.UndefOr[X], /* event */ js.UndefOr[Event], Unit]]
  
  var pinch: js.Array[js.Function1[/* event */ js.UndefOr[Event], Unit]]
  
  var pinchEnd: js.Array[js.Function1[/* event */ js.UndefOr[Event], Unit]]
  
  var pinchStart: js.Array[js.Function1[/* event */ js.UndefOr[Event], Unit]]
  
  var ready: js.Array[js.Function0[Unit]]
  
  var reset: js.Array[js.Function0[Unit]]
  
  var resize: js.Array[js.Function0[Unit]]
  
  var slide: js.Array[
    js.Function2[/* value */ js.UndefOr[Double], /* event */ js.UndefOr[Event], Unit]
  ]
  
  var slideEnd: js.Array[
    js.Function2[/* value */ js.UndefOr[Double], /* event */ js.UndefOr[Event], Unit]
  ]
  
  var slideStart: js.Array[
    js.Function2[/* value */ js.UndefOr[Double], /* event */ js.UndefOr[Event], Unit]
  ]
  
  var update: js.Array[js.Function0[Unit]]
  
  var wheel: js.Array[js.Function1[/* event */ js.UndefOr[WheelEvent], Unit]]
  
  var zoom: js.Array[js.Function1[/* ratio */ js.UndefOr[Double], Unit]]
}
object Destroy {
  
  inline def apply(
    destroy: js.Array[js.Function0[Unit]],
    drag: js.Array[js.Function2[/* transform */ js.UndefOr[X], /* event */ js.UndefOr[Event], Unit]],
    dragEnd: js.Array[js.Function2[/* transform */ js.UndefOr[X], /* event */ js.UndefOr[Event], Unit]],
    dragStart: js.Array[js.Function2[/* transform */ js.UndefOr[X], /* event */ js.UndefOr[Event], Unit]],
    pinch: js.Array[js.Function1[/* event */ js.UndefOr[Event], Unit]],
    pinchEnd: js.Array[js.Function1[/* event */ js.UndefOr[Event], Unit]],
    pinchStart: js.Array[js.Function1[/* event */ js.UndefOr[Event], Unit]],
    ready: js.Array[js.Function0[Unit]],
    reset: js.Array[js.Function0[Unit]],
    resize: js.Array[js.Function0[Unit]],
    slide: js.Array[
      js.Function2[/* value */ js.UndefOr[Double], /* event */ js.UndefOr[Event], Unit]
    ],
    slideEnd: js.Array[
      js.Function2[/* value */ js.UndefOr[Double], /* event */ js.UndefOr[Event], Unit]
    ],
    slideStart: js.Array[
      js.Function2[/* value */ js.UndefOr[Double], /* event */ js.UndefOr[Event], Unit]
    ],
    update: js.Array[js.Function0[Unit]],
    wheel: js.Array[js.Function1[/* event */ js.UndefOr[WheelEvent], Unit]],
    zoom: js.Array[js.Function1[/* ratio */ js.UndefOr[Double], Unit]]
  ): Destroy = {
    val __obj = js.Dynamic.literal(destroy = destroy.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragEnd = dragEnd.asInstanceOf[js.Any], dragStart = dragStart.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], pinchEnd = pinchEnd.asInstanceOf[js.Any], pinchStart = pinchStart.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], slide = slide.asInstanceOf[js.Any], slideEnd = slideEnd.asInstanceOf[js.Any], slideStart = slideStart.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Destroy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Destroy] (val x: Self) extends AnyVal {
    
    inline def setDestroy(value: js.Array[js.Function0[Unit]]): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    inline def setDestroyVarargs(value: js.Function0[Unit]*): Self = StObject.set(x, "destroy", js.Array(value*))
    
    inline def setDrag(value: js.Array[js.Function2[/* transform */ js.UndefOr[X], /* event */ js.UndefOr[Event], Unit]]): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    inline def setDragEnd(value: js.Array[js.Function2[/* transform */ js.UndefOr[X], /* event */ js.UndefOr[Event], Unit]]): Self = StObject.set(x, "dragEnd", value.asInstanceOf[js.Any])
    
    inline def setDragEndVarargs(value: (js.Function2[/* transform */ js.UndefOr[X], /* event */ js.UndefOr[Event], Unit])*): Self = StObject.set(x, "dragEnd", js.Array(value*))
    
    inline def setDragStart(value: js.Array[js.Function2[/* transform */ js.UndefOr[X], /* event */ js.UndefOr[Event], Unit]]): Self = StObject.set(x, "dragStart", value.asInstanceOf[js.Any])
    
    inline def setDragStartVarargs(value: (js.Function2[/* transform */ js.UndefOr[X], /* event */ js.UndefOr[Event], Unit])*): Self = StObject.set(x, "dragStart", js.Array(value*))
    
    inline def setDragVarargs(value: (js.Function2[/* transform */ js.UndefOr[X], /* event */ js.UndefOr[Event], Unit])*): Self = StObject.set(x, "drag", js.Array(value*))
    
    inline def setPinch(value: js.Array[js.Function1[/* event */ js.UndefOr[Event], Unit]]): Self = StObject.set(x, "pinch", value.asInstanceOf[js.Any])
    
    inline def setPinchEnd(value: js.Array[js.Function1[/* event */ js.UndefOr[Event], Unit]]): Self = StObject.set(x, "pinchEnd", value.asInstanceOf[js.Any])
    
    inline def setPinchEndVarargs(value: (js.Function1[/* event */ js.UndefOr[Event], Unit])*): Self = StObject.set(x, "pinchEnd", js.Array(value*))
    
    inline def setPinchStart(value: js.Array[js.Function1[/* event */ js.UndefOr[Event], Unit]]): Self = StObject.set(x, "pinchStart", value.asInstanceOf[js.Any])
    
    inline def setPinchStartVarargs(value: (js.Function1[/* event */ js.UndefOr[Event], Unit])*): Self = StObject.set(x, "pinchStart", js.Array(value*))
    
    inline def setPinchVarargs(value: (js.Function1[/* event */ js.UndefOr[Event], Unit])*): Self = StObject.set(x, "pinch", js.Array(value*))
    
    inline def setReady(value: js.Array[js.Function0[Unit]]): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    
    inline def setReadyVarargs(value: js.Function0[Unit]*): Self = StObject.set(x, "ready", js.Array(value*))
    
    inline def setReset(value: js.Array[js.Function0[Unit]]): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    inline def setResetVarargs(value: js.Function0[Unit]*): Self = StObject.set(x, "reset", js.Array(value*))
    
    inline def setResize(value: js.Array[js.Function0[Unit]]): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    inline def setResizeVarargs(value: js.Function0[Unit]*): Self = StObject.set(x, "resize", js.Array(value*))
    
    inline def setSlide(
      value: js.Array[
          js.Function2[/* value */ js.UndefOr[Double], /* event */ js.UndefOr[Event], Unit]
        ]
    ): Self = StObject.set(x, "slide", value.asInstanceOf[js.Any])
    
    inline def setSlideEnd(
      value: js.Array[
          js.Function2[/* value */ js.UndefOr[Double], /* event */ js.UndefOr[Event], Unit]
        ]
    ): Self = StObject.set(x, "slideEnd", value.asInstanceOf[js.Any])
    
    inline def setSlideEndVarargs(value: (js.Function2[/* value */ js.UndefOr[Double], /* event */ js.UndefOr[Event], Unit])*): Self = StObject.set(x, "slideEnd", js.Array(value*))
    
    inline def setSlideStart(
      value: js.Array[
          js.Function2[/* value */ js.UndefOr[Double], /* event */ js.UndefOr[Event], Unit]
        ]
    ): Self = StObject.set(x, "slideStart", value.asInstanceOf[js.Any])
    
    inline def setSlideStartVarargs(value: (js.Function2[/* value */ js.UndefOr[Double], /* event */ js.UndefOr[Event], Unit])*): Self = StObject.set(x, "slideStart", js.Array(value*))
    
    inline def setSlideVarargs(value: (js.Function2[/* value */ js.UndefOr[Double], /* event */ js.UndefOr[Event], Unit])*): Self = StObject.set(x, "slide", js.Array(value*))
    
    inline def setUpdate(value: js.Array[js.Function0[Unit]]): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateVarargs(value: js.Function0[Unit]*): Self = StObject.set(x, "update", js.Array(value*))
    
    inline def setWheel(value: js.Array[js.Function1[/* event */ js.UndefOr[WheelEvent], Unit]]): Self = StObject.set(x, "wheel", value.asInstanceOf[js.Any])
    
    inline def setWheelVarargs(value: (js.Function1[/* event */ js.UndefOr[WheelEvent], Unit])*): Self = StObject.set(x, "wheel", js.Array(value*))
    
    inline def setZoom(value: js.Array[js.Function1[/* ratio */ js.UndefOr[Double], Unit]]): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomVarargs(value: (js.Function1[/* ratio */ js.UndefOr[Double], Unit])*): Self = StObject.set(x, "zoom", js.Array(value*))
  }
}
