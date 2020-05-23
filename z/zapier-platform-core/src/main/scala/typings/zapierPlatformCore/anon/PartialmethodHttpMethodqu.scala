package typings.zapierPlatformCore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.zapierPlatformCore.mod.HttpMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  method  :zapier-platform-core.zapier-platform-core.HttpMethod,   querystring  :string,   headers  :{[x: string] : string},   content  :string}> */
trait PartialmethodHttpMethodqu extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var method: js.UndefOr[HttpMethod] = js.undefined
  var querystring: js.UndefOr[String] = js.undefined
}

object PartialmethodHttpMethodqu {
  @scala.inline
  def apply(
    content: String = null,
    headers: StringDictionary[String] = null,
    method: HttpMethod = null,
    querystring: String = null
  ): PartialmethodHttpMethodqu = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (querystring != null) __obj.updateDynamic("querystring")(querystring.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialmethodHttpMethodqu]
  }
}

