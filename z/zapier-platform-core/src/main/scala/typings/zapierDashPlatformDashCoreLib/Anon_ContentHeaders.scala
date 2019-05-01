package typings
package zapierDashPlatformDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentHeaders extends js.Object {
  var content: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var method: zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.HttpMethod
  var querystring: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object Anon_ContentHeaders {
  @scala.inline
  def apply(
    content: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    method: zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.HttpMethod,
    querystring: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): Anon_ContentHeaders = {
    val __obj = js.Dynamic.literal(content = content, headers = headers, method = method, querystring = querystring)
  
    __obj.asInstanceOf[Anon_ContentHeaders]
  }
}

