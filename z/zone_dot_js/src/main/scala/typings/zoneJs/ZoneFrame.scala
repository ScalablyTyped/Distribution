package typings.zoneJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _ZoneFrame represents zone stack frame information
  */
trait ZoneFrame extends StObject {
  
  var parent: ZoneFrame | Null
  
  var zone: Zone
}
object ZoneFrame {
  
  inline def apply(zone: Zone): ZoneFrame = {
    val __obj = js.Dynamic.literal(zone = zone.asInstanceOf[js.Any], parent = null)
    __obj.asInstanceOf[ZoneFrame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZoneFrame] (val x: Self) extends AnyVal {
    
    inline def setParent(value: ZoneFrame): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setZone(value: Zone): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
  }
}
