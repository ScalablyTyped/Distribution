package typings
package zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseHttpResponse extends js.Object {
  var headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var request: HttpRequestOptions
  var status: scala.Double
  def getHeader(key: java.lang.String): js.UndefOr[java.lang.String]
  def throwForStatus(): scala.Unit
}

object BaseHttpResponse {
  @scala.inline
  def apply(
    getHeader: java.lang.String => js.UndefOr[java.lang.String],
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    request: HttpRequestOptions,
    status: scala.Double,
    throwForStatus: () => scala.Unit
  ): BaseHttpResponse = {
    val __obj = js.Dynamic.literal(getHeader = js.Any.fromFunction1(getHeader), headers = headers, request = request, status = status, throwForStatus = js.Any.fromFunction0(throwForStatus))
  
    __obj.asInstanceOf[BaseHttpResponse]
  }
}

