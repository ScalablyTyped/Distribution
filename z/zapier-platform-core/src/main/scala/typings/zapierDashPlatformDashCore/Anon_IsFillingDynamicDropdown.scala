package typings.zapierDashPlatformDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsFillingDynamicDropdown extends js.Object {
  var isFillingDynamicDropdown: Boolean
  var isLoadingSample: Boolean
  var isPopulatingDedupe: Boolean
  var isTestingAuth: Boolean
  var limit: Double
  var page: Double
  var zap: js.UndefOr[Anon_Id] = js.undefined
}

object Anon_IsFillingDynamicDropdown {
  @scala.inline
  def apply(
    isFillingDynamicDropdown: Boolean,
    isLoadingSample: Boolean,
    isPopulatingDedupe: Boolean,
    isTestingAuth: Boolean,
    limit: Double,
    page: Double,
    zap: Anon_Id = null
  ): Anon_IsFillingDynamicDropdown = {
    val __obj = js.Dynamic.literal(isFillingDynamicDropdown = isFillingDynamicDropdown, isLoadingSample = isLoadingSample, isPopulatingDedupe = isPopulatingDedupe, isTestingAuth = isTestingAuth, limit = limit, page = page)
    if (zap != null) __obj.updateDynamic("zap")(zap)
    __obj.asInstanceOf[Anon_IsFillingDynamicDropdown]
  }
}

