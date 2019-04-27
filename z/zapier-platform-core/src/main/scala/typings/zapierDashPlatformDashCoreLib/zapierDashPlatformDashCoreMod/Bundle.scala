package typings
package zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bundle[InputData] extends js.Object {
  var authData: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var cleanedRequest: js.UndefOr[stdLib.Partial[zapierDashPlatformDashCoreLib.Anon_ContentHeaders] | js.Any] = js.undefined
  var inputData: InputData
  var inputDataRaw: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var meta: zapierDashPlatformDashCoreLib.Anon_IsFillingDynamicDropdown
  var rawRequest: js.UndefOr[stdLib.Partial[zapierDashPlatformDashCoreLib.Anon_Content]] = js.undefined
  var subscribeData: js.UndefOr[zapierDashPlatformDashCoreLib.Anon_Id] = js.undefined
  var targetUrl: js.UndefOr[java.lang.String] = js.undefined
}

object Bundle {
  @scala.inline
  def apply[InputData](
    authData: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    inputData: InputData,
    inputDataRaw: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    meta: zapierDashPlatformDashCoreLib.Anon_IsFillingDynamicDropdown,
    cleanedRequest: stdLib.Partial[zapierDashPlatformDashCoreLib.Anon_ContentHeaders] | js.Any = null,
    rawRequest: stdLib.Partial[zapierDashPlatformDashCoreLib.Anon_Content] = null,
    subscribeData: zapierDashPlatformDashCoreLib.Anon_Id = null,
    targetUrl: java.lang.String = null
  ): Bundle[InputData] = {
    val __obj = js.Dynamic.literal(authData = authData, inputData = inputData.asInstanceOf[js.Any], inputDataRaw = inputDataRaw, meta = meta)
    if (cleanedRequest != null) __obj.updateDynamic("cleanedRequest")(cleanedRequest.asInstanceOf[js.Any])
    if (rawRequest != null) __obj.updateDynamic("rawRequest")(rawRequest)
    if (subscribeData != null) __obj.updateDynamic("subscribeData")(subscribeData)
    if (targetUrl != null) __obj.updateDynamic("targetUrl")(targetUrl)
    __obj.asInstanceOf[Bundle[InputData]]
  }
}

