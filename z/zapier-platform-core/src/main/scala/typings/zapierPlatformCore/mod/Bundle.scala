package typings.zapierPlatformCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.zapierPlatformCore.anon.Id
import typings.zapierPlatformCore.anon.IsFillingDynamicDropdown
import typings.zapierPlatformCore.anon.PartialmethodHttpMethodqu
import typings.zapierPlatformCore.anon.PartialmethodHttpMethodquContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bundle[InputData] extends js.Object {
  var authData: StringDictionary[String] = js.native
  var cleanedRequest: js.UndefOr[PartialmethodHttpMethodquContent | js.Any] = js.native
  var inputData: InputData = js.native
  var inputDataRaw: StringDictionary[String] = js.native
  var meta: IsFillingDynamicDropdown = js.native
  var rawRequest: js.UndefOr[PartialmethodHttpMethodqu] = js.native
  var subscribeData: js.UndefOr[Id] = js.native
  var targetUrl: js.UndefOr[String] = js.native
}

object Bundle {
  @scala.inline
  def apply[InputData](
    authData: StringDictionary[String],
    inputData: InputData,
    inputDataRaw: StringDictionary[String],
    meta: IsFillingDynamicDropdown
  ): Bundle[InputData] = {
    val __obj = js.Dynamic.literal(authData = authData.asInstanceOf[js.Any], inputData = inputData.asInstanceOf[js.Any], inputDataRaw = inputDataRaw.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bundle[InputData]]
  }
  @scala.inline
  implicit class BundleOps[Self <: Bundle[_], InputData] (val x: Self with Bundle[InputData]) extends AnyVal {
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
    def setAuthData(value: StringDictionary[String]): Self = this.set("authData", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputData(value: InputData): Self = this.set("inputData", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputDataRaw(value: StringDictionary[String]): Self = this.set("inputDataRaw", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeta(value: IsFillingDynamicDropdown): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def setCleanedRequest(value: PartialmethodHttpMethodquContent | js.Any): Self = this.set("cleanedRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCleanedRequest: Self = this.set("cleanedRequest", js.undefined)
    @scala.inline
    def setRawRequest(value: PartialmethodHttpMethodqu): Self = this.set("rawRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRawRequest: Self = this.set("rawRequest", js.undefined)
    @scala.inline
    def setSubscribeData(value: Id): Self = this.set("subscribeData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscribeData: Self = this.set("subscribeData", js.undefined)
    @scala.inline
    def setTargetUrl(value: String): Self = this.set("targetUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetUrl: Self = this.set("targetUrl", js.undefined)
  }
  
}

