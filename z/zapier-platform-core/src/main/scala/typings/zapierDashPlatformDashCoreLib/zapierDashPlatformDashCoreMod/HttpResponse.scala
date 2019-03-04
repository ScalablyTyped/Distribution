package typings
package zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpResponse extends js.Object {
  var body: js.UndefOr[nodeLib.NodeJSNs.ReadableStream] = js.undefined
  var content: java.lang.String | nodeLib.Buffer
  var headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var json: js.UndefOr[js.Object | js.Promise[js.UndefOr[js.Object]]]
  var request: HttpRequestOptions
  var status: scala.Double
  def getHeader(key: java.lang.String): js.UndefOr[java.lang.String]
  def throwForStatus(): scala.Unit
}

object HttpResponse {
  @scala.inline
  def apply(
    content: java.lang.String | nodeLib.Buffer,
    getHeader: js.Function1[java.lang.String, js.UndefOr[java.lang.String]],
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    request: HttpRequestOptions,
    status: scala.Double,
    throwForStatus: js.Function0[scala.Unit],
    body: nodeLib.NodeJSNs.ReadableStream = null,
    json: js.Object | js.Promise[js.UndefOr[js.Object]] = null
  ): HttpResponse = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], getHeader = getHeader, headers = headers, request = request, status = status, throwForStatus = throwForStatus)
    if (body != null) __obj.updateDynamic("body")(body)
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpResponse]
  }
}

