package typings.yogaLayout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigStatic extends StObject {
  
  def create(): YogaConfig
  
  def destroy(config: YogaConfig): Any
}
object ConfigStatic {
  
  inline def apply(create: () => YogaConfig, destroy: YogaConfig => Any): ConfigStatic = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), destroy = js.Any.fromFunction1(destroy))
    __obj.asInstanceOf[ConfigStatic]
  }
  
  extension [Self <: ConfigStatic](x: Self) {
    
    inline def setCreate(value: () => YogaConfig): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
    
    inline def setDestroy(value: YogaConfig => Any): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
  }
}
