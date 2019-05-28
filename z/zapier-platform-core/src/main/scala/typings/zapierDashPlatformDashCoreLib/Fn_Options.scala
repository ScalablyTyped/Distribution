package typings
package zapierDashPlatformDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Options extends js.Object {
  def apply(
    options: zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.HttpRequestOptions with (Anon_RawTrue | Anon_Url)
  ): js.Promise[zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.RawHttpResponse] = js.native
  def apply(url: java.lang.String): js.Promise[zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.HttpResponse] = js.native
  // most specific overloads go first
  def apply(
    url: java.lang.String,
    options: (zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.HttpRequestOptions with Anon_Raw) | zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.HttpRequestOptions
  ): js.Promise[zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.RawHttpResponse] = js.native
}

