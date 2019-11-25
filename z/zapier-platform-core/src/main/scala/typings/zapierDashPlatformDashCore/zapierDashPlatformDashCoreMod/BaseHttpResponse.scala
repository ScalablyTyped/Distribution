package typings.zapierDashPlatformDashCore.zapierDashPlatformDashCoreMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseHttpResponse extends js.Object {
  var headers: StringDictionary[String]
  var request: HttpRequestOptions
  var status: Double
  def getHeader(key: String): js.UndefOr[String]
  def throwForStatus(): Unit
}

object BaseHttpResponse {
  @scala.inline
  def apply(
    getHeader: String => js.UndefOr[String],
    headers: StringDictionary[String],
    request: HttpRequestOptions,
    status: Double,
    throwForStatus: () => Unit
  ): BaseHttpResponse = {
    val __obj = js.Dynamic.literal(getHeader = js.Any.fromFunction1(getHeader), headers = headers.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], throwForStatus = js.Any.fromFunction0(throwForStatus))
  
    __obj.asInstanceOf[BaseHttpResponse]
  }
}

