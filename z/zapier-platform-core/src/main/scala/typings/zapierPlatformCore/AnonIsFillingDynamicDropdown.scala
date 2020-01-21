package typings.zapierPlatformCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsFillingDynamicDropdown extends js.Object {
  var isFillingDynamicDropdown: Boolean
  var isLoadingSample: Boolean
  var isPopulatingDedupe: Boolean
  var isTestingAuth: Boolean
  var limit: Double
  var page: Double
  var zap: js.UndefOr[AnonId] = js.undefined
}

object AnonIsFillingDynamicDropdown {
  @scala.inline
  def apply(
    isFillingDynamicDropdown: Boolean,
    isLoadingSample: Boolean,
    isPopulatingDedupe: Boolean,
    isTestingAuth: Boolean,
    limit: Double,
    page: Double,
    zap: AnonId = null
  ): AnonIsFillingDynamicDropdown = {
    val __obj = js.Dynamic.literal(isFillingDynamicDropdown = isFillingDynamicDropdown.asInstanceOf[js.Any], isLoadingSample = isLoadingSample.asInstanceOf[js.Any], isPopulatingDedupe = isPopulatingDedupe.asInstanceOf[js.Any], isTestingAuth = isTestingAuth.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    if (zap != null) __obj.updateDynamic("zap")(zap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsFillingDynamicDropdown]
  }
}

