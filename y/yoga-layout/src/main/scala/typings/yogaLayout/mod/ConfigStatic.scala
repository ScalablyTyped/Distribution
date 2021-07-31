package typings.yogaLayout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigStatic extends StObject {
  
  def create(): YogaConfig
  
  def destroy(config: YogaConfig): js.Any
}
object ConfigStatic {
  
  @scala.inline
  def apply(create: () => YogaConfig, destroy: YogaConfig => js.Any): ConfigStatic = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), destroy = js.Any.fromFunction1(destroy))
    __obj.asInstanceOf[ConfigStatic]
  }
  
  @scala.inline
  implicit class ConfigStaticMutableBuilder[Self <: ConfigStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: () => YogaConfig): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDestroy(value: YogaConfig => js.Any): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
  }
}
