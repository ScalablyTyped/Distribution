package typings.zdog.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DraggerOptions extends js.Object {
  
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
  implicit class DraggerOptionsOps[Self <: DraggerOptions] (val x: Self) extends AnyVal {
    
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
    def setOnDragEnd(value: DragEndListener): Self = this.set("onDragEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    
    @scala.inline
    def setOnDragMove(value: DragMoveListener): Self = this.set("onDragMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragMove: Self = this.set("onDragMove", js.undefined)
    
    @scala.inline
    def setOnDragStart(value: DragStartListener): Self = this.set("onDragStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    
    @scala.inline
    def setStartElement(value: String | Element): Self = this.set("startElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartElement: Self = this.set("startElement", js.undefined)
  }
}
