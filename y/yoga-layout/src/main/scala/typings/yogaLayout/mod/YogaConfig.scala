package typings.yogaLayout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YogaConfig extends js.Object {
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
  implicit class YogaConfigOps[Self <: YogaConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsExperimentalFeatureEnabled(value: YogaExperimentalFeature => Boolean): Self = this.set("isExperimentalFeatureEnabled", js.Any.fromFunction1(value))
    @scala.inline
    def setSetExperimentalFeatureEnabled(value: (YogaExperimentalFeature, Boolean) => Unit): Self = this.set("setExperimentalFeatureEnabled", js.Any.fromFunction2(value))
    @scala.inline
    def setSetPointScaleFactor(value: Double => Unit): Self = this.set("setPointScaleFactor", js.Any.fromFunction1(value))
  }
  
}

