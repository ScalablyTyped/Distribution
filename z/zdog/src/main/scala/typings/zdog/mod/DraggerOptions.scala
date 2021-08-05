package typings.zdog.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DraggerOptions extends StObject {
  
  val onDragEnd: js.UndefOr[DragEndListener] = js.undefined
  
  val onDragMove: js.UndefOr[DragMoveListener] = js.undefined
  
  val onDragStart: js.UndefOr[DragStartListener] = js.undefined
  
  /**
    * The element to start dragging on the initial `mousedown`, `pointerdown`, or `touchstart` event.
    */
  val startElement: js.UndefOr[String | Element] = js.undefined
}
object DraggerOptions {
  
  inline def apply(): DraggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DraggerOptions]
  }
  
  extension [Self <: DraggerOptions](x: Self) {
    
    inline def setOnDragEnd(value: DragEndListener): Self = StObject.set(x, "onDragEnd", value.asInstanceOf[js.Any])
    
    inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    inline def setOnDragMove(value: DragMoveListener): Self = StObject.set(x, "onDragMove", value.asInstanceOf[js.Any])
    
    inline def setOnDragMoveUndefined: Self = StObject.set(x, "onDragMove", js.undefined)
    
    inline def setOnDragStart(value: DragStartListener): Self = StObject.set(x, "onDragStart", value.asInstanceOf[js.Any])
    
    inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    inline def setStartElement(value: String | Element): Self = StObject.set(x, "startElement", value.asInstanceOf[js.Any])
    
    inline def setStartElementUndefined: Self = StObject.set(x, "startElement", js.undefined)
  }
}
