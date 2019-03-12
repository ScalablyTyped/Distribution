package typings
package zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawHttpResponse extends BaseHttpResponse {
  var body: stdLib.ReadableStream[_]
  var content: nodeLib.Buffer
  var json: js.Promise[js.UndefOr[js.Object]]
}

object RawHttpResponse {
  @scala.inline
  def apply(
    body: stdLib.ReadableStream[_],
    content: nodeLib.Buffer,
    getHeader: java.lang.String => js.UndefOr[java.lang.String],
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    json: js.Promise[js.UndefOr[js.Object]],
    request: HttpRequestOptions,
    status: scala.Double,
    throwForStatus: () => scala.Unit
  ): RawHttpResponse = {
    val __obj = js.Dynamic.literal(body = body, content = content, getHeader = js.Any.fromFunction1(getHeader), headers = headers, json = json, request = request, status = status, throwForStatus = js.Any.fromFunction0(throwForStatus))
  
    __obj.asInstanceOf[RawHttpResponse]
  }
}

