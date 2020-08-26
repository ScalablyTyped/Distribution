package typings.zapierPlatformCore.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpResponse extends BaseHttpResponse {
  var content: String = js.native
  var data: js.UndefOr[js.Object] = js.native
  var json: js.UndefOr[js.Object] = js.native
}

object HttpResponse {
  @scala.inline
  def apply(
    content: String,
    getHeader: String => js.UndefOr[String],
    headers: StringDictionary[String],
    request: HttpRequestOptions,
    skipThrowForStatus: Boolean,
    status: Double,
    throwForStatus: () => Unit
  ): HttpResponse = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], getHeader = js.Any.fromFunction1(getHeader), headers = headers.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], skipThrowForStatus = skipThrowForStatus.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], throwForStatus = js.Any.fromFunction0(throwForStatus))
    __obj.asInstanceOf[HttpResponse]
  }
  @scala.inline
  implicit class HttpResponseOps[Self <: HttpResponse] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setJson(value: js.Object): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
  }
  
}

