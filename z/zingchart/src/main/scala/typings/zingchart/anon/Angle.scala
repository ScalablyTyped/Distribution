package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Angle extends StObject {
  
  /**
    * Sets the view angle when using the isometric 3D engine. Value can be between 0 and 90, with the default viewing angle being 45°. 5
    *  | 10 | ...
    */
  var angle: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the Z depth for a 3D chart type displayed in either isometric or true 3D. 5 | 10 | ...
    */
  var depth: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets whether the chart uses a true 3D engine or an isometric view. Disabling true3d forces an isometric view. true | false | 1 | 0
    */
  var true3d: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the X rotation viewing angle for the true 3D view. Viewing angle may vary depending on the chart type. 5 | 10 | ...
    */
  var `x-angle`: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the Y rotation viewing angle for the true 3D view. Viewing angle may vary depending on the chart type. 5 | 10 | ...
    */
  var `y-angle`: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the Z rotation viewing angle for the true 3D view. Viewing angle may vary depending on the chart type. 5 | 10 | ...
    */
  var `z-angle`: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the perspective zoom for the true 3D view. The default zoom level is 1.0. Note that a leading 0 is required before the decima
    * l for values less than 1.0. 1 | 1.5 | 0.8 | ...
    */
  var zoom: js.UndefOr[Double] = js.undefined
}
object Angle {
  
  inline def apply(): Angle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Angle]
  }
  
  extension [Self <: Angle](x: Self) {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setTrue3d(value: Boolean): Self = StObject.set(x, "true3d", value.asInstanceOf[js.Any])
    
    inline def setTrue3dUndefined: Self = StObject.set(x, "true3d", js.undefined)
    
    inline def `setX-angle`(value: Double): Self = StObject.set(x, "x-angle", value.asInstanceOf[js.Any])
    
    inline def `setX-angleUndefined`: Self = StObject.set(x, "x-angle", js.undefined)
    
    inline def `setY-angle`(value: Double): Self = StObject.set(x, "y-angle", value.asInstanceOf[js.Any])
    
    inline def `setY-angleUndefined`: Self = StObject.set(x, "y-angle", js.undefined)
    
    inline def `setZ-angle`(value: Double): Self = StObject.set(x, "z-angle", value.asInstanceOf[js.Any])
    
    inline def `setZ-angleUndefined`: Self = StObject.set(x, "z-angle", js.undefined)
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
