package typings.zumly.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait zumly extends js.Object {
  
  def init(): js.Promise[Unit] = js.native
  
  def zoomIn(el: Element): js.Promise[Unit] = js.native
  
  def zoomLevel(): Double = js.native
  
  def zoomOut(): Unit = js.native
}
object zumly {
  
  @scala.inline
  def apply(
    init: () => js.Promise[Unit],
    zoomIn: Element => js.Promise[Unit],
    zoomLevel: () => Double,
    zoomOut: () => Unit
  ): zumly = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init), zoomIn = js.Any.fromFunction1(zoomIn), zoomLevel = js.Any.fromFunction0(zoomLevel), zoomOut = js.Any.fromFunction0(zoomOut))
    __obj.asInstanceOf[zumly]
  }
  
  @scala.inline
  implicit class zumlyOps[Self <: zumly] (val x: Self) extends AnyVal {
    
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
    def setInit(value: () => js.Promise[Unit]): Self = this.set("init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setZoomIn(value: Element => js.Promise[Unit]): Self = this.set("zoomIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setZoomLevel(value: () => Double): Self = this.set("zoomLevel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setZoomOut(value: () => Unit): Self = this.set("zoomOut", js.Any.fromFunction0(value))
  }
}
