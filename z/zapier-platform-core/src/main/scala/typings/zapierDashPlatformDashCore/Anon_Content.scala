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
    val __obj = js.Dynamic.literal(content = content, headers = headers, method = method, querystring = querystring)
  
    __obj.asInstanceOf[Anon_Content]
  }
}

