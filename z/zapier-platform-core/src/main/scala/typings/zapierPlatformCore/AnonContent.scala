package typings.zapierPlatformCore

import org.scalablytyped.runtime.StringDictionary
import typings.zapierPlatformCore.mod.HttpMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContent extends js.Object {
  var content: String
  var headers: StringDictionary[String]
  var method: HttpMethod
  var querystring: String
}

object AnonContent {
  @scala.inline
  def apply(content: String, headers: StringDictionary[String], method: HttpMethod, querystring: String): AnonContent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], querystring = querystring.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContent]
  }
}

