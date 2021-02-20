package typings.yogaLayout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait YogaConfig extends StObject {
  
  def isExperimentalFeatureEnabled(feature: YogaExperimentalFeature): Boolean = js.native
  
  def setExperimentalFeatureEnabled(feature: YogaExperimentalFeature, enabled: Boolean): Unit = js.native
  
  def setPointScaleFactor(factor: Double): Unit = js.native
}
object YogaConfig {
  
  @scala.inline
  def apply(
    isExperimentalFeatureEnabled: YogaExperimentalFeature => Boolean,
    setExperimentalFeatureEnabled: (YogaExperimentalFeature, Boolean) => Unit,
    setPointScaleFactor: Double => Unit
  ): YogaConfig = {
    val __obj = js.Dynamic.literal(isExperimentalFeatureEnabled = js.Any.fromFunction1(isExperimentalFeatureEnabled), setExperimentalFeatureEnabled = js.Any.fromFunction2(setExperimentalFeatureEnabled), setPointScaleFactor = js.Any.fromFunction1(setPointScaleFactor))
    __obj.asInstanceOf[YogaConfig]
  }
  
  @scala.inline
  implicit class YogaConfigMutableBuilder[Self <: YogaConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsExperimentalFeatureEnabled(value: YogaExperimentalFeature => Boolean): Self = StObject.set(x, "isExperimentalFeatureEnabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetExperimentalFeatureEnabled(value: (YogaExperimentalFeature, Boolean) => Unit): Self = StObject.set(x, "setExperimentalFeatureEnabled", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetPointScaleFactor(value: Double => Unit): Self = StObject.set(x, "setPointScaleFactor", js.Any.fromFunction1(value))
  }
}
