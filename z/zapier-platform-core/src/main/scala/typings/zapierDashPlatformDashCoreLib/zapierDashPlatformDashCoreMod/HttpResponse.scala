package typings
package zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpResponse extends BaseHttpResponse {
  var content: java.lang.String
  var json: js.UndefOr[js.Object] = js.undefined
}

object HttpResponse {
  @scala.inline
  def apply(
    content: java.lang.String,
    getHeader: java.lang.String => js.UndefOr[java.lang.String],
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    request: HttpRequestOptions,
    status: scala.Double,
    throwForStatus: () => scala.Unit,
    json: js.Object = null
  ): HttpResponse = {
    val __obj = js.Dynamic.literal(content = content, getHeader = js.Any.fromFunction1(getHeader), headers = headers, request = request, status = status, throwForStatus = js.Any.fromFunction0(throwForStatus))
    if (json != null) __obj.updateDynamic("json")(json)
    __obj.asInstanceOf[HttpResponse]
  }
}

