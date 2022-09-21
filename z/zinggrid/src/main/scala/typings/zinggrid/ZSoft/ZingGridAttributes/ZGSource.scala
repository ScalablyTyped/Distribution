package typings.zinggrid.ZSoft.ZingGridAttributes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZGSource extends StObject {
  
  /**
    * @description Indicates where to position the source
    */
  var position: js.UndefOr[String] = js.undefined
}
object ZGSource {
  
  inline def apply(): ZGSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZGSource]
  }
  
  extension [Self <: ZGSource](x: Self) {
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
