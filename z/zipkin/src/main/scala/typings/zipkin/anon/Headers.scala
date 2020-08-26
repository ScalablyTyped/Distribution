package typings.zipkin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Headers[H] extends js.Object {
  var headers: H with XB3Flags = js.native
}

object Headers {
  @scala.inline
  def apply[H](headers: H with XB3Flags): Headers[H] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers[H]]
  }
  @scala.inline
  implicit class HeadersOps[Self <: Headers[_], H] (val x: Self with Headers[H]) extends AnyVal {
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
    def setHeaders(value: H with XB3Flags): Self = this.set("headers", value.asInstanceOf[js.Any])
  }
  
}

