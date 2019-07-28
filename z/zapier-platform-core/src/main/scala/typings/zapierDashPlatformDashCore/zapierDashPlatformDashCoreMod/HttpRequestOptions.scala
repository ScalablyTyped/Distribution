package typings.zapierDashPlatformDashCore.zapierDashPlatformDashCoreMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.httpMod.Agent
import typings.std.ReadableStream
import typings.zapierDashPlatformDashCore.Anon_Body
import typings.zapierDashPlatformDashCore.zapierDashPlatformDashCoreStrings.error
import typings.zapierDashPlatformDashCore.zapierDashPlatformDashCoreStrings.follow
import typings.zapierDashPlatformDashCore.zapierDashPlatformDashCoreStrings.manual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpRequestOptions extends js.Object {
  var agent: js.UndefOr[Agent] = js.undefined
  var body: js.UndefOr[String | Buffer | ReadableStream[_] | js.Object] = js.undefined
  var compress: js.UndefOr[Boolean] = js.undefined
  var follow: js.UndefOr[Double] = js.undefined
  var form: js.UndefOr[js.Object] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var json: js.UndefOr[js.Object | js.Array[_]] = js.undefined
  var method: js.UndefOr[HttpMethod] = js.undefined
  var params: js.UndefOr[js.Object] = js.undefined
  var raw: js.UndefOr[Boolean] = js.undefined
  var redirect: js.UndefOr[manual | error | follow] = js.undefined
  var removeMissingValuesFrom: js.UndefOr[Anon_Body] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object HttpRequestOptions {
  @scala.inline
  def apply(
    agent: Agent = null,
    body: String | Buffer | ReadableStream[_] | js.Object = null,
    compress: js.UndefOr[Boolean] = js.undefined,
    follow: Int | Double = null,
    form: js.Object = null,
    headers: StringDictionary[String] = null,
    json: js.Object | js.Array[_] = null,
    method: HttpMethod = null,
    params: js.Object = null,
    raw: js.UndefOr[Boolean] = js.undefined,
    redirect: manual | error | follow = null,
    removeMissingValuesFrom: Anon_Body = null,
    size: Int | Double = null,
    timeout: Int | Double = null,
    url: String = null
  ): HttpRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress)
    if (follow != null) __obj.updateDynamic("follow")(follow.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (params != null) __obj.updateDynamic("params")(params)
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (removeMissingValuesFrom != null) __obj.updateDynamic("removeMissingValuesFrom")(removeMissingValuesFrom)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[HttpRequestOptions]
  }
}

