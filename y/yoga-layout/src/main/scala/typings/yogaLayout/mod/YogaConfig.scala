package typings.yogaLayout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait YogaConfig extends StObject {
  
  def isExperimentalFeatureEnabled(feature: YogaExperimentalFeature): Boolean
  
  def setExperimentalFeatureEnabled(feature: YogaExperimentalFeature, enabled: Boolean): Unit
  
  def setPointScaleFactor(factor: Double): Unit
}
object YogaConfig {
  
  inline def apply(
    isExperimentalFeatureEnabled: YogaExperimentalFeature => Boolean,
    setExperimentalFeatureEnabled: (YogaExperimentalFeature, Boolean) => Unit,
    setPointScaleFactor: Double => Unit
  ): YogaConfig = {
    val __obj = js.Dynamic.literal(isExperimentalFeatureEnabled = js.Any.fromFunction1(isExperimentalFeatureEnabled), setExperimentalFeatureEnabled = js.Any.fromFunction2(setExperimentalFeatureEnabled), setPointScaleFactor = js.Any.fromFunction1(setPointScaleFactor))
    __obj.asInstanceOf[YogaConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: YogaConfig] (val x: Self) extends AnyVal {
    
    inline def setIsExperimentalFeatureEnabled(value: YogaExperimentalFeature => Boolean): Self = StObject.set(x, "isExperimentalFeatureEnabled", js.Any.fromFunction1(value))
    
    inline def setSetExperimentalFeatureEnabled(value: (YogaExperimentalFeature, Boolean) => Unit): Self = StObject.set(x, "setExperimentalFeatureEnabled", js.Any.fromFunction2(value))
    
    inline def setSetPointScaleFactor(value: Double => Unit): Self = StObject.set(x, "setPointScaleFactor", js.Any.fromFunction1(value))
  }
}
