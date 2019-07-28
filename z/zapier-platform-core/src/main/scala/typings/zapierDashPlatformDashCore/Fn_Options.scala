package typings.zapierDashPlatformDashCore

import typings.zapierDashPlatformDashCore.zapierDashPlatformDashCoreMod.HttpRequestOptions
import typings.zapierDashPlatformDashCore.zapierDashPlatformDashCoreMod.HttpResponse
import typings.zapierDashPlatformDashCore.zapierDashPlatformDashCoreMod.RawHttpResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Options extends js.Object {
  def apply(options: HttpRequestOptions with (Anon_RawTrue | Anon_Url)): js.Promise[RawHttpResponse] = js.native
  def apply(url: String): js.Promise[HttpResponse] = js.native
  // most specific overloads go first
  def apply(url: String, options: (HttpRequestOptions with Anon_Raw) | HttpRequestOptions): js.Promise[RawHttpResponse] = js.native
}

