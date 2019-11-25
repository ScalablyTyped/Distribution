package typings.zapierDashPlatformDashCore

import org.scalablytyped.runtime.StringDictionary
import typings.zapierDashPlatformDashCore.zapierDashPlatformDashCoreMod.HttpMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentHeaders extends js.Object {
  var content: StringDictionary[String]
  var headers: StringDictionary[String]
  var method: HttpMethod
  var querystring: StringDictionary[String]
}

object Anon_ContentHeaders {
  @scala.inline
  def apply(
    content: StringDictionary[String],
    headers: StringDictionary[String],
    method: HttpMethod,
    querystring: StringDictionary[String]
  ): Anon_ContentHeaders = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], querystring = querystring.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ContentHeaders]
  }
}

