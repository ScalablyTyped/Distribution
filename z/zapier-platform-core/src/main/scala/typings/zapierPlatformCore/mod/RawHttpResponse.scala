package typings.zapierPlatformCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawHttpResponse extends BaseHttpResponse {
  var body: ReadableStream = js.native
  var content: Buffer = js.native
  var json: js.Promise[js.UndefOr[js.Object]] = js.native
}

object RawHttpResponse {
  @scala.inline
  def apply(
    body: ReadableStream,
    content: Buffer,
    getHeader: String => js.UndefOr[String],
    headers: StringDictionary[String],
    json: js.Promise[js.UndefOr[js.Object]],
    request: HttpRequestOptions,
    skipThrowForStatus: Boolean,
    status: Double,
    throwForStatus: () => Unit
  ): RawHttpResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], getHeader = js.Any.fromFunction1(getHeader), headers = headers.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], skipThrowForStatus = skipThrowForStatus.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], throwForStatus = js.Any.fromFunction0(throwForStatus))
    __obj.asInstanceOf[RawHttpResponse]
  }
  @scala.inline
  implicit class RawHttpResponseOps[Self <: RawHttpResponse] (val x: Self) extends AnyVal {
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
    def setBody(value: ReadableStream): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: Buffer): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setJson(value: js.Promise[js.UndefOr[js.Object]]): Self = this.set("json", value.asInstanceOf[js.Any])
  }
  
}

