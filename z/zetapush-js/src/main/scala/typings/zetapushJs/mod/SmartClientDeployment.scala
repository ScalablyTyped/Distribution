package typings.zetapushJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartClientDeployment extends StObject {
  
  var simple: js.UndefOr[String] = js.undefined
  
  var weak: js.UndefOr[String] = js.undefined
}
object SmartClientDeployment {
  
  inline def apply(): SmartClientDeployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmartClientDeployment]
  }
  
  extension [Self <: SmartClientDeployment](x: Self) {
    
    inline def setSimple(value: String): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
    
    inline def setSimpleUndefined: Self = StObject.set(x, "simple", js.undefined)
    
    inline def setWeak(value: String): Self = StObject.set(x, "weak", value.asInstanceOf[js.Any])
    
    inline def setWeakUndefined: Self = StObject.set(x, "weak", js.undefined)
  }
}
