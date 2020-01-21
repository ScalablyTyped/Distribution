package typings.zapierPlatformCore

import org.scalablytyped.runtime.StringDictionary
import typings.zapierPlatformCore.mod.HttpMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContentHeaders extends js.Object {
  var content: StringDictionary[String]
  var headers: StringDictionary[String]
  var method: HttpMethod
  var querystring: StringDictionary[String]
}

object AnonContentHeaders {
  @scala.inline
  def apply(
    content: StringDictionary[String],
    headers: StringDictionary[String],
    method: HttpMethod,
    querystring: StringDictionary[String]
  ): AnonContentHeaders = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], querystring = querystring.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContentHeaders]
  }
}

