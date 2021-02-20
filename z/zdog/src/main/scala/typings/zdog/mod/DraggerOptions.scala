package typings.zdog.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DraggerOptions extends StObject {
  
  val onDragEnd: js.UndefOr[DragEndListener] = js.native
  
  val onDragMove: js.UndefOr[DragMoveListener] = js.native
  
  val onDragStart: js.UndefOr[DragStartListener] = js.native
  
  /**
    * The element to start dragging on the initial `mousedown`, `pointerdown`, or `touchstart` event.
    */
  val startElement: js.UndefOr[String | Element] = js.native
}
object DraggerOptions {
  
  @scala.inline
  def apply(): DraggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DraggerOptions]
  }
  
  @scala.inline
  implicit class DraggerOptionsMutableBuilder[Self <: DraggerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnDragEnd(value: DragEndListener): Self = StObject.set(x, "onDragEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    @scala.inline
    def setOnDragMove(value: DragMoveListener): Self = StObject.set(x, "onDragMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDragMoveUndefined: Self = StObject.set(x, "onDragMove", js.undefined)
    
    @scala.inline
    def setOnDragStart(value: DragStartListener): Self = StObject.set(x, "onDragStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    @scala.inline
    def setStartElement(value: String | Element): Self = StObject.set(x, "startElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartElementUndefined: Self = StObject.set(x, "startElement", js.undefined)
  }
}
