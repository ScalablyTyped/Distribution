package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Angle extends js.Object {
  
  /**
    * Sets the view angle when using the isometric 3D engine. Value can be between 0 and 90, with the default viewing angle being 45°. 5
    *  | 10 | ...
    */
  var angle: js.UndefOr[Double] = js.native
  
  /**
    * Sets the Z depth for a 3D chart type displayed in either isometric or true 3D. 5 | 10 | ...
    */
  var depth: js.UndefOr[Double] = js.native
  
  /**
    * Sets whether the chart uses a true 3D engine or an isometric view. Disabling true3d forces an isometric view. true | false | 1 | 0
    */
  var true3d: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the X rotation viewing angle for the true 3D view. Viewing angle may vary depending on the chart type. 5 | 10 | ...
    */
  var `x-angle`: js.UndefOr[Double] = js.native
  
  /**
    * Sets the Y rotation viewing angle for the true 3D view. Viewing angle may vary depending on the chart type. 5 | 10 | ...
    */
  var `y-angle`: js.UndefOr[Double] = js.native
  
  /**
    * Sets the Z rotation viewing angle for the true 3D view. Viewing angle may vary depending on the chart type. 5 | 10 | ...
    */
  var `z-angle`: js.UndefOr[Double] = js.native
  
  /**
    * Sets the perspective zoom for the true 3D view. The default zoom level is 1.0. Note that a leading 0 is required before the decima
    * l for values less than 1.0. 1 | 1.5 | 0.8 | ...
    */
  var zoom: js.UndefOr[Double] = js.native
}
object Angle {
  
  @scala.inline
  def apply(): Angle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Angle]
  }
  
  @scala.inline
  implicit class AngleOps[Self <: Angle] (val x: Self) extends AnyVal {
    
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
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    
    @scala.inline
    def setTrue3d(value: Boolean): Self = this.set("true3d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrue3d: Self = this.set("true3d", js.undefined)
    
    @scala.inline
    def `setX-angle`(value: Double): Self = this.set("x-angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteX-angle`: Self = this.set("x-angle", js.undefined)
    
    @scala.inline
    def `setY-angle`(value: Double): Self = this.set("y-angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteY-angle`: Self = this.set("y-angle", js.undefined)
    
    @scala.inline
    def `setZ-angle`(value: Double): Self = this.set("z-angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteZ-angle`: Self = this.set("z-angle", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
}
