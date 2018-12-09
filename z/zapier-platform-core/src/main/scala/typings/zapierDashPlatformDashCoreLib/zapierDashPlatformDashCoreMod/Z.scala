package typings
package zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Z extends js.Object {
  var JSON: stdLib.JSON = js.native
  var console: nodeLib.Console = js.native
  var errors: zapierDashPlatformDashCoreLib.Anon_RefreshAuthError = js.native
  def dehydrate[T](callback: js.Function2[/* z */ this.type, /* bundle */ Bundle[T], _], inputData: T): java.lang.String = js.native
  def hash(alg: java.lang.String, data: java.lang.String): js.Any = js.native
  def request(options: HttpRequestOptions): js.Promise[HttpResponse] = js.native
  def request(url: java.lang.String): js.Promise[HttpResponse] = js.native
  def request(url: java.lang.String, options: HttpRequestOptions): js.Promise[HttpResponse] = js.native
  def stashFile(promise: js.Promise[HttpResponse]): js.Promise[java.lang.String] = js.native
  def stashFile(promise: js.Promise[HttpResponse], knownLength: java.lang.String): js.Promise[java.lang.String] = js.native
  def stashFile(promise: js.Promise[HttpResponse], knownLength: java.lang.String, filename: java.lang.String): js.Promise[java.lang.String] = js.native
  def stashFile(
    promise: js.Promise[HttpResponse],
    knownLength: java.lang.String,
    filename: java.lang.String,
    contentType: java.lang.String
  ): js.Promise[java.lang.String] = js.native
  def stashFile(promise: js.Promise[HttpResponse], knownLength: scala.Double): js.Promise[java.lang.String] = js.native
  def stashFile(promise: js.Promise[HttpResponse], knownLength: scala.Double, filename: java.lang.String): js.Promise[java.lang.String] = js.native
  def stashFile(
    promise: js.Promise[HttpResponse],
    knownLength: scala.Double,
    filename: java.lang.String,
    contentType: java.lang.String
  ): js.Promise[java.lang.String] = js.native
}

