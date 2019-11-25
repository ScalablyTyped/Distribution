package typings.zapierDashPlatformDashCore

import org.scalablytyped.runtime.StringDictionary
import typings.zapierDashPlatformDashCore.zapierDashPlatformDashCoreMod.HttpMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var content: String
  var headers: StringDictionary[String]
  var method: HttpMethod
  var querystring: String
}

object Anon_Content {
  @scala.inline
  def apply(content: String, headers: StringDictionary[String], method: HttpMethod, querystring: String): Anon_Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], querystring = querystring.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Content]
  }
}

