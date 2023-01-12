package typings.youtube.YT

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SphericalProperties extends StObject {
  
  var enableOrientationSensor: js.UndefOr[Boolean] = js.undefined
  
  var fov: js.UndefOr[Double] = js.undefined
  
  var pitch: js.UndefOr[Double] = js.undefined
  
  var roll: js.UndefOr[Double] = js.undefined
  
  var yaw: js.UndefOr[Double] = js.undefined
}
object SphericalProperties {
  
  inline def apply(): SphericalProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SphericalProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SphericalProperties] (val x: Self) extends AnyVal {
    
    inline def setEnableOrientationSensor(value: Boolean): Self = StObject.set(x, "enableOrientationSensor", value.asInstanceOf[js.Any])
    
    inline def setEnableOrientationSensorUndefined: Self = StObject.set(x, "enableOrientationSensor", js.undefined)
    
    inline def setFov(value: Double): Self = StObject.set(x, "fov", value.asInstanceOf[js.Any])
    
    inline def setFovUndefined: Self = StObject.set(x, "fov", js.undefined)
    
    inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    inline def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
    
    inline def setRoll(value: Double): Self = StObject.set(x, "roll", value.asInstanceOf[js.Any])
    
    inline def setRollUndefined: Self = StObject.set(x, "roll", js.undefined)
    
    inline def setYaw(value: Double): Self = StObject.set(x, "yaw", value.asInstanceOf[js.Any])
    
    inline def setYawUndefined: Self = StObject.set(x, "yaw", js.undefined)
  }
}
