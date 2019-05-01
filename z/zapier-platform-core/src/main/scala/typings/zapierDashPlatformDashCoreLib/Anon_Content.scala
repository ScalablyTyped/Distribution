package typings
package zapierDashPlatformDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var content: java.lang.String
  var headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var method: zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.HttpMethod
  var querystring: java.lang.String
}

object Anon_Content {
  @scala.inline
  def apply(
    content: java.lang.String,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    method: zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.HttpMethod,
    querystring: java.lang.String
  ): Anon_Content = {
    val __obj = js.Dynamic.literal(content = content, headers = headers, method = method, querystring = querystring)
  
    __obj.asInstanceOf[Anon_Content]
  }
}

