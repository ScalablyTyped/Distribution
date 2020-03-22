package typings.zapierPlatformCore

import org.scalablytyped.runtime.StringDictionary
import typings.zapierPlatformCore.mod.HttpMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  method  :zapier-platform-core.zapier-platform-core.HttpMethod,   querystring  :{[x: string] : string},   headers  :{[x: string] : string},   content  :{[x: string] : string}}> */
trait PartialmethodHttpMethodquContent extends js.Object {
  var content: js.UndefOr[StringDictionary[String]] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var method: js.UndefOr[HttpMethod] = js.undefined
  var querystring: js.UndefOr[StringDictionary[String]] = js.undefined
}

object PartialmethodHttpMethodquContent {
  @scala.inline
  def apply(
    content: StringDictionary[String] = null,
    headers: StringDictionary[String] = null,
    method: HttpMethod = null,
    querystring: StringDictionary[String] = null
  ): PartialmethodHttpMethodquContent = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (querystring != null) __obj.updateDynamic("querystring")(querystring.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialmethodHttpMethodquContent]
  }
}

