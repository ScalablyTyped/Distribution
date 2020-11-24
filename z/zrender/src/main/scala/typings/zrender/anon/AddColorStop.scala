package typings.zrender.anon

import typings.zrender.zrender.ColorStops
import typings.zrender.zrender.GlobalCoords
import typings.zrender.zrender.X
import typings.zrender.zrender.X2
import typings.zrender.zrender.Y
import typings.zrender.zrender.Y2
import typings.zrender.zrenderStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddColorStop extends js.Object {
  
  def addColorStop(offset: Double, color: String): Unit = js.native
  
  var colorStops: ColorStops = js.native
  
  var globalCoord: GlobalCoords = js.native
  
  var `type`: linear = js.native
  
  var x: X = js.native
  
  var x2: X2 = js.native
  
  var y: Y = js.native
  
  var y2: Y2 = js.native
}
object AddColorStop {
  
  @scala.inline
  def apply(
    addColorStop: (Double, String) => Unit,
    colorStops: ColorStops,
    globalCoord: GlobalCoords,
    `type`: linear,
    x: X,
    x2: X2,
    y: Y,
    y2: Y2
  ): AddColorStop = {
    val __obj = js.Dynamic.literal(addColorStop = js.Any.fromFunction2(addColorStop), colorStops = colorStops.asInstanceOf[js.Any], globalCoord = globalCoord.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddColorStop]
  }
  
  @scala.inline
  implicit class AddColorStopOps[Self <: AddColorStop] (val x: Self) extends AnyVal {
    
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
    def setAddColorStop(value: (Double, String) => Unit): Self = this.set("addColorStop", js.Any.fromFunction2(value))
    
    @scala.inline
    def setColorStopsVarargs(value: Color*): Self = this.set("colorStops", js.Array(value :_*))
    
    @scala.inline
    def setColorStops(value: ColorStops): Self = this.set("colorStops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalCoord(value: GlobalCoords): Self = this.set("globalCoord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: linear): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: X): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2(value: X2): Self = this.set("x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Y): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2(value: Y2): Self = this.set("y2", value.asInstanceOf[js.Any])
  }
}
