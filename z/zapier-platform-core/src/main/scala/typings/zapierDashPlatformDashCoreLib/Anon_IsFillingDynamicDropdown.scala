package typings
package zapierDashPlatformDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsFillingDynamicDropdown extends js.Object {
  var isFillingDynamicDropdown: scala.Boolean
  var isLoadingSample: scala.Boolean
  var isPopulatingDedupe: scala.Boolean
  var isTestingAuth: scala.Boolean
  var limit: scala.Double
  var page: scala.Double
  var zap: js.UndefOr[Anon_Id] = js.undefined
}

object Anon_IsFillingDynamicDropdown {
  @scala.inline
  def apply(
    isFillingDynamicDropdown: scala.Boolean,
    isLoadingSample: scala.Boolean,
    isPopulatingDedupe: scala.Boolean,
    isTestingAuth: scala.Boolean,
    limit: scala.Double,
    page: scala.Double,
    zap: Anon_Id = null
  ): Anon_IsFillingDynamicDropdown = {
    val __obj = js.Dynamic.literal(isFillingDynamicDropdown = isFillingDynamicDropdown, isLoadingSample = isLoadingSample, isPopulatingDedupe = isPopulatingDedupe, isTestingAuth = isTestingAuth, limit = limit, page = page)
    if (zap != null) __obj.updateDynamic("zap")(zap)
    __obj.asInstanceOf[Anon_IsFillingDynamicDropdown]
  }
}

