package typings
package zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HttpRequestOptions extends js.Object {
  var agent: js.UndefOr[nodeLib.httpMod.Agent | scala.Null] = js.undefined
  var body: js.UndefOr[
    java.lang.String | nodeLib.Buffer | nodeLib.NodeJSNs.ReadableStream | js.Object | scala.Null
  ] = js.undefined
  var compress: js.UndefOr[scala.Boolean] = js.undefined
  var follow: js.UndefOr[scala.Double] = js.undefined
  var form: js.UndefOr[js.Object | scala.Null] = js.undefined
  var headers: js.UndefOr[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var json: js.UndefOr[js.Object | js.Array[_] | scala.Null] = js.undefined
  var method: js.UndefOr[
    zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreLibStrings.POST | zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreLibStrings.GET | zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreLibStrings.OPTIONS | zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreLibStrings.HEAD | zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreLibStrings.DELETE | zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreLibStrings.PATCH | zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreLibStrings.PUT
  ] = js.undefined
  var params: js.UndefOr[js.Object] = js.undefined
  var raw: js.UndefOr[scala.Boolean] = js.undefined
  var redirect: js.UndefOr[
    zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreLibStrings.manual | zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreLibStrings.error | zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreLibStrings.follow
  ] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

