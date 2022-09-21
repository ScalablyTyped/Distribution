package typings.zinggrid.ZSoft.ZingGridAttributes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZGIcon extends StObject {
  
  /**
    * @description Sets the icon type of "<zg-icon>"
    */
  var name: js.UndefOr[String] = js.undefined
}
object ZGIcon {
  
  inline def apply(): ZGIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZGIcon]
  }
  
  extension [Self <: ZGIcon](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
