package typings.zapierPlatformCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsFillingDynamicDropdown extends js.Object {
  var isFillingDynamicDropdown: Boolean = js.native
  var isLoadingSample: Boolean = js.native
  var isPopulatingDedupe: Boolean = js.native
  var isTestingAuth: Boolean = js.native
  var limit: Double = js.native
  var page: Double = js.native
  var zap: js.UndefOr[Id] = js.native
}

object IsFillingDynamicDropdown {
  @scala.inline
  def apply(
    isFillingDynamicDropdown: Boolean,
    isLoadingSample: Boolean,
    isPopulatingDedupe: Boolean,
    isTestingAuth: Boolean,
    limit: Double,
    page: Double
  ): IsFillingDynamicDropdown = {
    val __obj = js.Dynamic.literal(isFillingDynamicDropdown = isFillingDynamicDropdown.asInstanceOf[js.Any], isLoadingSample = isLoadingSample.asInstanceOf[js.Any], isPopulatingDedupe = isPopulatingDedupe.asInstanceOf[js.Any], isTestingAuth = isTestingAuth.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsFillingDynamicDropdown]
  }
  @scala.inline
  implicit class IsFillingDynamicDropdownOps[Self <: IsFillingDynamicDropdown] (val x: Self) extends AnyVal {
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
    def setIsFillingDynamicDropdown(value: Boolean): Self = this.set("isFillingDynamicDropdown", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsLoadingSample(value: Boolean): Self = this.set("isLoadingSample", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPopulatingDedupe(value: Boolean): Self = this.set("isPopulatingDedupe", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsTestingAuth(value: Boolean): Self = this.set("isTestingAuth", value.asInstanceOf[js.Any])
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def setZap(value: Id): Self = this.set("zap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZap: Self = this.set("zap", js.undefined)
  }
  
}

