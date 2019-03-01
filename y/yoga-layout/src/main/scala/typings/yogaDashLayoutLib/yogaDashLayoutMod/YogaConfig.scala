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
    isExperimentalFeatureEnabled: js.Function1[YogaExperimentalFeature, scala.Boolean],
    setExperimentalFeatureEnabled: js.Function2[YogaExperimentalFeature, scala.Boolean, scala.Unit],
    setPointScaleFactor: js.Function1[scala.Double, scala.Unit]
  ): YogaConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isExperimentalFeatureEnabled")(isExperimentalFeatureEnabled)
    __obj.updateDynamic("setExperimentalFeatureEnabled")(setExperimentalFeatureEnabled)
    __obj.updateDynamic("setPointScaleFactor")(setPointScaleFactor)
    __obj.asInstanceOf[YogaConfig]
  }
}

