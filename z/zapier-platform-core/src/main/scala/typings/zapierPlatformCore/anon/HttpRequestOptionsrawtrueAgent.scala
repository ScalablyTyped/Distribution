package typings.zapierPlatformCore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.node.httpMod.Agent
import typings.zapierPlatformCore.mod.HttpMethod
import typings.zapierPlatformCore.zapierPlatformCoreBooleans.`true`
import typings.zapierPlatformCore.zapierPlatformCoreStrings.error
import typings.zapierPlatformCore.zapierPlatformCoreStrings.follow
import typings.zapierPlatformCore.zapierPlatformCoreStrings.manual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined zapier-platform-core.zapier-platform-core.HttpRequestOptions & {  raw :true,   url :string} */
@js.native
trait HttpRequestOptionsrawtrueAgent extends js.Object {
  var agent: js.UndefOr[Agent] = js.native
  var body: js.UndefOr[String | Buffer | ReadableStream | js.Object] = js.native
  var compress: js.UndefOr[Boolean] = js.native
  var follow: js.UndefOr[Double] = js.native
  var form: js.UndefOr[js.Object] = js.native
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  var json: js.UndefOr[js.Object | js.Array[_]] = js.native
  var method: js.UndefOr[HttpMethod] = js.native
  var params: js.UndefOr[js.Object] = js.native
  var raw: js.UndefOr[Boolean] with `true` = js.native
  var redirect: js.UndefOr[manual | error | follow] = js.native
  var removeMissingValuesFrom: js.UndefOr[Body] = js.native
  var size: js.UndefOr[Double] = js.native
  var skipThrowForStatus: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var url: js.UndefOr[String] with String = js.native
}

object HttpRequestOptionsrawtrueAgent {
  @scala.inline
  def apply(raw: js.UndefOr[Boolean] with `true`, url: js.UndefOr[String] with String): HttpRequestOptionsrawtrueAgent = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpRequestOptionsrawtrueAgent]
  }
  @scala.inline
  implicit class HttpRequestOptionsrawtrueAgentOps[Self <: HttpRequestOptionsrawtrueAgent] (val x: Self) extends AnyVal {
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
    def setRaw(value: js.UndefOr[Boolean] with `true`): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: js.UndefOr[String] with String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setAgent(value: Agent): Self = this.set("agent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    @scala.inline
    def setBody(value: String | Buffer | ReadableStream | js.Object): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setCompress(value: Boolean): Self = this.set("compress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompress: Self = this.set("compress", js.undefined)
    @scala.inline
    def setFollow(value: Double): Self = this.set("follow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollow: Self = this.set("follow", js.undefined)
    @scala.inline
    def setForm(value: js.Object): Self = this.set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setJsonVarargs(value: js.Any*): Self = this.set("json", js.Array(value :_*))
    @scala.inline
    def setJson(value: js.Object | js.Array[_]): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    @scala.inline
    def setMethod(value: HttpMethod): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setParams(value: js.Object): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setRedirect(value: manual | error | follow): Self = this.set("redirect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirect: Self = this.set("redirect", js.undefined)
    @scala.inline
    def setRemoveMissingValuesFrom(value: Body): Self = this.set("removeMissingValuesFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveMissingValuesFrom: Self = this.set("removeMissingValuesFrom", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSkipThrowForStatus(value: Boolean): Self = this.set("skipThrowForStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipThrowForStatus: Self = this.set("skipThrowForStatus", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

