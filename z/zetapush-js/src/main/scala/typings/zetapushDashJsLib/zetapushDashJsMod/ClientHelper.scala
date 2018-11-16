package typings
package zetapushDashJsLib.zetapushDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientHelper extends js.Object {
  @JSName("authentication")
  var authentication_Original: zetapushDashJsLib.AuthenticationCallback = js.native
  var servers: stdLib.Promise[js.Array[java.lang.String]] = js.native
  def authentication(): js.Any = js.native
  def getUniqRequestId(): java.lang.String = js.native
}

