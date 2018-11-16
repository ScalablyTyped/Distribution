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

