package typings.zapierPlatformCore.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpResponse extends BaseHttpResponse {
  var content: String
  var json: js.UndefOr[js.Object] = js.undefined
}

object HttpResponse {
  @scala.inline
  def apply(
    content: String,
    getHeader: String => js.UndefOr[String],
    headers: StringDictionary[String],
    request: HttpRequestOptions,
    status: Double,
    throwForStatus: () => Unit,
    json: js.Object = null
  ): HttpResponse = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], getHeader = js.Any.fromFunction1(getHeader), headers = headers.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], throwForStatus = js.Any.fromFunction0(throwForStatus))
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpResponse]
  }
}

