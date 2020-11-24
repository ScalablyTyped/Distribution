package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DroppableOption extends js.Object {
  
  var always: js.UndefOr[js.Function1[/* e */ DroppableEvent, Unit]] = js.native
  
  var before: js.UndefOr[js.Function1[/* e */ js.UndefOr[DroppableEvent], Boolean]] = js.native
  
  var beforeDrop: js.UndefOr[js.Function1[/* e */ DroppableEvent, Boolean]] = js.native
  
  var container: js.UndefOr[String] = js.native
  
  var deviation: js.UndefOr[Double] = js.native
  
  var drag: js.UndefOr[js.Function1[/* e */ DroppableEvent, Unit]] = js.native
  
  var drop: js.UndefOr[js.Function1[/* e */ DroppableEvent, Unit]] = js.native
  
  var finish: js.UndefOr[js.Function1[/* e */ DroppableEvent, Unit]] = js.native
  
  var flex: js.UndefOr[Boolean] = js.native
  
  var handle: js.UndefOr[String] = js.native
  
  var selector: js.UndefOr[String] = js.native
  
  var sensorOffsetX: js.UndefOr[Double] = js.native
  
  var sensorOffsetY: js.UndefOr[Double] = js.native
  
  var start: js.UndefOr[js.Function1[/* e */ js.UndefOr[DroppableEvent], Unit]] = js.native
  
  var target: JQuery | String = js.native
}
object DroppableOption {
  
  @scala.inline
  def apply(target: JQuery | String): DroppableOption = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DroppableOption]
  }
  
  @scala.inline
  implicit class DroppableOptionOps[Self <: DroppableOption] (val x: Self) extends AnyVal {
    
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
    def setTarget(value: JQuery | String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlways(value: /* e */ DroppableEvent => Unit): Self = this.set("always", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAlways: Self = this.set("always", js.undefined)
    
    @scala.inline
    def setBefore(value: /* e */ js.UndefOr[DroppableEvent] => Boolean): Self = this.set("before", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    
    @scala.inline
    def setBeforeDrop(value: /* e */ DroppableEvent => Boolean): Self = this.set("beforeDrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeDrop: Self = this.set("beforeDrop", js.undefined)
    
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setDeviation(value: Double): Self = this.set("deviation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviation: Self = this.set("deviation", js.undefined)
    
    @scala.inline
    def setDrag(value: /* e */ DroppableEvent => Unit): Self = this.set("drag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    
    @scala.inline
    def setDrop(value: /* e */ DroppableEvent => Unit): Self = this.set("drop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrop: Self = this.set("drop", js.undefined)
    
    @scala.inline
    def setFinish(value: /* e */ DroppableEvent => Unit): Self = this.set("finish", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFinish: Self = this.set("finish", js.undefined)
    
    @scala.inline
    def setFlex(value: Boolean): Self = this.set("flex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlex: Self = this.set("flex", js.undefined)
    
    @scala.inline
    def setHandle(value: String): Self = this.set("handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandle: Self = this.set("handle", js.undefined)
    
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    
    @scala.inline
    def setSensorOffsetX(value: Double): Self = this.set("sensorOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSensorOffsetX: Self = this.set("sensorOffsetX", js.undefined)
    
    @scala.inline
    def setSensorOffsetY(value: Double): Self = this.set("sensorOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSensorOffsetY: Self = this.set("sensorOffsetY", js.undefined)
    
    @scala.inline
    def setStart(value: /* e */ js.UndefOr[DroppableEvent] => Unit): Self = this.set("start", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
}
