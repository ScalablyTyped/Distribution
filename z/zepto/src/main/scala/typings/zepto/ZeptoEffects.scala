package typings.zepto

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZeptoEffects extends StObject {
  
  /**
    * (default false in browsers that support CSS transitions): set to true to disable all animate() transitions.
    **/
  var off: Boolean
  
  /**
    * An object with duration settings for animations.
    * Change existing values or add new properties to affect animations that use a string for setting duration.
    **/
  var speeds: ZeptoEffectsSpeeds
}
object ZeptoEffects {
  
  inline def apply(off: Boolean, speeds: ZeptoEffectsSpeeds): ZeptoEffects = {
    val __obj = js.Dynamic.literal(off = off.asInstanceOf[js.Any], speeds = speeds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZeptoEffects]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZeptoEffects] (val x: Self) extends AnyVal {
    
    inline def setOff(value: Boolean): Self = StObject.set(x, "off", value.asInstanceOf[js.Any])
    
    inline def setSpeeds(value: ZeptoEffectsSpeeds): Self = StObject.set(x, "speeds", value.asInstanceOf[js.Any])
  }
}
