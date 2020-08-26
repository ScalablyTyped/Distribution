package typings.zapierPlatformCore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.zapierPlatformCore.mod.HttpMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  method :zapier-platform-core.zapier-platform-core.HttpMethod,   querystring :string,   headers :{[x: string] : string},   content :string}> */
@js.native
trait PartialmethodHttpMethodqu extends js.Object {
  var content: js.UndefOr[String] = js.native
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  var method: js.UndefOr[HttpMethod] = js.native
  var querystring: js.UndefOr[String] = js.native
}

object PartialmethodHttpMethodqu {
  @scala.inline
  def apply(): PartialmethodHttpMethodqu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialmethodHttpMethodqu]
  }
  @scala.inline
  implicit class PartialmethodHttpMethodquOps[Self <: PartialmethodHttpMethodqu] (val x: Self) extends AnyVal {
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
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setMethod(value: HttpMethod): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setQuerystring(value: String): Self = this.set("querystring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuerystring: Self = this.set("querystring", js.undefined)
  }
  
}

