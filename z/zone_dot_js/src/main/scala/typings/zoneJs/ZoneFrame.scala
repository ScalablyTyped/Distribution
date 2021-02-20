package typings.zoneJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _ZoneFrame represents zone stack frame information
  */
@js.native
trait ZoneFrame extends StObject {
  
  var parent: ZoneFrame | Null = js.native
  
  var zone: Zone = js.native
}
object ZoneFrame {
  
  @scala.inline
  def apply(zone: Zone): ZoneFrame = {
    val __obj = js.Dynamic.literal(zone = zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoneFrame]
  }
  
  @scala.inline
  implicit class ZoneFrameMutableBuilder[Self <: ZoneFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParent(value: ZoneFrame): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNull: Self = StObject.set(x, "parent", null)
    
    @scala.inline
    def setZone(value: Zone): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
  }
}
