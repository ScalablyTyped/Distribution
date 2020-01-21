package typings.yogaLayout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YogaConfig extends js.Object {
  def isExperimentalFeatureEnabled(feature: YogaExperimentalFeature): Boolean
  def setExperimentalFeatureEnabled(feature: YogaExperimentalFeature, enabled: Boolean): Unit
  def setPointScaleFactor(factor: Double): Unit
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
}

