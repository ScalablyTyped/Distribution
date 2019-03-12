package typings
package yogaDashLayoutLib.yogaDashLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YogaConfig extends js.Object {
  def isExperimentalFeatureEnabled(feature: YogaExperimentalFeature): scala.Boolean
  def setExperimentalFeatureEnabled(feature: YogaExperimentalFeature, enabled: scala.Boolean): scala.Unit
  def setPointScaleFactor(factor: scala.Double): scala.Unit
}

object YogaConfig {
  @scala.inline
  def apply(
    isExperimentalFeatureEnabled: YogaExperimentalFeature => scala.Boolean,
    setExperimentalFeatureEnabled: (YogaExperimentalFeature, scala.Boolean) => scala.Unit,
    setPointScaleFactor: scala.Double => scala.Unit
  ): YogaConfig = {
    val __obj = js.Dynamic.literal(isExperimentalFeatureEnabled = js.Any.fromFunction1(isExperimentalFeatureEnabled), setExperimentalFeatureEnabled = js.Any.fromFunction2(setExperimentalFeatureEnabled), setPointScaleFactor = js.Any.fromFunction1(setPointScaleFactor))
  
    __obj.asInstanceOf[YogaConfig]
  }
}

