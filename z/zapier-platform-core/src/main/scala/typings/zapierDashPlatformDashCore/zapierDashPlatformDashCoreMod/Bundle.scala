package typings.zapierDashPlatformDashCore.zapierDashPlatformDashCoreMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import typings.zapierDashPlatformDashCore.Anon_Content
import typings.zapierDashPlatformDashCore.Anon_ContentHeaders
import typings.zapierDashPlatformDashCore.Anon_Id
import typings.zapierDashPlatformDashCore.Anon_IsFillingDynamicDropdown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bundle[InputData] extends js.Object {
  var authData: StringDictionary[String]
  var cleanedRequest: js.UndefOr[Partial[Anon_ContentHeaders] | js.Any] = js.undefined
  var inputData: InputData
  var inputDataRaw: StringDictionary[String]
  var meta: Anon_IsFillingDynamicDropdown
  var rawRequest: js.UndefOr[Partial[Anon_Content]] = js.undefined
  var subscribeData: js.UndefOr[Anon_Id] = js.undefined
  var targetUrl: js.UndefOr[String] = js.undefined
}

object Bundle {
  @scala.inline
  def apply[InputData](
    authData: StringDictionary[String],
    inputData: InputData,
    inputDataRaw: StringDictionary[String],
    meta: Anon_IsFillingDynamicDropdown,
    cleanedRequest: Partial[Anon_ContentHeaders] | js.Any = null,
    rawRequest: Partial[Anon_Content] = null,
    subscribeData: Anon_Id = null,
    targetUrl: String = null
  ): Bundle[InputData] = {
    val __obj = js.Dynamic.literal(authData = authData, inputData = inputData.asInstanceOf[js.Any], inputDataRaw = inputDataRaw, meta = meta)
    if (cleanedRequest != null) __obj.updateDynamic("cleanedRequest")(cleanedRequest.asInstanceOf[js.Any])
    if (rawRequest != null) __obj.updateDynamic("rawRequest")(rawRequest)
    if (subscribeData != null) __obj.updateDynamic("subscribeData")(subscribeData)
    if (targetUrl != null) __obj.updateDynamic("targetUrl")(targetUrl)
    __obj.asInstanceOf[Bundle[InputData]]
  }
}

